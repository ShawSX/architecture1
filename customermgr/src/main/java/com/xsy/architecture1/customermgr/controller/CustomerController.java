package com.xsy.architecture1.customermgr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/")
public class CustomerController {
	
	@RequestMapping("content")
	public String getContent(){
		
		return "list";
	}
}
