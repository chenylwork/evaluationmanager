package com.evaluationmanager.dao;
/**
 * 
 * @author 耿佳康
 * @date 2018年8月26日-上午 11:24:30
 * @description 数据库备份和还原
 */
public interface DataDao {
   /**
    * 
    * @param hostIP MySQL数据库所在服务器地址IP 
    * @param userName 数据库用户名 
    * @param password 进入数据库所需要的密码 
    * @param importFilePath 数据库文件路径 
    * @param sqlFileName 数据库文件名 
    * @param databaseName 要导入的数据库名 
    * @return
    */
	public int Databackup(String hostIP, String userName, String password, String importFilePath, String sqlFileName, String databaseName);
	/**
	 * 数据库还原
	 * @return
	 */
    public int Datarestore();
    
    /**
     * 获取系统mysql安装路径
     */
    public String getDataUrl();



}
