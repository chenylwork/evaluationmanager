package com.evaluationmanager.support;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.evaluationmanager.common.Pagin;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 所有Action类的父类
 * 定义Action类中方法的返回值信息，用于struts配置文件的配置
 * @author chenyl
 * @DateTime 2018年7月25日-上午10:25:24
 *
 */
public abstract class Action<T> extends ActionSupport implements ResultConfig, ModelDriven<T>{

	/**
	 * 序列化号
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	protected Gson gson;
	protected String data;
	/**
	 * 普通分页对象
	 */
	protected Pagin<T> pagin;
	/**
	 * map类型分页对象
	 */
	protected Pagin<Map<String,Object>> paginMap;
	/**
	 * 下载文件名称
	 */
	protected String fileName;
	/**
	 * 上传的文件
	 */
	protected File file;
	/**
	 * map<String,String>类型list集合
	 */
	protected List<Map<String, String>> listMapData; 
	/**
	 * 返回的json数组数据，该变量中存储的本次请求的json数组数据。
	 */
	protected JsonArray JSON_ARRAY_DATA;
	
	/**
	 * 返回的json字符串数据，该变量中存储的本次请求的json字符串型数据。
	 */
	
	protected String JSON_CHAR_DATA;
	
	/**
	 * 提示消息
	 */
	protected String message;
	
	
	/**
	 * 中文乱码处理
	 * @Author 陈彦磊
	 * @DateTime 2018年8月19日-上午2:07:59
	 * @Description 作用描述
	 *
	 * @param string
	 * @return
	 */
	public static String decode(String string) {
		try {
			if(string.getBytes("UTF-8").length != string.length()) {
				System.err.println("*************************"+new String(string.getBytes("ISO8859-1"), "UTF-8"));
				return new String(string.getBytes(), "UTF-8");
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("*************1************"+string);
		return string;
	}
	
	public JsonArray getJSON_ARRAY_DATA() {
		return JSON_ARRAY_DATA;
	}
	public void setJSON_ARRAY_DATA(JsonArray jSON_ARRAY_DATA) {
		JSON_ARRAY_DATA = jSON_ARRAY_DATA;
	}
	public String getJSON_CHAR_DATA() {
		return JSON_CHAR_DATA;
	}
	public void setJSON_CHAR_DATA(String jSON_CHAR_DATA) {
		JSON_CHAR_DATA = jSON_CHAR_DATA;
	}
	public Pagin<T> getPagin() {
		return pagin;
	}
	public void setPagin(Pagin<T> pagin) {
		this.pagin = pagin;
	}
	public Pagin<Map<String, Object>> getPaginMap() {
		return paginMap;
	}
	public void setPaginMap(Pagin<Map<String, Object>> paginMap) {
		this.paginMap = paginMap;
	}
	public String getFileName() {
		return decode(fileName);
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public List<Map<String, String>> getListMapData() {
		return listMapData;
	}

	public void setListMapData(List<Map<String, String>> listMapData) {
		this.listMapData = listMapData;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}

