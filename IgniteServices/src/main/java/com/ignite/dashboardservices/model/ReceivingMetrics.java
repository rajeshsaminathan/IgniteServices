package com.ignite.dashboardservices.model;

import java.sql.Timestamp;

public class ReceivingMetrics {
	
	public String pallet;
	public int rcvdQty;
    public Timestamp rcvdDate;
	
	public ReceivingMetrics(String pallet, int rcvdQty, Timestamp rcvdDate) {
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
	public Timestamp getRcvdDate() {
		return rcvdDate;
	}
	public void setRcvdDate(Timestamp rcvdDate) {
		this.rcvdDate = rcvdDate;
	}
	
	}
