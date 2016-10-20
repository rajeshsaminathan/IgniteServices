package com.ignite.dashboardservices.repository;

import java.util.List;

import com.ignite.dashboardservices.model.ReceivingMetrics;
import com.ignite.dashboardservices.model.SlotMetrics;

public interface ReceivingDao {

	ReceivingMetrics getReceivingMetrics (String palletId);
	List<ReceivingMetrics> getallReceivingMetrics();
	List<SlotMetrics> getSlotMetrics(String slotArea);
}

