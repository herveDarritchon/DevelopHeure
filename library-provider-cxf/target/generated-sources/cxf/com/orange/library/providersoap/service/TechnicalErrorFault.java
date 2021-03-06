
package com.orange.library.providersoap.service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.5
 * 2014-01-24T17:12:03.907+01:00
 * Generated source version: 2.7.5
 */

@WebFault(name = "technicalError", targetNamespace = "http://www.orange.com/Interfaces/ManageMarket/v1/exception")
public class TechnicalErrorFault extends Exception {
    
    private com.orange.library.providersoap.exception.TechnicalError technicalError;

    public TechnicalErrorFault() {
        super();
    }
    
    public TechnicalErrorFault(String message) {
        super(message);
    }
    
    public TechnicalErrorFault(String message, Throwable cause) {
        super(message, cause);
    }

    public TechnicalErrorFault(String message, com.orange.library.providersoap.exception.TechnicalError technicalError) {
        super(message);
        this.technicalError = technicalError;
    }

    public TechnicalErrorFault(String message, com.orange.library.providersoap.exception.TechnicalError technicalError, Throwable cause) {
        super(message, cause);
        this.technicalError = technicalError;
    }

    public com.orange.library.providersoap.exception.TechnicalError getFaultInfo() {
        return this.technicalError;
    }
}
