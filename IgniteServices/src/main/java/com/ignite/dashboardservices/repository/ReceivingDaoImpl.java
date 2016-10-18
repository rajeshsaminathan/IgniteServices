package com.ignite.dashboardservices.repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.ignite.dashboardservices.model.ReceivingMetrics;

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
				+ " from public.receiving_log where receiving_log.pallet = " + palletId;

		return getJdbcTemplate().queryForObject(query, (resultSet, i) -> {
			return new ReceivingMetrics(resultSet.getString(1), resultSet.getInt(2), resultSet.getTimestamp(3));
		});
	}

	public List<ReceivingMetrics> getallReceivingMetrics() {
		String query = "SELECT pallet, rcvd_qty,rcvd_date::timestamp" + " from public.receiving_log";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(query);
		List<ReceivingMetrics> result = new ArrayList<ReceivingMetrics>();
		for (Map<String, Object> row : rows) {
			ReceivingMetrics rcvMetrics = new ReceivingMetrics();
			rcvMetrics.setPallet((String) row.get("pallet"));
			rcvMetrics.setRcvdQty((int) row.get("rcvd_qty"));
			rcvMetrics.setRcvdDate((Timestamp) row.get("rcvd_date"));
			result.add(rcvMetrics);
		}
		return result;
	}

}
