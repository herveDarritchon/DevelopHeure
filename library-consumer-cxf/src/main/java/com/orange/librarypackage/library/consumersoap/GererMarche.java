package com.orange.librarypackage.library.consumersoap;

import java.util.List;
import java.util.Map;

import com.orange.librarypackage.library.model.MarketBean;
import com.orange.librarypackage.library.technicalservice.exception.InvalidMarketException;
import com.orange.librarypackage.library.technicalservice.exception.NotFoundException;
import com.orange.librarypackage.library.technicalservice.exception.TechnicalException;


/**
 * application interface for market component
 * 
 * @author Clara
 */
public interface GererMarche {

	/**
	 * Find all markets
	 * 
	 * @return Map of markets
	 * @throws NotFoundException
	 *             if no market found
	 * @throws TechnicalException
	 *             if data access error
	 */
	Map<Integer, MarketBean> findAllMarkets() throws NotFoundException, TechnicalException;

	/**
	 * find market which name contains parameter
	 * 
	 * @param name
	 *            String used to search for market names
	 * @return List of market beans
	 * @throws NotFoundException
	 *             if no market found
	 * @throws TechnicalException
	 *             if data access error
	 */
	List<MarketBean> findMarketByName(String name) throws NotFoundException, TechnicalException;

	/**
	 * Create market
	 * 
	 * @param MarketBean
	 *            a market
	 * @throws InvalidMarketException
	 *             if market already exists
	 * @throws TechnicalException
	 *             if data access error
	 */
	void createMarket(MarketBean market) throws InvalidMarketException, TechnicalException;

	/**
	 * Modify market
	 * 
	 * @param MarketBean
	 *            a market
	 * @throws InvalidMarketException
	 *             if market update fails
	 * @throws NotFoundException
	 *             if market does not exist
	 * @throws TechnicalException
	 *             if data access error
	 */
	void modifyMarket(MarketBean market) throws InvalidMarketException, NotFoundException, TechnicalException;

	/**
	 * Delete market
	 * 
	 * @param idMarket
	 *            market id
	 * @throws InvalidMarketException
	 *             if market deletion fails
	 * @throws TechnicalException
	 *             if data access error
	 */
	void deleteMarket(int idMarket) throws InvalidMarketException, TechnicalException;

	/**
	 * Consult market
	 * 
	 * @param idMarket
	 *            market id
	 * @throws NotFoundException
	 *             if market does not exist
	 * @throws TechnicalException
	 *             if data access error
	 */
	MarketBean consultMarket(int idMarket) throws NotFoundException, TechnicalException;
}