package com.vinci.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.vinci.o2o.BaseTest;
import com.vinci.o2o.entity.Area;

public class TestAreaService extends BaseTest{
	@Autowired
	private AreaService areaService;
	
	@Test
	public void testAreaService() {
		List<Area> list = areaService.queryArea();
		assertEquals("西苑", list.get(0).getAreaName());
	}

}
