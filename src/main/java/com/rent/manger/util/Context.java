package com.rent.manger.util;

import com.rent.manger.util.JsonPojo;

import java.util.List;
import java.util.Map;

/**
 * @author FRANK
 * @data 2019/1/3 0003 21:01
 */
public interface Context extends JsonPojo,Cloneable{

	/**
	 * Set data.
	 * 
	 * @param name
	 * @param value
	 */
	public void setData(String name, Object value);
	
	/**
	 * Get data.
	 * 
	 * @param name
	 * @return
	 */
	public Object getData(String name);
	
	/**
	 * Get data。
	 * 
	 * @param name 
	 * @param defaultValue 
	 * @return return defaultValue if name is not exist
	 */
	public Object getData(String name, Object defaultValue);
	
	/**
	 * Get data.
	 * 
	 * @param name
	 * @param clazz
	 * @return
	 */
	public <T> T getData(String name, Class<T> clazz);
	
	/**
	 * Get data.
	 * 
	 * @param name
	 * @param clazz
	 * @param defaultValue 
	 * @return return defaultValue if name is not exist or value is null
	 */
	public <T> T getData(String name, Class<T> clazz, T defaultValue);
	
	/**
	 * Get String data.
	 * 
	 * @param name
	 * @return
	 */
	public String getString(String name);
	
	/**
	 * Get String data.
	 * 
	 * @param name
	 * @param defaultValue 
	 * @return return defaultValue if name is not exist or value is null
	 */
	public String getString(String name, String defaultValue);
	
	/**
	 * Get Integer data.
	 * 
	 * @param name
	 * @return
	 */
	public Integer getInteger(String name);
	
	/**
	 * Get Integer data.
	 * 
	 * @param name
	 * @param defaultValue 
	 * @return return defaultValue if name is not exist or value is null
	 */
	public Integer getInteger(String name, Integer defaultValue);
	
	/**
	 * Get Integer data.
	 * 
	 * @param name
	 * @return
	 */
	public Long getLong(String name);
	
	/**
	 * Get Integer data.
	 * 
	 * @param name
	 * @param defaultValue 
	 * @return return defaultValue if name is not exist or value is null
	 */
	public Long getLong(String name, Long defaultValue);
	
	/**
	 * Get Integer data.
	 * 
	 * @param name
	 * @return
	 */
	public Double getDouble(String name);
	
	/**
	 * Get Integer data.
	 * 
	 * @param name
	 * @param defaultValue 
	 * @return return defaultValue if name is not exist or value is null
	 */
	public Double getDouble(String name, Double defaultValue);
	
	/**
	 * Get Integer data.
	 * 
	 * @param name
	 * @return
	 */
	public Short getShort(String name);
	
	/**
	 * Get Integer data.
	 * 
	 * @param name
	 * @param defaultValue 
	 * @return return defaultValue if name is not exist or value is null
	 */
	public Short getShort(String name, Short defaultValue);
	
	/**
	 * Get List.
	 * 
	 * @param name
	 * @return
	 */
	public List<?> getList(String name);
	
	/**
	 * Get List.
	 * 
	 * @param name
	 * @param clazz 
	 * @return 
	 */
	public <T> List<T> getList(String name, Class<T> clazz);
	
	/**
	 * List keys.
	 * 
	 * @return
	 */
	public List<String> keyList();
	
	/**
	 * If contains key.
	 * 
	 * @param name
	 * @return
	 */
	public boolean contains(String name);
	
	/**
	 * 获取所有参数
	 * 
	 * @return
	 */
	public Map<String,Object> getDatas();
	
	/**
	 * 
	 * @param datas
	 */
	public void setDatas(Map<String, Object> datas);

	/**
	 * 移除data
	 * 
	 * @param name
	 * @return
	 */
	public Object removeData(String name);
	
	/**
	 * 复制Context
	 * 
	 * @return
	 */
	public Context clone();
	
}
