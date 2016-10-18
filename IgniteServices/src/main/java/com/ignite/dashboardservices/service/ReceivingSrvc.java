package com.ignite.dashboardservices.service;

import java.util.List;

import com.ignite.dashboardservices.model.ReceivingMetrics;

public interface ReceivingSrvc {
	ReceivingMetrics getReceivingMetrics (String palletId);
	List<ReceivingMetrics> getallReceivingMetrics ();

}
