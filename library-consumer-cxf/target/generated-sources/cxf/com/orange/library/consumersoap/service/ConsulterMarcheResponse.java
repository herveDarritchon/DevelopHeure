
package com.orange.library.consumersoap.service;

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
 *         &lt;element name="consulterMarcheReturn" type="{http://www.orange.com/Interfaces/GererMarche/v1/model}MarcheSoap"/>
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
    "consulterMarcheReturn"
})
@XmlRootElement(name = "consulterMarcheResponse")
public class ConsulterMarcheResponse {

    @XmlElement(required = true)
    protected MarcheSoap consulterMarcheReturn;

    /**
     * Gets the value of the consulterMarcheReturn property.
     * 
     * @return
     *     possible object is
     *     {@link MarcheSoap }
     *     
     */
    public MarcheSoap getConsulterMarcheReturn() {
        return consulterMarcheReturn;
    }

    /**
     * Sets the value of the consulterMarcheReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarcheSoap }
     *     
     */
    public void setConsulterMarcheReturn(MarcheSoap value) {
        this.consulterMarcheReturn = value;
    }

}
