package com.evaluationmanager.common;

import com.evaluationmanager.unit.NoMap;
import com.evaluationmanager.unit.XMLUnit;

/**
 * Excel文件表头信息操作
 * 
 * @Author 陈彦磊
 * @DateTime 2018年8月17日-上午12:20:25
 * @Description 作用描述
 *
 */
public class ExcelHead {
	private static final String PATH_HEAD = "excel";
	public static final String STUDENT_FILE = "student.xml";
	public static final String CLASS_FILE = "class.xml";
	public static final String TEACHER_FILE = "teacher.xml";

	/**
	 * 获取表头信息
	 * 
	 * @Author 陈彦磊
	 * @DateTime 2018年8月17日-上午12:17:21
	 * @Description 作用描述
	 *
	 * @param fileName
	 * @return
	 */
	public static NoMap<String, String> getHeadNames(String fileName) {
		return XMLUnit.readDocument(PATH_HEAD + "/" + fileName);
	}

	public static String[] getImportHeadNames(String fileName) {
		return getHeadNames(fileName).keys().toArray(new String[]{});
	}

	public static String[] getExportHeadNames(String fileName) {
		return getHeadNames(fileName).values().toArray(new String[]{});
	}
}
