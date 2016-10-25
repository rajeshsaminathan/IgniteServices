package com.ignite.dashboardservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ignite.dashboardservices.model.ReceivingMetrics;
import com.ignite.dashboardservices.model.SlotMetrics;
import com.ignite.dashboardservices.model.SlotStatus;
import com.ignite.dashboardservices.service.ReceivingSrvc;

@RestController
public class IgniteController {

	@Autowired
	ReceivingSrvc receivingDaoSrvc;

	@RequestMapping("/")
	public String helloWorld() {
				return "Welcome to Ignite 2.0";
	}

	@RequestMapping("/palletinquiry")
	public ReceivingMetrics getRcvMetrics(
			@RequestParam(value = "pallet") String palletId) {
		return receivingDaoSrvc.getReceivingMetrics(palletId);

		/*
		 * return new
		 * SimpleDateFormat("MM/dd/yyyy HH:mm").format(receivingDaoSrvc
		 * .getReceivingMetrics(palletId).rcvdDate);
		 */
	}

	@RequestMapping("/listpallet")
	public List<ReceivingMetrics> getallRcvMetrics() {
		return receivingDaoSrvc.getallReceivingMetrics();
	}

	@RequestMapping("/slot/SSTK")
	public List<SlotMetrics> getSSTKSlotMetrics() {
		return receivingDaoSrvc.getSlotMetrics("SSTK");
	}

	@RequestMapping("/slot/PBYL")
	public List<SlotMetrics> getPBYLSlotMetrics() {
		return receivingDaoSrvc.getSlotMetrics("PBYL");
	}

	@RequestMapping("/slot/EASYPICK")
	public List<SlotMetrics> getPickSlotMetrics() {
		return receivingDaoSrvc.getSlotMetrics("EASYPICK");
	}
	
	@RequestMapping("/slotstatus/SSTK")
	public SlotStatus getSSTKSlotStatus() {
		return receivingDaoSrvc.getSlotStatus("SSTK");
	}

}
