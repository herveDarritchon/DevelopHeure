package com.orange.library.library.business.impl;

import java.util.List;
import java.util.Map;

//import org.apache.log4j.Logger;

import com.orange.library.library.business.ManageMarketBusiness;
import com.orange.library.library.consumersoap.GererMarche;
import com.orange.library.library.model.MarketBean;
import com.orange.library.library.technicalservice.exception.InvalidMarketException;
import com.orange.library.library.technicalservice.exception.NotFoundException;
import com.orange.library.library.technicalservice.exception.TechnicalException;

/**
 * Business implementation for Market component
 * 
 * @author Clara
 */
public class ManageMarketBusinessImpl implements ManageMarketBusiness {

//	private static final Logger log = Logger.getLogger(ManageMarketBusinessImpl.class);

	private GererMarche gererMarche = null;

	/**
	 * GererMarche setter filled by dependency injection
	 * 
	 * @param gererMarche
	 *            the gererMarche to inject
	 */
	public void setGererMarche(GererMarche gererMarche) {
		this.gererMarche = gererMarche;
	}

    /**
     * {@inheritDoc}
     */	
	@Override
	public Map<Integer, MarketBean> findAllMarkets() throws NotFoundException, TechnicalException {
		Map<Integer, MarketBean> marketBeanMap = gererMarche.findAllMarkets();
		return marketBeanMap;
	}

    /**
     * {@inheritDoc}
     */	
	@Override
	public Integer createMarket(MarketBean marketBean) throws InvalidMarketException, TechnicalException {	
		gererMarche.createMarket(marketBean);
		return null;
	}

    /**
     * {@inheritDoc}
     */	
	@Override
	public void modifyMarket(MarketBean marketBean) throws InvalidMarketException, NotFoundException, TechnicalException {		
		gererMarche.modifyMarket(marketBean);
	}

    /**
     * {@inheritDoc}
     */	
	@Override
	public void deleteMarket(Integer idMarket) throws InvalidMarketException, TechnicalException {		
		gererMarche.deleteMarket(idMarket);		
	}

    /**
     * {@inheritDoc}
     */	
	@Override
	public MarketBean getMarket(Integer idMarket) throws NotFoundException, TechnicalException {
		MarketBean marketBean = gererMarche.consultMarket(idMarket);		
		return marketBean;
	}

    /**
     * {@inheritDoc}
     */	
	@Override
	public List<MarketBean> getMarketByName(String name) throws NotFoundException, TechnicalException {
		List<MarketBean> listMarkets = gererMarche.findMarketByName(name);		
		return listMarkets;
	}

}