package com.ignite.dashboardservices.model;

public class ReceivingMetrics {
	
	public String pallet;
	public int rcvdQty;
    public String rcvdDate;
	
	public ReceivingMetrics(String pallet, int rcvdQty, String rcvdDate) {
		super();
		this.pallet = pallet;
		this.rcvdQty = rcvdQty;
		this.rcvdDate = rcvdDate;
	}
		
	public ReceivingMetrics() {
		// TODO Auto-generated constructor stub
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
	public String getRcvdDate() {
		return rcvdDate;
	}
	public void setRcvdDate(String rcvdDate) {
		this.rcvdDate = rcvdDate;
	}
	
	}
