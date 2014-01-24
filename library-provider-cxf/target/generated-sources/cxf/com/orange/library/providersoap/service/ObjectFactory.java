
package com.orange.library.providersoap.service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orange.library.providersoap.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orange.library.providersoap.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateMarket }
     * 
     */
    public CreateMarket createCreateMarket() {
        return new CreateMarket();
    }

    /**
     * Create an instance of {@link CreateMarketResponse }
     * 
     */
    public CreateMarketResponse createCreateMarketResponse() {
        return new CreateMarketResponse();
    }

    /**
     * Create an instance of {@link FindAllMarkets }
     * 
     */
    public FindAllMarkets createFindAllMarkets() {
        return new FindAllMarkets();
    }

    /**
     * Create an instance of {@link ModifyMarketResponse }
     * 
     */
    public ModifyMarketResponse createModifyMarketResponse() {
        return new ModifyMarketResponse();
    }

    /**
     * Create an instance of {@link DeleteMarket }
     * 
     */
    public DeleteMarket createDeleteMarket() {
        return new DeleteMarket();
    }

    /**
     * Create an instance of {@link ModifyMarket }
     * 
     */
    public ModifyMarket createModifyMarket() {
        return new ModifyMarket();
    }

    /**
     * Create an instance of {@link DeleteMarketResponse }
     * 
     */
    public DeleteMarketResponse createDeleteMarketResponse() {
        return new DeleteMarketResponse();
    }

    /**
     * Create an instance of {@link FindAllMarketsResponse }
     * 
     */
    public FindAllMarketsResponse createFindAllMarketsResponse() {
        return new FindAllMarketsResponse();
    }

}
