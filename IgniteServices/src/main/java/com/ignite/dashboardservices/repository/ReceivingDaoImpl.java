package com.ignite.dashboardservices.repository;

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
	
	@PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }
	
	
	@Override
	public ReceivingMetrics getReceivingMetrics() {
		String query = "SELECT firstname, lastname, email" + " from orders.customer where customer.id = " + id;

		return getJdbcTemplate().queryForObject(query, (resultSet, i) -> {return new Person(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
		});		return null;
	}

}
