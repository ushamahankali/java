package com.psb.bizportal.tenant.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.psb.bizportal.tenant.entity.Location;
import com.psb.bizportal.tenant.entity.Tenant;
import com.psb.bizportal.tenant.service.LocationService;
import com.psb.bizportal.tenant.service.TenantService;

@Controller
public class TenantController {

	@Autowired
	private TenantService tenantService;
	private LocationService locationService;

	@RequestMapping(value = "/location")
	public ModelAndView listLocations() {

		ModelAndView model = new ModelAndView("location");

		HashMap<String, List<Tenant>> tenantMap = tenantService.getTenants();

		model.addObject("tenantMap", tenantMap);

		return model;
	}

	@RequestMapping(value = "/tenant")
	public ModelAndView listTenants(HttpServletRequest request, HttpServletResponse res) {

		ModelAndView model = new ModelAndView("tenant");
		String locationName = request.getParameter("location");

		HashMap<String, List<Tenant>> tenantMap = tenantService.getTenants();
		List<Tenant> tenantList = tenantMap.get(locationName);

		model.addObject("tenantList", tenantList);
		model.addObject("locationName", locationName);

		return model;
	}

	@RequestMapping(value = "/locationdetails/{locationName}")
	public ModelAndView showLocationDetails(@PathVariable("locationName") String locationName) {

		ModelAndView model = new ModelAndView("locationdetails");
		System.out.println(locationName);
		//LocationService locSer = new LocationService();
		Location location = locationService.getLocationDetails(locationName);
		System.out.println(location);
		model.addObject("locationName", locationName);
		model.addObject("location", location);

		return model;

	}

}
