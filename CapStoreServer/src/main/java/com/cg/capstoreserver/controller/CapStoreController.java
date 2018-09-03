package com.cg.capstoreserver.controller;



import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.capstoreserver.bean.CustomerBean;
import com.cg.capstoreserver.bean.MerchantBean;
import com.cg.capstoreserver.service.ICapStoreService;


@RestController
public class CapStoreController {
	@Autowired
	private ICapStoreService service;
	
	@RequestMapping(value="/viewallcust",method=RequestMethod.GET)
	public List<CustomerBean> viewAllCustomerDetails(){	
		return service.getAllCustomerDetails();
	}
	
	@RequestMapping(value="/viewallmer",method=RequestMethod.GET)
	public List<MerchantBean> viewAllMerchant(){
		return service.getAllMerchants();
	}
}
