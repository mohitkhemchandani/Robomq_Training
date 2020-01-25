package com.robomq.dao;

import java.util.List;

import com.robomq.pojo.Mobile;


public interface MobileDao {
	Mobile getMobileById(int id);

	List<Mobile> getAllMobiles();

	boolean deleteMobile(Mobile mobile);

	boolean updateMobile(Mobile mobile);

	boolean createMobile(Mobile mobile);

}
