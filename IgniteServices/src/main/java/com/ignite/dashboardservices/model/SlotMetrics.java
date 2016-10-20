package com.ignite.dashboardservices.model;

public class SlotMetrics {

	String slotArea;
	String slotStatus;
	int count;
	
	
	public SlotMetrics(String slotStatus, int count) {
		super();
		this.slotStatus = slotStatus;
		this.count = count;
	}
	
	
	public SlotMetrics() {
		// TODO Auto-generated constructor stub
	}

	public String getSlotStatus() {
		return slotStatus;
	}
	public void setSlotStatus(String slotStatus) {
		this.slotStatus = slotStatus;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
		
}
