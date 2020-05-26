package com.rent.manger.util;

import com.rent.manger.util.Context;

/**
 * @author FRANK
 * @data 2019/1/3 0003 21:01
 */
public interface Result extends Context {

	/**
	 * Set message
	 * 
	 * @param message
	 */
	public void setMessage(String message);
	
	/**
	 * Get message.
	 * 
	 * @return
	 */
	public String getMessage();
	
	/**
	 * Set code.
	 * 
	 * @param code
	 */
	public void setCode(String code);
	
	/**
	 * Get code.
	 * 
	 * @return
	 */
	public String getCode();
	
	/**
	 * Set success.
	 * 
	 * @param isSuccess
	 */
	public void setSuccess(boolean isSuccess);
	
	/**
	 * Get success;
	 * 
	 * @return
	 */
	public boolean isSuccess();
	
	/**
	 * 设置为默认成功
	 * isSuccess为true
	 * code为10000
	 * message为操作成功
	 * 
	 */
	public void defaultSuccess();
	/**
	 * 默认失败
	 */
	MapResult defaultFail();
	/**
	 * 默认失败带参数
	 */
	MapResult defaultFail(String msg);

}
