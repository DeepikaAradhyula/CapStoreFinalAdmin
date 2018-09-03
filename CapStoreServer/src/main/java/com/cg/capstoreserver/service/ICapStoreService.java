package com.cg.capstoreserver.service;

import java.util.List;

import com.cg.capstoreserver.bean.CustomerBean;
import com.cg.capstoreserver.bean.MerchantBean;


public interface ICapStoreService {
	public List<CustomerBean> getAllCustomerDetails();
	public List<MerchantBean> getAllMerchants();
	public CustomerBean getCust(String id);
}
