package com.bw.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.bean.Dytv;
import com.bw.mapper.DytvDao;

@Service
public class DytvServiceImpl implements DytvService{

	@Resource
	private DytvDao dao;
	public List<Dytv> getDytvList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.getDytvList(map);
	}
	public int delallDytv(String ids) {
		// TODO Auto-generated method stub
		return dao.delallDytv(ids);
	}
	public int updatedcode(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.updatedcode(map);
	}
	public int updatedcodea(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.updatedcodea(map);
	}

}
