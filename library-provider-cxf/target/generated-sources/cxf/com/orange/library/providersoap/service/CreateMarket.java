
package com.orange.library.providersoap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.orange.library.providersoap.model.MarketSoap;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="market" type="{http://www.orange.com/Interfaces/ManageMarket/v1/model}MarketSoap"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "market"
})
@XmlRootElement(name = "createMarket")
public class CreateMarket {

    @XmlElement(required = true)
    protected MarketSoap market;

    /**
     * Gets the value of the market property.
     * 
     * @return
     *     possible object is
     *     {@link MarketSoap }
     *     
     */
    public MarketSoap getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketSoap }
     *     
     */
    public void setMarket(MarketSoap value) {
        this.market = value;
    }

}
