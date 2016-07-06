package com.xsy.architecture1.customermgr.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.xsy.architecture1.common.pageutil.Page;
import com.xsy.architecture1.customermgr.service.ICustomerService;
import com.xsy.architecture1.customermgr.vo.CustomerModel;
import com.xsy.architecture1.customermgr.vo.CustomerQueryModel;

@Service
public class Client {
	
	@Autowired
	private ICustomerService service;
	
	public static void main(String[] args) {
		ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
		Client client  = (Client) ctx.getBean("client");
		CustomerModel customer = new CustomerModel();
		customer.setCustomerId("123456");
		customer.setPwd("780");
		customer.setRegiterTime("2016-06-30");
		customer.setShowName("hehe");
		customer.setTrueName("张三");
	//	client.customerDAO.add(customer);
		CustomerQueryModel cqm =  new CustomerQueryModel();
		
		Page<CustomerModel> page =  client.service.listModelPage(cqm);
		System.out.println("page========="+page);
		
		
	}
}
