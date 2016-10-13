package com.ignite.dashboardservices.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ignite.dashboardservices.model.ReceivingMetrics;

@RestController
public class IgniteController {

	@Autowired
	Date date;
	
@RequestMapping("/")
public ReceivingMetrics getRcvMetrics(){
	return new ReceivingMetrics("11111",10, date) ;
}
}
