package com.ektha.calculatorservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface ICalculator {

	@WebMethod
	public int add(int a, int b);

	@WebMethod
	public int sub(int a, int b);

}
