package com.rent.manger.util;/*
package com.factoring.scf.common.json.jackson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

*/
/**
 * @author FRANK
 * @data 2019/1/3 0003 21:01
 *//*

public class JsonReader {
	
	private String json;
	
	private File configFile;
	
	private InputStream configResource;

	public JsonReader(String json) {
		this.json = json;
	}
	
	public JsonReader(File configFile) {
		this.configFile = configFile;
	}
	
	public JsonReader(InputStream configResource) {
		this.configResource = configResource;
	}
	
	*/
/**
	 * 
	 * @return
	 *//*

	public String getJson(){
		
		if(json!=null) return json;
		
		if(configFile != null) read(configFile);
		
		if(configResource != null) read(configResource);
		
		return json;
	}
	
	*/
/**
	 * 
	 * @return
	 *//*

	@SuppressWarnings("rawtypes")
	public Map readJson(){
		
		String json = getJson();
		
		if(json == null) return null;
		
		return JsonUtil.readJson(json);
	}

	@SuppressWarnings({"unchecked" })
	public List<Map<String, Object>> readJsonArray(){
		
		String json = getJson();
		
		if(json == null) return null;
		
		return JsonUtil.readJson(json,ArrayList.class);
	}
	
	*/
/**
	 * 
	 * @param configResource
	 *//*

	private void read(InputStream configResource) {
		
		try{
			
			FileReader reader = new FileReader(configResource);
			reader.setAnnotation("#");
			json = reader.readContent();
			
			reader.close();
			
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		
	}

	*/
/**
	 * 
	 * @param configFile
	 *//*

	private void read(File configFile) {
		try {
			read(new FileInputStream(configFile));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	*/
/**
	 * 
	 * @throws IOException
	 *//*

	public void close() throws IOException {
		if(configResource!=null) configResource.close();
	}
	
	@SuppressWarnings("unchecked")
	public Map<String,Object> readMap(){
		return JsonUtil.readJson(getJson());
	}
	
	*/
/**
	 * 
	 * @param clazz
	 * @return
	 *//*

	public <T> T readBean(Class<T> clazz){
		return JsonUtil.readJson(getJson(),clazz);
	}
	
	*/
/**
	 * 
	 * @param clazz
	 * @return
	 *//*

	public <T> List<T> readList(Class<T> clazz){
		return JsonUtil.readList(getJson(),clazz);
	}
	
}
*/
