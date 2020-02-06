package com.nivtek.trustbank.creditcard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nivtek.trustbank.creditcard.entity.CreditCard;
import com.nivtek.trustbank.creditcard.service.CreditCardService;
import com.nivtek.trustbank.creditcard.service.RegistrationService;

/**
 * This class takes care of all the login related actions.
 * 
 * @author Dipendra Pokharel
 *
 */
@Controller
public class LoginController {

	@Autowired
	CreditCardService ccService;
	@Autowired
	RegistrationService rrService;

	/**
	 * Takes username and password and checks for validation.
	 * 
	 * @param userName
	 * @param passWord
	 * @param map
	 * @param request
	 * @return
	 */
	@RequestMapping("/validate")
	public String validateLogin(@RequestParam("username") String userName, @RequestParam("password") String passWord,
			ModelMap map, HttpServletRequest request) {

		CreditCard card = rrService.validateLogin(userName, passWord);
		if (!(card.getCcId() == 0)) {
			request.getSession().setAttribute("cardSession", card);
			request.getSession().setAttribute("userName", userName);
			return "user";
		} else {
			map.put("errormessage", "errormessage");
			return "creditcard";
		}

	}

	/**
	 * Displays page for user after logged in.
	 * 
	 * @return
	 */
	@RequestMapping("/user")
	public String displayUser() {

		return "user";
	}

	/**
	 * Displays personal details after logged in
	 * 
	 * @param request
	 * @param map
	 * @return
	 */
	@RequestMapping("/personal")
	public String displayPersonal(HttpServletRequest request, ModelMap map) {

		CreditCard card = (CreditCard) request.getSession().getAttribute("cardSession");
		map.put("card", card);
		return "personal";
	}

	/**
	 * Handles logout, clears session.
	 * 
	 * @param request
	 * @param map
	 * @return
	 */
	@RequestMapping("/logout")
	public String logut(HttpServletRequest request, ModelMap map) {

		request.getSession().invalidate();
		map.put("logout", "logout");
		return "creditcard";
	}

}
