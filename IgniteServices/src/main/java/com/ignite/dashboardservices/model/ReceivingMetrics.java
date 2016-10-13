package com.ignite.dashboardservices.model;

import java.util.Date;

public class ReceivingMetrics {
	
	public String pallet;
	public int rcvdQty;
	public Date rcvdDate;
	public ReceivingMetrics(String pallet, int rcvdQty, Date rcvdDate) {
		super();
		this.pallet = pallet;
		this.rcvdQty = rcvdQty;
		this.rcvdDate = rcvdDate;
	}
	public String getPallet() {
		return pallet;
	}
	public void setPallet(String pallet) {
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
