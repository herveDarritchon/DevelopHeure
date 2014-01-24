
package com.orange.library.providersoap.exception;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orange.library.providersoap.exception package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orange.library.providersoap.exception
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WSFunctionalError }
     * 
     */
    public WSFunctionalError createWSFunctionalError() {
        return new WSFunctionalError();
    }

    /**
     * Create an instance of {@link TechnicalError }
     * 
     */
    public TechnicalError createTechnicalError() {
        return new TechnicalError();
    }

    /**
     * Create an instance of {@link InvalidMarketError }
     * 
     */
    public InvalidMarketError createInvalidMarketError() {
        return new InvalidMarketError();
    }

    /**
     * Create an instance of {@link WSError }
     * 
     */
    public WSError createWSError() {
        return new WSError();
    }

    /**
     * Create an instance of {@link NotFoundError }
     * 
     */
    public NotFoundError createNotFoundError() {
        return new NotFoundError();
    }

    /**
     * Create an instance of {@link WSTechnicalError }
     * 
     */
    public WSTechnicalError createWSTechnicalError() {
        return new WSTechnicalError();
    }

}
