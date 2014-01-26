package com.orange.librarypackage.library.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.orange.librarypackage.library.business.impl.ManageMarketBusinessImpl;
import com.orange.librarypackage.library.consumersoap.GererMarche;
import com.orange.librarypackage.library.model.MarketBean;
import com.orange.librarypackage.library.technicalservice.exception.InvalidMarketException;
import com.orange.librarypackage.library.technicalservice.exception.NotFoundException;
import com.orange.librarypackage.library.technicalservice.exception.TechnicalException;

public class ManageMarketBusinessTest {

	private ManageMarketBusinessImpl manageMarketBusiness;

	private GererMarche gererMarcheConsumerSoapMock;

	/**
	 * setup unit test
	 */
	@Before
	public void setup() {
		// Application layer class to be tested
		manageMarketBusiness = new ManageMarketBusinessImpl();

		// Consumer soap layer class mock
		gererMarcheConsumerSoapMock = mock(GererMarche.class, "gererMarcheConsumerSoap Mock");

		// dependency injection
		manageMarketBusiness.setGererMarche(gererMarcheConsumerSoapMock);
	}

	/**
	 * Test method for searching markets
	 * 
	 * @see com.orange.library.library.business.GererMarche#findAllMarkets
	 */
	@Test
	public void testFindAllMarkets() throws NotFoundException, TechnicalException {
		// setup
		MarketBean marketBean1 = new MarketBean(1, "name1", "description1");
		MarketBean marketBean2 = new MarketBean(2, "name2", "description2");
		Map<Integer, MarketBean> mapMock = new HashMap<Integer, MarketBean>();
		mapMock.put(marketBean1.getId(), marketBean1);
		mapMock.put(marketBean2.getId(), marketBean2);

		when(gererMarcheConsumerSoapMock.findAllMarkets()).thenReturn(mapMock);

		// execution
		Map<Integer, MarketBean> resultList = manageMarketBusiness.findAllMarkets();

		// verification
		assertNotNull(resultList);
		assertEquals("size", 2, resultList.size());
		assertEquals("id", marketBean1.getId(), resultList.get(1).getId());
		assertEquals("name", marketBean1.getName(), resultList.get(1).getName());
		assertEquals("description", marketBean1.getDescription(), resultList.get(1).getDescription());
	}

	/**
	 * Test method for empty market List
	 * 
	 * @see com.orange.library.library.business.GererMarche#findAllMarkets()
	 */
	@Test(expected = NotFoundException.class)
	public void testFindAllMarketsEmpty() throws NotFoundException, TechnicalException {
		// setup
		when(gererMarcheConsumerSoapMock.findAllMarkets()).thenThrow(new NotFoundException("No market found"));

		// execution
		manageMarketBusiness.findAllMarkets();
	}

	/**
	 * Test method for market creation
	 * 
	 * @see com.orange.library.library.business.GererMarche#createMarket(MarketBean)
	 */
	@Test
	public void testCreateMarket() throws InvalidMarketException, TechnicalException {

		MarketBean marketBean = new MarketBean(1, "mock name", "mock description");
		manageMarketBusiness.createMarket(marketBean);

		verify(gererMarcheConsumerSoapMock).createMarket(marketBean);

	}
}