package com.cg.capstoreclient.controller;

import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.capstoreclient.bean.CustomerBean;
import com.cg.capstoreclient.bean.MerchantBean;

@RestController
public class FrontController {
	@RequestMapping("/")
	public String consume() {
		return "welcome admin";
	}

	@RequestMapping("/customer")
	public ModelMap viewAllCustomerDetails(ModelMap model) {
		RestTemplate restTemplate = new RestTemplate();
		List<CustomerBean> response = restTemplate.getForObject("http://localhost:7776/viewallcust", List.class);
		model.put("customer", response);
		return model;
	}

	@RequestMapping("/merchant")
	public ModelMap viewAllMerchantDetails(ModelMap model) {
		RestTemplate restTemplate = new RestTemplate();

		List<MerchantBean> response = restTemplate.getForObject("http://localhost:7776/viewallmer", List.class);
		model.put("merchant", response);
		return model;

	}
}
