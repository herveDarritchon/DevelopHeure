
package com.orange.library.consumersoap.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.orange.library.consumersoap.model.MarcheSoap;


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
 *         &lt;element name="rechercherMarchesParNomReturn" type="{http://www.orange.com/Interfaces/GererMarche/v1/model}MarcheSoap" maxOccurs="unbounded"/>
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
    "rechercherMarchesParNomReturn"
})
@XmlRootElement(name = "rechercherMarchesParNomResponse")
public class RechercherMarchesParNomResponse {

    @XmlElement(required = true)
    protected List<MarcheSoap> rechercherMarchesParNomReturn;

    /**
     * Gets the value of the rechercherMarchesParNomReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rechercherMarchesParNomReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRechercherMarchesParNomReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarcheSoap }
     * 
     * 
     */
    public List<MarcheSoap> getRechercherMarchesParNomReturn() {
        if (rechercherMarchesParNomReturn == null) {
            rechercherMarchesParNomReturn = new ArrayList<MarcheSoap>();
        }
        return this.rechercherMarchesParNomReturn;
    }

}
