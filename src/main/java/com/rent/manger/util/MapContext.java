package com.rent.manger.util;



import com.rent.manger.util.Context;
import com.rent.manger.util.JsonUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author FRANK
 * @data 2019/1/3 0003 21:01
 */
public class MapContext implements Context {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4911094073556563864L;
	
	private Map<String,Object> datas = new HashMap<String,Object>();
	
	public MapContext(){}
	
	public MapContext(Map<String,Object> datas){
		this.datas.putAll(datas);
	}

	@Override
	public String toJson() {
		return JsonUtil.toJson(datas);
	}

	@Override
	public void setData(String name, Object value) {
		boolean b = datas.keySet().contains(name);
		if (b){
			datas.remove(name);
		}
		datas.put(name, value);
	}

	@Override
	public Object getData(String name) {
		return datas.get(name);
	}

	@Override
	public Object getData(String name, Object defaultValue) {
		
		Object value = getData(name);
		
		return value == null ? defaultValue : value;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getData(String name, Class<T> clazz) {
		return (T)getData(name);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getData(String name, Class<T> clazz, T defaultValue) {
		return (T)getData(name,defaultValue);
	}

	@Override
	public String getString(String name) {
		
		Object value = getData(name);
		
		if(value == null) return null;
		
		return value instanceof String ? (String)value : value.toString();
	}

	@Override
	public String getString(String name, String defaultValue) {
		
		Object value = getData(name);
		
		if(value == null) return defaultValue;
		
		return value instanceof String ? (String)value : value.toString();
	}

	@Override
	public Integer getInteger(String name) {
		Object value = getData(name);
		
		if(value == null) return null;
		
		return value instanceof Integer ? (Integer)value : Integer.valueOf(value.toString());
	}

	@Override
	public Integer getInteger(String name, Integer defaultValue) {
		Object value = getData(name);
		
		if(value == null) return defaultValue;
		
		return value instanceof Integer ? (Integer)value : Integer.valueOf(value.toString());
	}

	@Override
	public Long getLong(String name) {
		Object value = getData(name);
		
		if(value == null) return null;
		
		return value instanceof Long ? (Long)value : Long.valueOf(value.toString());
	}

	@Override
	public Long getLong(String name, Long defaultValue) {
		Object value = getData(name);
		
		if(value == null) return defaultValue;
		
		return value instanceof Long ? (Long)value : Long.valueOf(value.toString());
	}

	@Override
	public Double getDouble(String name) {
		Object value = getData(name);
		
		if(value == null) return null;
		
		return value instanceof Double ? (Double)value : Double.valueOf(value.toString());
	}

	@Override
	public Double getDouble(String name, Double defaultValue) {
		Object value = getData(name);
		
		if(value == null) return defaultValue;
		
		return value instanceof Double ? (Double)value : Double.valueOf(value.toString());
	}

	@Override
	public Short getShort(String name) {
		Object value = getData(name);
		
		if(value == null) return null;
		
		return value instanceof Short ? (Short)value : Short.valueOf(value.toString());
	}

	@Override
	public Short getShort(String name, Short defaultValue) {
		Object value = getData(name);
		
		if(value == null) return defaultValue;
		
		return value instanceof Short ? (Short)value : Short.valueOf(value.toString());
	}

	@Override
	public List<String> keyList() {
		return new ArrayList<String>(datas.keySet());
	}

	@Override
	public boolean contains(String name) {
		return datas.containsKey(name);
	}

	@Override
	public Map<String, Object> getDatas() {
		
		Map<String, Object> map = new HashMap<String,Object>();
		
		map.putAll(datas);
		
		return map;
	}
	
	@Override
	public void setDatas(Map<String,Object> datas){
		this.datas.putAll(datas);
	}

	@Override
	public Object removeData(String name) {
		return datas.remove(name);
	}

	@Override
	public Context clone() {
		return new MapContext(datas);
	}

	public String toString(){
		return toJson();
	}

	@Override
	public List<?> getList(String name) {
		Object value = getData(name);
		if(value == null) return null;
		return (List<?>) value;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getList(String name, Class<T> clazz) {
		Object value = getData(name);
		if(value == null) return null;
		return (List<T>) value;
	}
	
}
