package com.ignite.dashboardservices.repository;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.ignite.dashboardservices.model.ItemDetails;
import com.ignite.dashboardservices.model.ReceivingMetrics;
import com.ignite.dashboardservices.model.SlotMetrics;
import com.ignite.dashboardservices.model.SlotStatus;

@Repository
public class ReceivingDaoImpl extends JdbcDaoSupport implements ReceivingDao {

	@Autowired
	DataSource dataSource;
	Timestamp date;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public ReceivingMetrics getReceivingMetrics(String palletId) {

		String query = "SELECT pallet, rcvd_qty,rcvd_date::timestamp"
				+ " from public.receiving_log where receiving_log.pallet = "
				+ palletId;

		return getJdbcTemplate().queryForObject(
				query,
				(resultSet, i) -> {
					return new ReceivingMetrics(resultSet.getString(1),
							resultSet.getInt(2), resultSet.getString(3));
				});
	}

	public List<ReceivingMetrics> getallReceivingMetrics() {
		String query = "SELECT pallet, rcvd_qty,rcvd_date::timestamp"
				+ " from public.receiving_log";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(query);
		List<ReceivingMetrics> result = new ArrayList<>();
		for (Map<String, Object> row : rows) {
			ReceivingMetrics rcvMetrics = new ReceivingMetrics();
			rcvMetrics.setPallet((String) row.get("pallet"));
			rcvMetrics.setRcvdQty((int) row.get("rcvd_qty"));
			rcvMetrics.setRcvdDate(new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
					.format((Timestamp) row.get("rcvd_date")));
			result.add(rcvMetrics);
		}
		return result;
	}

	public List<SlotMetrics> getSlotMetrics(String slotString) {
		String query = "SELECT slot_status,slot_count from public.slot_metrics"
				+ " where slot_area = '" + slotString + "'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(query);
		List<SlotMetrics> slotResult = new ArrayList<SlotMetrics>();

		for (Map<String, Object> row : rows) {
			SlotMetrics slotMet = new SlotMetrics();
			slotMet.setSlotStatus((String) row.get("slot_status"));
			slotMet.setCount((int) row.get("slot_count"));
			slotResult.add(slotMet);
		}
		return slotResult;

	}

	@Override
	public SlotStatus getSlotStatus(String slotArea) {

		int totalSlot;
		String query = "SELECT slot_status,slot_count from public.slot_metrics"
				+ " where slot_area = '" + slotArea + "'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(query);
		List<SlotMetrics> slotResults = new ArrayList<SlotMetrics>();

		for (Map<String, Object> row : rows) {
			SlotMetrics slotMet = new SlotMetrics();
			slotMet.setSlotStatus((String) row.get("slot_status"));
			slotMet.setCount((int) row.get("slot_count"));
			slotResults.add(slotMet);
		}
		
		String query1 = " select sum(slot_count) from public.slot_metrics" 
				+ " where slot_area = '" + slotArea + "'";
		totalSlot = getJdbcTemplate().queryForObject(query1,Integer.class);
		
		SlotStatus slotStatus = new SlotStatus(totalSlot, slotResults);
		return slotStatus;

	}

	@Override
	public List <ItemDetails> getitemDetails() {
		String query = "SELECT item_nbr,item_desc,item_qty from public.item";
		List <Map<String, Object>> rows = getJdbcTemplate().queryForList(query);
		List <ItemDetails> itemDetails = new ArrayList<>();
		
		for (Map<String, Object> row:rows){
			
			ItemDetails itemDet = new ItemDetails();
			itemDet.setItemNbr((int)row.get("item_nbr"));
			itemDet.setItemDesc((String)row.get("item_desc"));
			itemDet.setItemQty((int)row.get("item_qty"));
			itemDetails.add(itemDet);
		}
		
		return itemDetails;
	}

}