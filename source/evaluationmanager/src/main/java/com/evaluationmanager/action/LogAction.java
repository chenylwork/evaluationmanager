package com.evaluationmanager.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.evaluationmanager.entiy.LoginLog;
import com.evaluationmanager.service.LogService;
import com.evaluationmanager.support.Action;
@Controller("logAction")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LogAction extends Action<LoginLog>{

	/**
	 * 
	 * @Author 任少华
	 * @Datetime 2018年7月30日-下午2:24:47
	 * @Description 描述信息：登录日志action
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private LogService logService;
	private long id;
	private LoginLog loginLog=new LoginLog();
	private List<LoginLog> loginLogList;
	private String[] batchID; 
	@Override
	public LoginLog getModel() {
		// TODO Auto-generated method stub
		return loginLog;
	}
	
	public String[] getBatchID() {
		return batchID;
	}

	public void setBatchID(String[] batchID) {
		this.batchID = batchID;
	}

	public String add(){
		//this.logService.add(user, request);
		return INSERT_LOGINLOG;
	}
	public String update(){
		this.logService.update(loginLog);
		return UPDATE_LOGINLOG;
		
	}
	public String delete(){
		this.logService.delete(loginLog);
		return pagin();
	}
	public String getAll(){
		loginLogList=this.logService.getAll();
		return GETALL_LOGINLOG;
		
	}
	public String pagin() {
		logService.paginSearch(paginMap, loginLog);
		return GETALL_LOGINLOG;
	}
	
	public String batch() {
		System.out.println(logService.batchDelete(batchID));
		logService.batchDelete(batchID);
		return pagin();
	}
	
	public long getStudentByID(){
		return id;
	}
	//get set方法
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LoginLog getLoginLog() {
		return loginLog;
	}
	public void setLoginLog(LoginLog loginLog) {
		this.loginLog = loginLog;
	}
	public List<LoginLog> getLoginLogList() {
		return loginLogList;
	}
	public void setLoginLogList(List<LoginLog> loginLogList) {
		this.loginLogList = loginLogList;
	}
	

}
