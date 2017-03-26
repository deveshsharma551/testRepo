package com.platform.makeyourevent.gatewayInterface;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.makeyourevent.propertyHandler.PropertyUtils;


public abstract class AbstractRequestHandler implements ServiceHandler {
	
	@Autowired
	private PropertyUtils propertyUtils;
	
	private Map<String,ServiceHandler> serviceHandlerList = new HashMap();

	public MerchantRequestHandler handlerTypeResolver(String uriPattern)
	{
	   String	TypeOfURIPattern  = propertyUtils.getStringPropertyValue(uriPattern);
	   System.out.println(TypeOfURIPattern);
	   if(TypeOfURIPattern.equals("MYE_MERCHANT_REGISTER"))
		   return new MerchantRequestHandler();
	   return null;  
	}
	
	
   /* @PostConstruct
	public registerAllHandler()
	{
		serviceHandlerList.put(key, )
	}*/
	
	
}
