package com.vinci.o2o.web.superadmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vinci.o2o.entity.Area;
import com.vinci.o2o.service.AreaService;

@Controller
@RequestMapping("/superadmin/")
public class AreaController {
	@Autowired
	private AreaService areaService; 
	
	@RequestMapping(value = "listarea")
	@ResponseBody
	public Map<String,Object> listArea(){
		Map<String,Object> map = new HashMap<String,Object>();
		List<Area> list = new ArrayList<Area>();
		list = areaService.queryArea();
		map.put("rows", list);
		map.put("total", list.size());
		return map;
	}
	
}
