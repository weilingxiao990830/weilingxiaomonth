package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.bean.Dytv;
import com.bw.service.DytvService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class DytvController {

	@Resource
	private DytvService ser;
	//列表及模糊查询
	@RequestMapping("/getDytvList")
	public String getDytvList(Integer duptime,Integer ddowtime,Integer cuptime,Integer cdowtime,Integer uptime,Integer dowtime,Model model,@RequestParam(defaultValue="1")Integer pagenum,String dname,String person,String dyear,String starttime,String endtime,Integer startmoney,Integer endmoney,Integer start,Integer end){
		PageHelper.startPage(pagenum,2);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("dname",dname );
		map.put("person",person );
		map.put("dyear",dyear );
		map.put("starttime",starttime );
		map.put("endtime",endtime );
		map.put("startmoney",startmoney );
		map.put("endmoney",endmoney );
		map.put("start",start );
		map.put("end",end );
		map.put("uptime",uptime );
		map.put("dowtime",dowtime );
		map.put("cuptime",cuptime );
		map.put("cdowtime",cdowtime );
		map.put("duptime",duptime );
		map.put("ddowtime",ddowtime );
		List<Dytv> list = ser.getDytvList(map);
		PageInfo<Dytv> page=new PageInfo<Dytv>(list);
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		return "list";
	}
	//删除
	@RequestMapping("/delallDytv")
	@ResponseBody
	public int delallDytv(String ids){
		int i = ser.delallDytv(ids);
		return i;
	}
	//下架
	@RequestMapping("/updatedcode")
	@ResponseBody
	public int updatedcode(Integer did,Integer dcode){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("did", did);
		map.put("dcode", dcode);
		int i = ser.updatedcode(map);
		return i;
	}
	
	//上架
	@RequestMapping("/updatedcodea")
	@ResponseBody
	public int updatedcodea(Integer did,Integer dcode){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("did", did);
		map.put("dcode", dcode);
		int i = ser.updatedcodea(map);
		return i;
	}
}
