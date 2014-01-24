
package com.orange.library.providersoap.exception;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSFunctionalError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSFunctionalError">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.orange.com/Interfaces/ManageMarket/v1/exception}WSError">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSFunctionalError")
@XmlSeeAlso({
    InvalidMarketError.class,
    NotFoundError.class
})
public class WSFunctionalError
    extends WSError
{


}
