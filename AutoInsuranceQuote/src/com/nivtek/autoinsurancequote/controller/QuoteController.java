package com.nivtek.autoinsurancequote.controller;

import com.nivtek.autoinsurancequote.entity.Request;
import com.nivtek.autoinsurancequote.service.QuoteService;

/**
 * @author Bootcamp User 024
 *
 */
public class QuoteController {

	/**
	 * @param request
	 */
	public void getQuote(Request request) {
		
		QuoteService quoteService = new QuoteService();
		
		//call quote service method
		
		quoteService.getQuote(request);
	}

}
