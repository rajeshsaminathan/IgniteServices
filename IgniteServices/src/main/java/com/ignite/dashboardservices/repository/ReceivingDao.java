package com.ignite.dashboardservices.repository;

import java.util.List;

import com.ignite.dashboardservices.model.ReceivingMetrics;

public interface ReceivingDao {

	ReceivingMetrics getReceivingMetrics (String palletId);
	List<ReceivingMetrics> getallReceivingMetrics();
}
