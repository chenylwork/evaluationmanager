package com.evaluationmanager.unit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Component;

import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.format.VerticalAlignment;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
/**
 * 
 * @author chenyl
 * @Date 2018年7月19日-下午12:49:16
 * @Description  分页对象，主要用来对数据分页操作
 * @param <T> 对象中存储的数据对应的实体类对应的类
 */
@Component("excelUnit")
public class ExcelUnit<T> {
	/**
	 * 导出Excel文档
	 * @Author 陈彦磊
	 * @DateTime 2018年8月15日-下午10:35:10
	 *
	 * @param title 标题
	 * @param headNames 表头
	 * @param data 内容
	 * @param outputStream 输出流
	 * @throws IOException
	 */
	public static OutputStream export(OutputStream outputStream,
			String title,String[] headNames,List<NoMap<String,String>> data) {
		WritableWorkbook workbook = null;
		try {
			workbook = Workbook.createWorkbook(outputStream);
			WritableSheet sheet = workbook.createSheet("sheet1", 1);
			// 合并单元格把单元格（column, row）到单元格（column1, row1）进行合并
			sheet.mergeCells(0, 0, headNames.length - 1, 1);
			// 创建WritableFont 字体对象，参数依次表示黑体、字号12、粗体、非斜体、不带下划线、亮蓝色
			WritableFont titleFont = new WritableFont(WritableFont.createFont("黑体"), 12, WritableFont.BOLD, false,
					UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
			// 创建WritableCellFormat对象，将该对象应用于单元格从而设置单元格的样式
			WritableCellFormat titleFormat = new WritableCellFormat();
			// 设置字体格式
			titleFormat.setFont(titleFont);
			// 设置文本水平居中对齐
			titleFormat.setAlignment(Alignment.CENTRE);
			// 设置文本垂直居中对齐
			titleFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
			// 设置背景颜色
			titleFormat.setBackground(Colour.GRAY_25);
			// 设置自动换行
			titleFormat.setWrap(true);
			// 添加Label对象，参数依次表示在第一列，第一行，内容，使用的格式
			Label titleLabel = new Label(0, 0, title, titleFormat);
			// 将定义好的Label对象添加到工作表上，这样工作表的第一列第一行的内容为‘学员考试成绩一览表’并应用了titleFormat定义的样式
			// 设置表格表头单元格样式
			WritableCellFormat cloumnTitleFormat = new WritableCellFormat();
			cloumnTitleFormat.setFont(new WritableFont(WritableFont.createFont("宋体"), 10, WritableFont.BOLD, false));
			cloumnTitleFormat.setAlignment(Alignment.CENTRE);
			sheet.addCell(titleLabel);
			// 添加表头
			for(int i=0; i<headNames.length; i++) {
				Label label = new Label(i, 2, headNames[i], cloumnTitleFormat);
				sheet.addCell(label);
			}
			// 设置表格内容单元格样式
			WritableCellFormat columnContextFormat = new WritableCellFormat();
			// 填充表内容
			for(int i=0; i<data.size(); i++) {
				NoMap<String,String> map = data.get(i);
//				String[] array = map.keySet().toArray(new String[]{});
				for(int j=0;j<map.listK.size();j++) {
					String value = map.listV.get(j);
					if(value == null) {
						value = "";
					}
					// 设置列宽自适应
					//一个中文占2个字节，经过调试+4后效果比较理想
					sheet.setColumnView(i,value.getBytes().length); 
					sheet.addCell(new Label(j,i+3,value,columnContextFormat));
				}
			}
			// 输出到指定介质
			workbook.write();
			// 关闭输出流
			workbook.close();
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outputStream;
	}
	/**
	 * 加载Excel文件
	 * @Author 陈彦磊
	 * @DateTime 2018年8月16日-下午10:42:49
	 * @Description 作用描述
	 *
	 * @param inputStream 输入流
	 * @param headNames 数据标题头
	 */
	public static List<Map<String, String>> load(InputStream inputStream,String[] headNames) {
		List<Map<String, String>> list = new ArrayList<>();
		try {
			Workbook workbook = Workbook.getWorkbook(inputStream);
			Sheet sheet = workbook.getSheet(0);
			int rows = sheet.getRows();
			for(int i=3; i<rows; i++) {
				Map<String, String> map = new HashMap<>();
				for(int j=0; j<headNames.length; j++) {
					map.put(headNames[j], sheet.getCell(j, i).getContents());
				}
				list.add(map);
			}
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Map<String, String>> load(File file,String[] headNames) throws FileNotFoundException {
		return load(new FileInputStream(file), headNames);
	}
}
