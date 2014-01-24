
package com.orange.library.consumersoap.exception;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSErreurFonctionnelle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSErreurFonctionnelle">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.orange.com/Interfaces/GererMarche/v1/exception}WSErreur">
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
@XmlType(name = "WSErreurFonctionnelle")
@XmlSeeAlso({
    ErreurMarcheNonTrouve.class,
    ErreurMarcheInvalide.class
})
public class WSErreurFonctionnelle
    extends WSErreur
{


}
