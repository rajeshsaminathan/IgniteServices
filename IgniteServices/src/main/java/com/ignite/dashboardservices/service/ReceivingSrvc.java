package com.ignite.dashboardservices.service;

import com.ignite.dashboardservices.model.ReceivingMetrics;

public interface ReceivingSrvc {
	ReceivingMetrics getReceivingMetrics (String palletId);

}
