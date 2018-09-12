package com.evaluationmanager.common;


import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ExcelModel {
	/**
	 * excel模板信息配置位置
	 */
	private static final String CONFIGPATH = "excel/model.xml";
	/**
	 * 项目的classpath路径
	 */
	public static final String CLASSPATH;
	/**
	 * 配置文档的根节点
	 */
	private static Element root;
	
	public static final String STUDENT = "student";
	public static final String TEACHER = "teacher";
	public static final String MAJOR = "major";
	public static final String CLASS = "class";
	public static final String DEPARTMENT = "department";
	
	static {
		CLASSPATH = ExcelModel.class.getClassLoader().getResource("/").getPath();
		try {
			SAXReader reader = new SAXReader();
			Document read = reader.read(CLASSPATH+CONFIGPATH);
			root = read.getRootElement();
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 获取文件信息配置集合
	 * @Author 陈彦磊
	 * @DateTime 2018年8月19日-上午1:31:21
	 * @Description 作用描述
	 *
	 * @return
	 */
	public static List<Node> getFiles() {
		List<Node> files = new ArrayList<>();
		@SuppressWarnings("unchecked")
		List<Element> elements = root.elements("file");
		elements.forEach(element -> {
			String name = element.attribute("name").getText();
			String fileName = element.getText();
			files.add(new Node(name, fileName,getPath()));
		});
		return files;
	}
	/**
	 * 获取文件的父路径
	 * @Author 陈彦磊
	 * @DateTime 2018年8月19日-上午1:31:30
	 * @Description 作用描述
	 *
	 * @return
	 */
	public static String getPath() {
		 return root.attribute("path").getText();
	}
	/**
	 * 文件集合中元素类
	 * @Author 陈彦磊
	 * @DateTime 2018年8月19日-上午1:31:51
	 * @Description 作用描述
	 *
	 */
	public static class Node {
		public final String name;
		public final String fileName;
		public final String parentPath;
		public Node(String name, String fileName,String parentPath) {
			super();
			this.name = name;
			this.fileName = fileName;
			this.parentPath = parentPath;
		}
		
	}
}