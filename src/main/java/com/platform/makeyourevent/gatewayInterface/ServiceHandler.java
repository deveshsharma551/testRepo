package com.platform.makeyourevent.gatewayInterface;

public interface ServiceHandler {
	
	public MerchantRequestHandler handlerTypeResolver(String uriPattern);

}
