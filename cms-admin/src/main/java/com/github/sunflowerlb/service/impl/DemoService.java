package com.github.sunflowerlb.service.impl;

import org.springframework.stereotype.Service;

import com.github.sunflowerlb.service.IDemoService;

@Service
public class DemoService implements IDemoService {

	@Override
	public String demo() {
		return "demo";
	}

}
