
package com.orange.library.consumersoap.exception;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orange.library.consumersoap.exception package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orange.library.consumersoap.exception
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WSErreur }
     * 
     */
    public WSErreur createWSErreur() {
        return new WSErreur();
    }

    /**
     * Create an instance of {@link ErreurMarcheInvalide }
     * 
     */
    public ErreurMarcheInvalide createErreurMarcheInvalide() {
        return new ErreurMarcheInvalide();
    }

    /**
     * Create an instance of {@link ErreurMarcheNonTrouve }
     * 
     */
    public ErreurMarcheNonTrouve createErreurMarcheNonTrouve() {
        return new ErreurMarcheNonTrouve();
    }

    /**
     * Create an instance of {@link ErreurTechnique }
     * 
     */
    public ErreurTechnique createErreurTechnique() {
        return new ErreurTechnique();
    }

    /**
     * Create an instance of {@link WSErreurTechnique }
     * 
     */
    public WSErreurTechnique createWSErreurTechnique() {
        return new WSErreurTechnique();
    }

    /**
     * Create an instance of {@link WSErreurFonctionnelle }
     * 
     */
    public WSErreurFonctionnelle createWSErreurFonctionnelle() {
        return new WSErreurFonctionnelle();
    }

}
