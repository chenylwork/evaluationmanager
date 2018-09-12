package com.evaluationmanager.unit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;
/**
 * @Author 耿佳康
 * @DateTime 2018年8月26日-下午3:14:04
 * @Description 数据库备份与恢复工具类
 */
@Repository("databaseUnit")
public class DatabaseUnit {
  //获取数据库安装路径
  public static String getMysqlUrl(){
	    String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/evaluationmanager";
		String user = "root";
		String password = "";
		Connection connection= null;
		String path = "";
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			PreparedStatement prepareStatement = connection.prepareStatement("select @@basedir as basePath from dual");
			ResultSet resultSet = prepareStatement.executeQuery();
			while(resultSet.next()) {
				path = resultSet.getString("basePath");
			}
			System.err.println(path);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	  return path;
	
  }
  
  /**
	* MySQL数据库备份
	*
	* @author 耿佳康
	*/

	/**
	* 实现MySQL数据库备份
	*
	* @author 耿佳康
	* @param hostIP MySQL数据库所在服务器地址IP
	* @param userName 进入数据库所需要的用户名
	* @param password 进入数据库所需要的密码
	* @param savePath 数据库导出文件保存路径
	* @param fileName 数据库导出文件文件名
	* @param databaseName 要导出的数据库名
	* @return 返回true表示导出成功，否则返回false。
	*/
	public static boolean exportDatabaseTool(String hostIP, String userName, String password, String savePath, String fileName, String databaseName) {
	File saveFile = new File(savePath);
	if (!saveFile.exists()) {// 如果目录不存在
	saveFile.mkdirs();// 创建文件夹
	}
	if (!savePath.endsWith(File.separator)) {
	savePath = savePath + File.separator;
	}
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append("mysqldump").append(" --opt").append(" -h").append(hostIP);
	stringBuilder.append(" --user=").append(userName) .append(" --password=").append(password).append(" --lock-all-tables=true");
	stringBuilder.append(" --result-file=").append(savePath + fileName).append(" --default-character-set=utf8 ").append(databaseName);
	try {
		System.out.println(stringBuilder.toString());
		String mysqlurl=getMysqlUrl()+"bin/";
		//C:/wamp64/bin/mysql/mysql5.7.21/bin/
	Process process = Runtime.getRuntime().exec(mysqlurl+stringBuilder.toString());
	if (process.waitFor() == 0) {// 0 表示线程正常终止。
	return true;
	}
	} catch (IOException e) {
	e.printStackTrace();
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
	return false;
	}
	
	/** 
     * 实现MySQL数据库导入 
     *  
     * @author 耿佳康 
     * @param hostIP MySQL数据库所在服务器地址IP 
     * @param userName 数据库用户名 
     * @param password 进入数据库所需要的密码 
     * @param importFilePath 数据库文件路径 
     * @param sqlFileName 数据库文件名 
     * @param databaseName 要导入的数据库名 
     * @return 返回true表示导入成功，否则返回false。 
     */  
    public static boolean importDatabase(String hostIP, String userName, String password, String importFilePath, String sqlFileName, String databaseName) {
		Runtime runtime = Runtime.getRuntime();
		String mysqlurl=getMysqlUrl()+"bin/";
		Process process = null;
		try {
//			String mul = "cmd /c " + binPathMySql
//					+ "mysql -h127.0.0.1 -uroot -p1234 --default-character-set=utf8 evaluationteachmanage";
			String mul = "cmd /c " + mysqlurl
					+ "mysql -h127.0.0.1 -uroot --default-character-set=utf8 " + databaseName;
			process = runtime.exec(mul);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OutputStream outputStream = process.getOutputStream();

		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(importFilePath+sqlFileName), "UTF-8"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = null;
		StringBuffer sb = new StringBuffer();
		try {
			while ((str = br.readLine()) != null) {
				sb.append(str + "\r\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		str = sb.toString();
//		 try {
//		 String string = new String(sb.toString().getBytes(),"utf-8");
//		 str=string;
//		 } catch (Exception e1) {
//		 // TODO Auto-generated catch block
//		 e1.printStackTrace();
//		 }
		
		try {
			OutputStreamWriter writer = new OutputStreamWriter(outputStream, "utf-8");
			writer.write(str);
			writer.flush();
			outputStream.close();
			br.close();
			writer.close();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
//        File saveFile = new File(importFilePath);  
//        if (!saveFile.exists()) {// 如果目录不存在  
//            saveFile.mkdirs();// 创建文件夹  
//        }  
//        if (!importFilePath.endsWith(File.separator)) {  
//            importFilePath = importFilePath + File.separator;  
//        }         
//  
//        StringBuilder stringBuilder=new StringBuilder();  
//        stringBuilder.append("mysqldump").append(" -h").append(hostIP);  
//        stringBuilder.append(" -u").append(userName);
//        //.append(" -p").append(password)
//        stringBuilder.append(" ").append(databaseName);  
//        stringBuilder.append(" <").append(importFilePath).append(sqlFileName);  
//        try {  
//        	System.out.println(stringBuilder.toString());
//        	//cmd/c
//        	String mysqlurl=getMysqlUrl()+"bin\\";
//            Process process = Runtime.getRuntime().exec("cmd /c "+mysqlurl+stringBuilder.toString());//必须要有“cmd /c ”  
//            System.out.println("cmd /c "+mysqlurl+stringBuilder.toString());
//            if (process.waitFor() == 0) {// 0 表示线程正常终止。  
//                return true;  
//            }  
//        } catch (IOException e) {  
//            e.printStackTrace();  
//        } catch (InterruptedException e) {  
//            e.printStackTrace();  
//        }  
//        return false;  
    }  

////   已测试成功
//    public static void main(String[] args) throws InterruptedException {
//    	
//    	String hostIP="localhost";//MySQL数据库所在服务器地址IP
//    	String userName="root";//进入数据库所需要的用户名
//    	String password="";//进入数据库所需要的密码
//        String importFilePath="D:/backupDatabase/";//数据库导出文件保存路径
//        String sqlFileName="db.sql";//数据库导出文件文件名
//        String databaseName="evaluationmanager";//要导出的数据库名
//        
//        if (importDatabase(hostIP, userName, password, importFilePath, sqlFileName, databaseName)) {  
//            System.out.println("数据库导入成功！！！");  
//        } else {  
//            System.out.println("数据库导入失败！！！");  
//        }  
//    }  	
//public static void main(String[] args) throws InterruptedException {
//	String hostIP="localhost";//MySQL数据库所在服务器地址IP
//	String userName="root";//进入数据库所需要的用户名
//	String password="ROOT";//进入数据库所需要的密码
//    String savePath="D:/backupDatabase";//数据库导出文件保存路径
//    String fileName="2018-8-23.sql";//数据库导出文件文件名
//    String databaseName="evaluationmanager";//要导出的数据库名
//	if (exportDatabaseTool(hostIP,userName,password,savePath,fileName,databaseName)) {
//	System.out.println("数据库备份成功！！！");
//	} else {
//	System.out.println("数据库备份失败！！！");
//	}
//	} 
  
  
}
