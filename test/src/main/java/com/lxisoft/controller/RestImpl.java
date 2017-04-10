package com.lxisoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestImpl {
	
	@RequestMapping("/")
	public String sayHello()
	{
		return "HERE I AM HAHAHAHA";
		
	}

}
