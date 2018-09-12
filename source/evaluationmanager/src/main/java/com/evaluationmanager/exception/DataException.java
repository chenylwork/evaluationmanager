package com.evaluationmanager.exception;

/**
 * @Author 陈彦磊
 * @DateTime 2018年7月27日-下午4:19:33
 * @Description 数据操作异常定义
 */
public class DataException extends Exception{

	/**
	 * @Author 陈彦磊
	 * @DateTime 2018年7月27日-下午4:20:13
	 * @Description 作用描述
	 */
	private static final long serialVersionUID = 7633961441430090602L;
	
	public DataException() {
		
	}
	
	public DataException(String message) {
		this.printStackTrace();
	}
	
	
}
