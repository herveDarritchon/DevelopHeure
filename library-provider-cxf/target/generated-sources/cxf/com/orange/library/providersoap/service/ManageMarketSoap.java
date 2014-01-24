package com.orange.library.providersoap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2014-01-24T17:12:03.929+01:00
 * Generated source version: 2.7.5
 * 
 */
@WebService(targetNamespace = "http://www.orange.com/Interfaces/ManageMarket/v1", name = "ManageMarketSoap")
@XmlSeeAlso({ObjectFactory.class, com.orange.library.providersoap.model.ObjectFactory.class, com.orange.library.providersoap.exception.ObjectFactory.class})
public interface ManageMarketSoap {

    @RequestWrapper(localName = "deleteMarket", targetNamespace = "http://www.orange.com/Interfaces/ManageMarket/v1", className = "com.orange.library.providersoap.service.DeleteMarket")
    @WebMethod
    @ResponseWrapper(localName = "deleteMarketResponse", targetNamespace = "http://www.orange.com/Interfaces/ManageMarket/v1", className = "com.orange.library.providersoap.service.DeleteMarketResponse")
    public void deleteMarket(
        @WebParam(name = "id", targetNamespace = "http://www.orange.com/Interfaces/ManageMarket/v1")
        int id
    ) throws TechnicalErrorFault, InvalidMarketErrorFault;

    @WebResult(name = "findAllMarketsReturn", targetNamespace = "http://www.orange.com/Interfaces/ManageMarket/v1")
    @RequestWrapper(localName = "findAllMarkets", targetNamespace = "http://www.orange.com/Interfaces/ManageMarket/v1", className = "com.orange.library.providersoap.service.FindAllMarkets")
    @WebMethod
    @ResponseWrapper(localName = "findAllMarketsResponse", targetNamespace = "http://www.orange.com/Interfaces/ManageMarket/v1", className = "com.orange.library.providersoap.service.FindAllMarketsResponse")
    public java.util.List<com.orange.library.providersoap.model.MarketSoap> findAllMarkets() throws TechnicalErrorFault, NotFoundErrorFault;

    @RequestWrapper(localName = "createMarket", targetNamespace = "http://www.orange.com/Interfaces/ManageMarket/v1", className = "com.orange.library.providersoap.service.CreateMarket")
    @WebMethod
    @ResponseWrapper(localName = "createMarketResponse", targetNamespace = "http://www.orange.com/Interfaces/ManageMarket/v1", className = "com.orange.library.providersoap.service.CreateMarketResponse")
    public void createMarket(
        @WebParam(name = "market", targetNamespace = "http://www.orange.com/Interfaces/ManageMarket/v1")
        com.orange.library.providersoap.model.MarketSoap market
    ) throws TechnicalErrorFault, InvalidMarketErrorFault;

    @RequestWrapper(localName = "modifyMarket", targetNamespace = "http://www.orange.com/Interfaces/ManageMarket/v1", className = "com.orange.library.providersoap.service.ModifyMarket")
    @WebMethod
    @ResponseWrapper(localName = "modifyMarketResponse", targetNamespace = "http://www.orange.com/Interfaces/ManageMarket/v1", className = "com.orange.library.providersoap.service.ModifyMarketResponse")
    public void modifyMarket(
        @WebParam(name = "market", targetNamespace = "http://www.orange.com/Interfaces/ManageMarket/v1")
        com.orange.library.providersoap.model.MarketSoap market
    ) throws TechnicalErrorFault, NotFoundErrorFault, InvalidMarketErrorFault;
}
