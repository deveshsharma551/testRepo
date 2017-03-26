package com.platform.makeyourevent.gatewayInterface;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


@Component
public class MerchantRequestHandler extends AbstractRequestHandler{
	
	public String type()
	{
		return "MYE_MERCHANT_REGISTER";
	}
	
	public  ResponseEntity handlePost(Map<String,Object> input)
	{
	   System.out.println(input);	
	   return null;
	}

}
