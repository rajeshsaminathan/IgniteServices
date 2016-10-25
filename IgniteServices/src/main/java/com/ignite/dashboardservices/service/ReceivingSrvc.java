package com.ignite.dashboardservices.service;

import java.util.List;

import com.ignite.dashboardservices.model.ReceivingMetrics;
import com.ignite.dashboardservices.model.SlotMetrics;
import com.ignite.dashboardservices.model.SlotStatus;

public interface ReceivingSrvc {
	ReceivingMetrics getReceivingMetrics (String palletId);
	List<ReceivingMetrics> getallReceivingMetrics ();
	List<SlotMetrics> getSlotMetrics(String slotArea);
	SlotStatus getSlotStatus(String slotArea);
}
