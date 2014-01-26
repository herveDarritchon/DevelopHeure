package com.orange.librarypackage.library.application.impl;

import java.util.List;
import java.util.Map;

import com.orange.librarypackage.library.application.ManageMarket;
import com.orange.librarypackage.library.business.ManageMarketBusiness;
import com.orange.librarypackage.library.model.MarketBean;
import com.orange.librarypackage.library.technicalservice.exception.InvalidMarketException;
import com.orange.librarypackage.library.technicalservice.exception.NotFoundException;
import com.orange.librarypackage.library.technicalservice.exception.TechnicalException;

/**
 * application implementation for market component
 * 
 * NB: in this small example, the application layer does nothing except
 * forwarding to business layer. In more complex applications, this layer should
 * prepare all data for specific application provider.
 * 
 * NB : all the methods in this class are transactional (see
 * transactionContext.xml spring configuration). We should also use the @Transactional
 * annotation.
 * 
 * 
 * @author Clara
 */
public class ManageMarketImpl implements ManageMarket {

	private ManageMarketBusiness manageMarketBusiness;

	/**
	 * MarketBusiness setter filled by dependency injection
	 * 
	 * @param marketBusiness
	 *            the marketBusiness to inject
	 */
	public void setManageMarketBusiness(
			ManageMarketBusiness manageMarketBusiness) {
		this.manageMarketBusiness = manageMarketBusiness;
	}

    /**
     * {@inheritDoc}
     */	
	@Override
	public Map<Integer, MarketBean> findAllMarkets() throws NotFoundException,
			TechnicalException {

		Map<Integer, MarketBean> marketBeanMap = manageMarketBusiness
				.findAllMarkets();

		return marketBeanMap;

	}

    /**
     * {@inheritDoc}
     */	
	@Override
	public List<MarketBean> findMarketByName(String name)
			throws NotFoundException, TechnicalException {
		List<MarketBean> marketBeanList = manageMarketBusiness
				.getMarketByName(name);
		return marketBeanList;
	}

    /**
     * {@inheritDoc}
     */	
	@Override
	public Integer createMarket(MarketBean market) throws InvalidMarketException,
			TechnicalException {
		 Integer idCreated = manageMarketBusiness.createMarket(market);
		 return idCreated;
	}

    /**
     * {@inheritDoc}
     */	
	@Override
	public void modifyMarket(MarketBean market) throws InvalidMarketException, 
			TechnicalException, NotFoundException {
		manageMarketBusiness.modifyMarket(market);
	}

    /**
     * {@inheritDoc}
     */	
	@Override
	public void deleteMarket(int idMarket) throws InvalidMarketException,
			TechnicalException {
		manageMarketBusiness.deleteMarket(idMarket);
	}

    /**
     * {@inheritDoc}
     */	
	@Override
	public MarketBean consultMarket(int idMarket)
			throws InvalidMarketException, NotFoundException {
		return manageMarketBusiness.getMarket(idMarket);
	}
}