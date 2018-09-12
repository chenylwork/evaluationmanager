package com.evaluationmanager.unit;

import java.io.InputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * xml文件操作类
 * @Author 陈彦磊
 * @DateTime 2018年8月16日-下午11:44:16
 * @Description 作用描述
 *
 */
public class XMLUnit {
	/**
	 * 加载配置文件
	 * @Author 陈彦磊
	 * @DateTime 2018年8月16日-下午11:49:11
	 *
	 * @param filePath  配置文件的编译后路径，即classPath下路径
	 * @return InputStream 配置文件的输入流
	 */
	public static InputStream loadFile(String filePath) {
		return XMLUnit.class.getClassLoader().getResourceAsStream(filePath);
	}
	/**
	 * 读取xml配置文档
	 * @Author 陈彦磊
	 * @DateTime 2018年8月17日-上午12:00:28
	 * @Description 作用描述
	 *
	 * @param filePath 配置文件的编译后路径，即classPath下路径
	 * @return Map<String, String> 读取到的配置信息
	 */
	@SuppressWarnings("unchecked")
	public static NoMap<String, String> readDocument(String filePath) {
//		Map<String, String> result = new HashMap<>();
		NoMap<String, String>  result = new NoMap<>();
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(loadFile(filePath));
			Element rootElement = document.getRootElement();
			List<Element> elements = rootElement.element("head").element("names").elements("name");
			elements.forEach((property) -> {
				String key = property.attribute("key").getText();
				String value = property.attribute("value").getText();
				result.put(key, value);
			});
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
