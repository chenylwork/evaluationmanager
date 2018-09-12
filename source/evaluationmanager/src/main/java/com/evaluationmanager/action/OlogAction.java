package com.evaluationmanager.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.evaluationmanager.entiy.OperationLog;
import com.evaluationmanager.service.OlogService;
import com.evaluationmanager.support.Action;
/**
 * 
 * 
 * @Author 任少华
 * @Datetime 2018年7月30日-下午2:56:19
 * @Description 描述信息：操作日志OlogAction
 *
 */
@Controller("ologAction")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class OlogAction extends Action<OperationLog>{

	private static final long serialVersionUID = 1L;
	@Autowired
	private OlogService ologService;
	private long id;
	private OperationLog operationLog = new OperationLog();
	private List<OperationLog> operationLogList;
	private String[] batchID; 
	@Override
	public OperationLog getModel() {
		// TODO Auto-generated method stub
		return operationLog;
	}
	public String add(){
		//this.ologService.add(user, operation, state);
		return INSERT_OPERATIONLOG;
	}
	public String update(){
		this.ologService.update(operationLog);
		return UPDATE_OPERATIONLOG;
	}
	public String delete(){
		this.ologService.delete(operationLog);
		return pagin();
	}
	public String getAll(){
		operationLogList = this.ologService.getAll();
		return GETALL_OPERATIONLOG;
	}
	public String pagin() {
		String paginSearch = ologService.paginSearch(paginMap,operationLog);
		System.out.println(paginSearch);
		return GETALL_OPERATIONLOG;
	}
	public String batch() {
		System.out.println("batchId:"+batchID);
		ologService.batchDelete(batchID);
		return pagin();
	}
	public long getOperationLogByID(){
		return id;
	}
	//get set
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public OperationLog getOperationLog() {
		return operationLog;
	}
	public void setOperationLog(OperationLog operationLog) {
		this.operationLog = operationLog;
	}
	public List<OperationLog> getOperationLogList() {
		return operationLogList;
	}
	public void setOperationLogList(List<OperationLog> operationLogList) {
		this.operationLogList = operationLogList;
	}
	public String[] getBatchID() {
		return batchID;
	}
	public void setBatchID(String[] batchID) {
		this.batchID = batchID;
	}
	
}
