package com.ignite.dashboardservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ignite.dashboardservices.model.ReceivingMetrics;
import com.ignite.dashboardservices.model.SlotMetrics;
import com.ignite.dashboardservices.repository.ReceivingDao;

@Service
public class ReceivingSrvcImpl implements ReceivingSrvc {

	@Autowired
	ReceivingDao receivingDao;
	
	@Override
	public ReceivingMetrics getReceivingMetrics(String palletId) {
		return receivingDao.getReceivingMetrics(palletId);
	}

	public List<ReceivingMetrics> getallReceivingMetrics() {
		return receivingDao.getallReceivingMetrics();
	}

	@Override
	public List<SlotMetrics> getSlotMetrics(String slotArea) {
		return receivingDao.getSlotMetrics(slotArea);
	}


}
