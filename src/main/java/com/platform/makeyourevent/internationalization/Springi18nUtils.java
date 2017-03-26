package com.platform.makeyourevent.internationalization;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

/**
 * @author devesh
 *this class is to support internationalization and localization for display the user message to user from all the parts of the world
 */
@Component
public class Springi18nUtils {

	@Bean
	public MessageSource messageSource()
	{
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}
	
	public String getMessage()
	{
		ApplicationContext ctx = new ApplicationContext(messageSource());
	}
	
}
