package com.orange.librarypackage.library.consumersoap.mapping;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.dozer.CustomConverter;
import org.dozer.MappingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example of dozer custom converter to switch between java and xml dates
 * 
 * @see java.util.Date
 * @see javax.xml.datatype.XMLGregorianCalendar
 * @author clara
 * 
 */
public class XMLGregorianConverter implements CustomConverter {

	private final Logger log = LoggerFactory.getLogger(XMLGregorianConverter.class
			.getName());

	public Object convert(Object destination, Object source, Class<?> destClass,
			Class<?> sourceClass) {
		// show me the destClass and sourceClass
		log.info("XMLGregorianConverter - Source Class is:"
				+ sourceClass.getName());
		log
				.info("XMLGregorianConverter - Dest Class is:"
						+ destClass.getName());

		if (source == null) {
			return null;
		}

		if (source instanceof Date) {
			GregorianCalendar gCalendar = new GregorianCalendar();
			gCalendar.setTime((Date) source);
			try {
				destination = DatatypeFactory.newInstance()
						.newXMLGregorianCalendar(gCalendar);
			} catch (DatatypeConfigurationException e) {
				throw new MappingException(
						"Converter XMLGregorianConverter incorrectly configured: "
								+ e.getMessage());
			}
			return destination;
		} else if (source instanceof XMLGregorianCalendar) {
			return ((XMLGregorianCalendar) source).toGregorianCalendar()
					.getTime();
		} else {
			throw new MappingException(
					"Converter XMLGregorianConverter used incorrectly. Arguments passed in were:"
							+ destination + " and " + source);
		}
	}

}
