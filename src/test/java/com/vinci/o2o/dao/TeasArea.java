package com.vinci.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.vinci.o2o.BaseTest;
import com.vinci.o2o.entity.Area;

public class TeasArea extends BaseTest{
	@Autowired
	private AreaDao areaDao;
	
	@Test
	public void testQuery() {
		List<Area> list = areaDao.queryArea();
		assertEquals(2, list.size());
	}
	
	
}
