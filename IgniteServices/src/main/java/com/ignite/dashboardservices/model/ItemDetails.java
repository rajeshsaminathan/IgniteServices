package com.ignite.dashboardservices.model;

public class ItemDetails {

	int itemNbr;
	String itemDesc;
	int itemQty;

	public ItemDetails(int itemNbr, String itemDesc, int itemQty) {
		super();
		this.itemNbr = itemNbr;
		this.itemDesc = itemDesc;
		this.itemQty = itemQty;
	}

	public ItemDetails() {

	}

	public int getItemNbr() {
		return itemNbr;
	}

	public void setItemNbr(int itemNbr) {
		this.itemNbr = itemNbr;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

}
