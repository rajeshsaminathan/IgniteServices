package com.ignite.dashboardservices.model;

import java.util.Date;

public class ReceivingMetrics {
	
	public Long pallet;
	public int rcvdQty;
	Date rcvdDate;
	public ReceivingMetrics(Long pallet, int rcvdQty, Date rcvdDate) {
		super();
		this.pallet = pallet;
		this.rcvdQty = rcvdQty;
		this.rcvdDate = rcvdDate;
	}
	public Long getPallet() {
		return pallet;
	}
	public void setPallet(Long pallet) {
		this.pallet = pallet;
	}
	public int getRcvdQty() {
		return rcvdQty;
	}
	public void setRcvdQty(int rcvdQty) {
		this.rcvdQty = rcvdQty;
	}
	public Date getRcvdDate() {
		return rcvdDate;
	}
	public void setRcvdDate(Date rcvdDate) {
		this.rcvdDate = rcvdDate;
	}
	
	
}
