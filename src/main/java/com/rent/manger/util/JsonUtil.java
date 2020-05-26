package com.rent.manger.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author FRANK
 * @data 2019/1/3 0003 21:01
 */
public class JsonUtil {
	
	private static ObjectMapper mapper = new ObjectMapper();

	static{
		setDataFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));//默认时间转换
		mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);//允许使用单引号
	}

	@SuppressWarnings("rawtypes")
	public static Map readJson(String json) {
		
		try{
			return mapper.readValue(json, Map.class);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 
	 * 
	 * @param json
	 * @param clazz
	 * @return
	 */
	public static <T> T readJson(String json,Class<T> clazz){
		
		try{
			return mapper.readValue(json, clazz);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 
	 * 
	 * @param json
	 * @param clazz
	 * @return
	 */
	public static <T> List<T> readList(String json,Class<T> clazz){
		
		try{
			
			JavaType javaType = getType(ArrayList.class,clazz);
			return mapper.readValue(json, javaType);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 
	 * @param collectionClass
	 * @param elementClasses
	 * @return
	 */
	private static JavaType getType(Class<?> collectionClass, Class<?> elementClasses){
		return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
	}
	
	/**
	 * 
	 * @param obj
	 * @return
	 */
	public static String toJson(Object obj) {
//		if(obj == null) return null;
		
		try{
			StringWriter writer = new StringWriter();
			mapper.writeValue(writer, obj);
			return writer.toString();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 
	 * 转换为json格式字符串，忽略异常，出现异常时返回null
	 * 
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public static String toJsonWithoutException(Object obj){
		if(obj == null) return null;
		try{
			return toJson(obj);
		}catch(Exception e){
			
		}
		return null;
	}
	
	/**
	 * 设置默认时间转换
	 * 
	 * @param dateFormat
	 */
	public static void setDataFormat(DateFormat dateFormat){
		if(dateFormat!=null){
			mapper.setDateFormat(dateFormat);
		}
		
	}
	
}
