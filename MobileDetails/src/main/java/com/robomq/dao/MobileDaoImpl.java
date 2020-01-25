package com.robomq.dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.robomq.pojo.Mobile;
import com.robomq.pojo.MobileMapper;

@Component
public class MobileDaoImpl implements MobileDao {

	JdbcTemplate jdbcTemplate;

	private final String SQL_FIND_MOBILE = "select * from Mobile where id = ?";
	private final String SQL_DELETE_PERSON = "delete from Mobile where id = ?";
	private final String SQL_UPDATE_PERSON = "update Mobile set name = ?, price = ?,  qty = ?,description=? where id = ?";
	private final String SQL_GET_ALL = "select * from Mobile";
	private final String SQL_INSERT_PERSON = "insert into Mobile(id,name,price,qty,description) values(?,?,?,?,?)";

	@Autowired
	public MobileDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Mobile getMobileById(int id) {
		return jdbcTemplate.queryForObject(SQL_FIND_MOBILE, new Object[] { id }, new MobileMapper());
	}

	public List<Mobile> getAllMobiles() {
		return jdbcTemplate.query(SQL_GET_ALL, new MobileMapper());
	}

	public boolean deleteMobile(Mobile mobile) {
		return jdbcTemplate.update(SQL_DELETE_PERSON, mobile.getId()) > 0;
	}

	public boolean updateMobile(Mobile mobile) {
		return jdbcTemplate.update(SQL_UPDATE_PERSON, mobile.getName(), mobile.getPrice(),
				mobile.getQty(), mobile.getDesc(),mobile.getId())> 0;
	}

	public boolean createMobile(Mobile mobile) {
		return jdbcTemplate.update(SQL_INSERT_PERSON, mobile.getId(), mobile.getName(), mobile.getPrice(),
				mobile.getQty(), mobile.getDesc()) > 0;
	}

}