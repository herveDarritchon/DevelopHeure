package com.orange.library.library.providersoap.mapping;

import java.lang.reflect.Constructor;
import java.util.List;

import org.dozer.DozerBeanMapper;

import com.orange.library.library.providersoap.exception.TechnicalError;
import com.orange.library.library.providersoap.service.TechnicalErrorFault;
import com.orange.library.library.technicalservice.exception.FunctionalException;
import com.orange.library.library.technicalservice.exception.TechnicalException;

public class SoapMapper extends DozerBeanMapper {

	/**
	 * FunctionalException to Fault (here 'Exception') mapping
	 * 
	 * @param source the functional exception
	 * @param wrapperExceptionClass the exception
	 * @param faultBeanClass the fault bean
	 * @return the fault
	 */
	public Exception map(FunctionalException source,
			Class<?> wrapperExceptionClass, Class<?> faultBeanClass) {
		// 'faultBean' mapping
		Object faultBean = super.map(source, faultBeanClass);

		Constructor<?> c;
		try {
			c = wrapperExceptionClass.getConstructor(new Class[] {
					String.class, faultBeanClass, Throwable.class });
			return (Exception) c.newInstance(new Object[] {
					source.getMessage(), faultBean, source });
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * TechnicalErrorFault to TechnicalException mapping
	 * 
	 * @param source the TechnicalErrorFault to translate
	 * @return the corresponding TechnicalException
	 */
	public TechnicalException map(TechnicalErrorFault source) {
		TechnicalError info = source.getFaultInfo();
		return new TechnicalException(info.getLocalisationClass(), info
				.getLocalisationMethod(), source.getMessage(), null);
	}

	/**
	 * TechnicalException to TechnicalErrorFault mapping
	 * 
	 * @param source the TechnicalException to translate
	 * @return the corresponding TechnicalErrorFault
	 */
	public TechnicalErrorFault map(TechnicalException source) {
		TechnicalError ex = super.map(source, TechnicalError.class);
		return new TechnicalErrorFault(source.getMessage(), ex, source
				.getCause());
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
