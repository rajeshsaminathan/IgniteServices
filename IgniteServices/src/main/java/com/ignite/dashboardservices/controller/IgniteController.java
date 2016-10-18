package com.ignite.dashboardservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ignite.dashboardservices.model.ReceivingMetrics;
import com.ignite.dashboardservices.service.ReceivingSrvc;

@RestController
public class IgniteController {

	@Autowired
	ReceivingSrvc receivingDaoSrvc;

	@RequestMapping("/palletinquiry")
	public ReceivingMetrics getRcvMetrics(@RequestParam(value = "pallet") String palletId) {
		return receivingDaoSrvc.getReceivingMetrics(palletId);
		
		/*return new SimpleDateFormat("MM/dd/yyyy HH:mm").format(receivingDaoSrvc.getReceivingMetrics(palletId).rcvdDate);*/
	}

	@RequestMapping("/listpallet")
	public List<ReceivingMetrics> getallRcvMetrics() {
		return receivingDaoSrvc.getallReceivingMetrics();
		}
	
	

}
