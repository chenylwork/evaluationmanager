package com.evaluationmanager.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author 陈彦磊
 * @DateTime 2018年8月22日-下午3:14:04
 * @Description 作用描述
 */
public class Main {
	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/evaluationmanager";
		String user = "root";
		String password = "ROOT";
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
	
	}
}
