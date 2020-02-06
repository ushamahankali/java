package com.nivtek.trustbank.creditcard.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nivtek.trustbank.creditcard.entity.CreditCard;
import com.nivtek.trustbank.creditcard.service.LoginService;

/**
 * This class takes care of all the login related actions.
 * 
 * @author Dipendra Pokharel
 *
 */
@Controller
public class LoginController {

	@Autowired
	public LoginService loginService;

	public static final Logger log = Logger.getLogger(LoginController.class);

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

		CreditCard card = loginService.validateLogin(userName, passWord);
		if (!(card.getCcId() == 0)) {
			request.getSession().setAttribute("cardSession", card);
			request.getSession().setAttribute("userName", userName);
			log.info("Logged in " + userName);
			return "user";
		} else {
			log.info("Invalid login for" + userName);
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
		return "personalDetails";
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

		log.info("Logged out " + request.getSession().getAttribute("userName"));
		request.getSession().invalidate();
		map.put("logout", "logout");
		return "creditcard";
	}

}
