package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.bean.Dytv;

public interface DytvService {
	public List<Dytv> getDytvList(Map<String, Object> map);
	public int delallDytv(String ids);
	public int updatedcode(Map<String, Object> map);
	public int updatedcodea(Map<String, Object> map);
}
