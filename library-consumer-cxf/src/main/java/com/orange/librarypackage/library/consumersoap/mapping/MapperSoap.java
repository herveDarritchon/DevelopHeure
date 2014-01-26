package com.orange.librarypackage.library.consumersoap.mapping;

import java.lang.reflect.Constructor;
import java.util.List;

import org.dozer.DozerBeanMapper;

import com.orange.librarypackage.consumersoap.exception.ErreurMarcheInvalide;
import com.orange.librarypackage.consumersoap.exception.ErreurMarcheNonTrouve;
import com.orange.librarypackage.consumersoap.exception.ErreurTechnique;
import com.orange.librarypackage.consumersoap.service.ErreurMarcheInvalideFault;
import com.orange.librarypackage.consumersoap.service.ErreurMarcheNonTrouveFault;
import com.orange.librarypackage.consumersoap.service.ErreurTechniqueFault;
import com.orange.librarypackage.library.technicalservice.exception.InvalidMarketException;
import com.orange.librarypackage.library.technicalservice.exception.NotFoundException;
import com.orange.librarypackage.library.technicalservice.exception.TechnicalException;

public class MapperSoap extends DozerBeanMapper {

	
	/**
	 * Fault to FunctionalException (here 'Exception') mapping
	 * 
	 * @param source the fault
	 * @param wrapperExceptionClass the exception
	 * @param faultBeanClass the fault bean
	 * @return
	 */
	public Exception map(ErreurTechniqueFault source, Class<?> wrapperExceptionClass, Class<?> faultBeanClass) {
		// 'faultBean' mapping
		Object faultBean = super.map(source, faultBeanClass);

		Constructor<?> c;
		try {
			c = wrapperExceptionClass.getConstructor(new Class[] {String.class, faultBeanClass, Throwable.class });
			return (Exception) c.newInstance(new Object[] {source.getMessage(), faultBean, source });
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * ErreurTechniqueFault to TechnicalException mapping
	 * 
	 * @param source the ErreurTechniqueFault to translate
	 * @return the corresponding TechnicalException
	 */
	public TechnicalException map(ErreurTechniqueFault source) {
		ErreurTechnique info = source.getFaultInfo();
		return new TechnicalException(info.getLocalisationClass(), info.getLocalisationMethod(), info.getMessage(), null);
	}

	/**
	 * ErreurMarcheNonTrouveFault to functional exception mapping
	 * 
	 * @param source ErreurMarcheNonTrouveFault to translate
	 * @return the corresponding NotFoundException 
	 */
	public NotFoundException map(ErreurMarcheNonTrouveFault source) {
		ErreurMarcheNonTrouve info = source.getFaultInfo();
		return new NotFoundException(info.getLocalisationClass(), info.getLocalisationMethod(), info.getMessage(), null);
	}

	/**
	 * ErreurMarcheInvalideFault to functional exception mapping
	 * 
	 * @param source ErreurMarcheInvalideFault to translate
	 * @return the corresponding InvalidMarketException
	 */
	public InvalidMarketException map(ErreurMarcheInvalideFault source) {
		ErreurMarcheInvalide info = source.getFaultInfo();
		return new InvalidMarketException(info.getLocalisationClass(), info.getLocalisationMethod(), info.getMessage(), null);
	}

	@Override
	public void setMappingFiles(List<String> mappingFiles) {
		// ensure that files names have no trailing spaces
		for (int i = 0; i < mappingFiles.size(); i++) {
			String item = mappingFiles.get(i);
			mappingFiles.set(i, item.trim());
		}
		super.setMappingFiles(mappingFiles);
	}

}
