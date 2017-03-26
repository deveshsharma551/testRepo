package com.platform.makeyourevent.gatewayInterface;

import java.net.URI;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.makeyourevent.model.Merchant;

@RestController
@RequestMapping("p1/registerMerchants")
public class GenericGateWayInterface {
	
    @Autowired
    private ServiceHandler serviceHandler;
	
	@PostMapping
	public  ResponseEntity create(HttpServletRequest request ,@RequestBody Merchant merchant)
	{
		
	    MerchantRequestHandler merchantRequestHandler =  serviceHandler.handlerTypeResolver("p1/registerMerchants");    
		return merchantRequestHandler.handlePost(null);		
	}
	
}
