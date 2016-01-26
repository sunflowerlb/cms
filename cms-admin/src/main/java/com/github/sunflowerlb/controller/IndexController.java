package com.github.sunflowerlb.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.sunflowerlb.service.IDemoService;

@RestController
public class IndexController {

	
	@Resource
	private IDemoService demoService;
	
	@RequestMapping(name = "/index")
	public String index() {
		return demoService.demo();
	}
	
}
