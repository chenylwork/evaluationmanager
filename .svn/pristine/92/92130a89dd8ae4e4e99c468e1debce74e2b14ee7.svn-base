package com.evaluationmanager.action;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.evaluationmanager.common.ExcelModel;
import com.evaluationmanager.common.ExcelModel.Node;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 文件模板下载action
 * 
 * @Author 陈彦磊
 * @DateTime 2018年8月18日-下午6:12:22
 * @Description 作用描述
 *
 */
@Controller("downloadAction")
public class DownloadAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	// 要下载的文件名
	private String file;
	
	private String message;
	
	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}
	// 我们需要提供一个方法，这个方法是一个标准的get方法，如getXxx
	// 并通过这个方法创建并返回一个InputStream给struts
	// struts就会根据这个输入流读取文件，并写回客户端
	public InputStream getInputStream() throws Exception {
		String path = ExcelModel.getPath()+decode(file);
		// 根据路径结合提交过来的文件名，创建一个File对象
		String realPath = ServletActionContext.getServletContext().getRealPath("/"+path);
		// 创建InputStream对象
		BufferedInputStream stream = new BufferedInputStream(new FileInputStream(new File(realPath)));
		// 返回这个输入流给struts
		return stream;
	}
	public String download() {
		String fileName = decode(file);
		for (Node node : ExcelModel.getFiles()) {
			System.out.println(fileName+"***"+node.fileName);
			if (fileName.equals(node.fileName) ) {
				return SUCCESS;
			}
		}
		message = "没有找到需要下载的文件";
		return ERROR;
	}
	
	public static String decode(String string) {
		try {
			return new String(string.getBytes("ISO8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return string;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
