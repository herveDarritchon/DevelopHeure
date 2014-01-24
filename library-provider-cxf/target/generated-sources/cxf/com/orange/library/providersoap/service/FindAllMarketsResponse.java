
package com.orange.library.providersoap.service;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="findAllMarketsReturn" type="{http://www.orange.com/Interfaces/ManageMarket/v1/model}MarketSoap" maxOccurs="unbounded"/>
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
    "findAllMarketsReturn"
})
@XmlRootElement(name = "findAllMarketsResponse")
public class FindAllMarketsResponse {

    @XmlElement(required = true)
    protected List<MarketSoap> findAllMarketsReturn;

    /**
     * Gets the value of the findAllMarketsReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the findAllMarketsReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFindAllMarketsReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketSoap }
     * 
     * 
     */
    public List<MarketSoap> getFindAllMarketsReturn() {
        if (findAllMarketsReturn == null) {
            findAllMarketsReturn = new ArrayList<MarketSoap>();
        }
        return this.findAllMarketsReturn;
    }

}
