package com.orange.librarypackage.library.consumersoap.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.xml.ws.WebServiceException;

import com.orange.librarypackage.consumersoap.model.MarcheSoap;
import com.orange.librarypackage.consumersoap.service.ErreurMarcheInvalideFault;
import com.orange.librarypackage.consumersoap.service.ErreurMarcheNonTrouveFault;
import com.orange.librarypackage.consumersoap.service.ErreurTechniqueFault;
import com.orange.librarypackage.consumersoap.service.GererMarcheSoap;
import com.orange.librarypackage.library.consumersoap.GererMarche;
import com.orange.librarypackage.library.consumersoap.mapping.MapperSoap;
import com.orange.librarypackage.library.model.MarketBean;
import com.orange.librarypackage.library.technicalservice.exception.InvalidMarketException;
import com.orange.librarypackage.library.technicalservice.exception.NotFoundException;
import com.orange.librarypackage.library.technicalservice.exception.TechnicalException;


/**
 * Web service consummer for gerer marche
 * 
 * @author Clara
 * 
 */
public class GererMarcheImpl implements GererMarche {

	private static final Logger log = Logger.getLogger(GererMarcheImpl.class.getName());

	private GererMarcheSoap gererMarcheSoapProxy; 
	
	private MapperSoap mapperSoap;

	/**
	 * dependency injection
	 * 
	 * @param gererMarcheSoap
	 *            gerer marche webservice client
	 */
	public void setGererMarcheSoapProxy(GererMarcheSoap gererMarcheSoapProxy) {
		this.gererMarcheSoapProxy = gererMarcheSoapProxy;
	}

	/**
	 * dependency injection
	 * 
	 * @param mapper dozer mapping
	 */
	public void setMapperSoap(MapperSoap mapperSoap) {
		this.mapperSoap = mapperSoap;
	}


    /**
     * {@inheritDoc}
     */	
	@Override
	public void modifyMarket(MarketBean market) throws InvalidMarketException, NotFoundException, TechnicalException {
		log.info("Executing operation modifyMarket");

		try {
			
			MarcheSoap marcheSoap = (MarcheSoap)mapperSoap.map(market, MarcheSoap.class);
			gererMarcheSoapProxy.modifierMarche(marcheSoap);			

		} catch (ErreurTechniqueFault e) {
			// maps to TechnicalException
			throw mapperSoap.map(e);
		} catch (ErreurMarcheNonTrouveFault e) {
			// map to NotFoundException
			throw mapperSoap.map(e);
		} catch (ErreurMarcheInvalideFault e) {
			// map to InvalidMarketException
			throw mapperSoap.map(e);
		}catch (WebServiceException e) {
			log.info("a timeout exception has occured: " );
			throw new TechnicalException(e.getMessage(), e.getCause());
		}
	}

    /**
     * {@inheritDoc}
     */	
	@Override
	public Map<Integer, MarketBean> findAllMarkets() throws NotFoundException, TechnicalException {
		log.info("Executing operation findAllMarkets");
		
		Map<Integer, MarketBean> mapOfMarket = new HashMap<Integer, MarketBean>();
		
		try {

			List<MarcheSoap> listOfMarcheSoap = gererMarcheSoapProxy.rechercherMarches();
			for (MarcheSoap bean : listOfMarcheSoap) {
				mapOfMarket.put(bean.getId(), mapperSoap.map(bean, MarketBean.class));
			}

		} catch (ErreurTechniqueFault e) {
			// maps to TechnicalException
			throw mapperSoap.map(e);
		} catch (ErreurMarcheNonTrouveFault e) {
			// map to NotFoundException
			throw mapperSoap.map(e);
		}catch (WebServiceException e) {
			log.info("a timeout exception has occured: " );
			throw new TechnicalException(e.getMessage(), e.getCause());
		}

		return mapOfMarket;
	}

	
    /**
     * {@inheritDoc}
     */	
	@Override
	public List<MarketBean> findMarketByName(String name) throws NotFoundException, TechnicalException {
		log.info("Executing operation findMarketByName : " + name);
	
		List<MarketBean> listOfMarkets = new ArrayList<MarketBean>();

		try {

			List<MarcheSoap> listOfMarcheSoap = gererMarcheSoapProxy.rechercherMarchesParNom(name);
			for (MarcheSoap bean : listOfMarcheSoap) {
				listOfMarkets.add(mapperSoap.map(bean, MarketBean.class));
			}
			
		} catch (ErreurTechniqueFault e) {
			// maps to TechnicalException
			throw mapperSoap.map(e);
		} catch (ErreurMarcheNonTrouveFault e) {
			// map to NotFoundException
			throw mapperSoap.map(e);
		} catch (WebServiceException e) {
			log.info("a timeout exception has occured: " );
			throw new TechnicalException(e.getMessage(), e.getCause());
		}
		
		return listOfMarkets;
	}

	
    /**
     * {@inheritDoc}
     */	
	@Override
	public MarketBean consultMarket(int idMarket) throws NotFoundException, TechnicalException {
		log.info("Executing operation consultMarket");

		MarketBean marketBean = null;

		try {
			
			MarcheSoap marcheSoap = gererMarcheSoapProxy.consulterMarche(idMarket);
			marketBean = (MarketBean)mapperSoap.map(marcheSoap, MarketBean.class);
			
		} catch (ErreurTechniqueFault e) {
			// maps to TechnicalException
			throw mapperSoap.map(e);
		} catch (ErreurMarcheNonTrouveFault e) {
			// map to NotFoundException
			throw mapperSoap.map(e);
		} catch (WebServiceException e) {
			log.info("a timeout exception has occured: " );
			throw new TechnicalException(e.getMessage(), e.getCause());
		}
		
		return marketBean;	
	}
	
    /**
     * {@inheritDoc}
     */	
	@Override
	public void createMarket(MarketBean market) throws InvalidMarketException, TechnicalException {
		log.info("Executing operation createMarket");

		try {
			
			MarcheSoap marcheSoap = (MarcheSoap)mapperSoap.map(market, MarcheSoap.class);
			gererMarcheSoapProxy.creerMarche(marcheSoap);

		} catch (ErreurTechniqueFault e) {
			// maps to TechnicalException
			throw mapperSoap.map(e);
		} catch (ErreurMarcheInvalideFault e) {
			// map to InvalidMarketException
			throw mapperSoap.map(e);
		} catch (WebServiceException e) {
			log.info("a timeout exception has occured: " );
			throw new TechnicalException(e.getMessage(), e.getCause());
		}
	}

    /**
     * {@inheritDoc}
     */	
	@Override
	public void deleteMarket(int id) throws InvalidMarketException, TechnicalException {
		log.info("Executing operation deleteMarket");
		
		try {

			gererMarcheSoapProxy.supprimerMarche(id);

		} catch (ErreurTechniqueFault e) {
			// maps to TechnicalException
			throw mapperSoap.map(e);
		} catch (ErreurMarcheInvalideFault e) {
			// map to InvalidMarketException
			throw mapperSoap.map(e);
		} catch (WebServiceException e) {
			log.info("a timeout exception has occured: " );
			throw new TechnicalException(e.getMessage(), e.getCause());
		}
	}

}
