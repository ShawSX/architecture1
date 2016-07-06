package com.xsy.architecture1.customermgr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsy.architecture1.common.service.BaseService;
import com.xsy.architecture1.customermgr.dao.CustomerDAO;
import com.xsy.architecture1.customermgr.vo.CustomerModel;
import com.xsy.architecture1.customermgr.vo.CustomerQueryModel;

@Service
public class CustomerService extends  BaseService<CustomerModel, CustomerQueryModel> implements ICustomerService{
	
	private CustomerDAO dao = null;
	
	@Autowired
	private void setDao(CustomerDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	
}
