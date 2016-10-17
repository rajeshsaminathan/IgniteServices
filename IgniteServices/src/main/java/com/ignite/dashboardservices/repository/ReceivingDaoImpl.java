package com.ignite.dashboardservices.repository;


import java.sql.Timestamp;

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
    private void initialize(){
        setDataSource(dataSource);
    }
	
	
	@Override
	public ReceivingMetrics getReceivingMetrics(String palletId) {
		/**String query = "SELECT pallet, rcvd_qty,rcvd_date::timestamp" + " from public.receiving_log where receiving_log.pallet = " +palletId ;**/
		String query = "SELECT pallet, rcvd_qty,rcvd_date::timestamp" + " from public.receiving_log";

		return getJdbcTemplate().queryForObject(query, (resultSet, i) -> {return new ReceivingMetrics(resultSet.getString(1),resultSet.getInt(2),resultSet.getTimestamp(3));
		});
		}

}
