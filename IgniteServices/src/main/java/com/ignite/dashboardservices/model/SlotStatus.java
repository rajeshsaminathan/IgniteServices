package com.ignite.dashboardservices.model;

import java.util.List;

public class SlotStatus {

	List <SlotMetrics> slotMetrics;
	int totalSlots;
	
	public SlotStatus(int totalSlots,List <SlotMetrics> slotMetrics) {
		super();
		this.totalSlots = totalSlots;
		this.slotMetrics = slotMetrics;
	}
	public SlotStatus() {
		// TODO Auto-generated constructor stub
	}
	public List <SlotMetrics> getSlotMetrics() {
		return slotMetrics;
	}
	public void setSlotMetrics(List <SlotMetrics> slotMetrics) {
		this.slotMetrics = slotMetrics;
	}
	public int getTotalSlots() {
		return totalSlots;
	}
	public void setTotalSlots(int totalSlots) {
		this.totalSlots = totalSlots;
	}
	
	
}
