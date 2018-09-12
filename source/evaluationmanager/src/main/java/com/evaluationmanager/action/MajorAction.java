package com.evaluationmanager.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.evaluationmanager.entiy.Code;
import com.evaluationmanager.entiy.Major;
import com.evaluationmanager.entiy.OperationLog;
import com.evaluationmanager.exception.DataException;
import com.evaluationmanager.service.DepartmentService;
import com.evaluationmanager.service.MajorService;
import com.evaluationmanager.service.OlogService;
import com.evaluationmanager.support.Action;

/**
 * 
 * 
 * @Author 任少华
 * @Datetime 2018年7月30日-上午10:28:09
 * @Description 描述信息：专业操作信息action
 *
 */
@Controller("majorAction")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MajorAction extends Action<Major>{

	HttpServletRequest request = ServletActionContext.getRequest();
	private static final long serialVersionUID = 1L;
	@Autowired
	private MajorService majorService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
    private OlogService ologService;
	//Major实例化
	private Major major = new Major();
	private Major updateMajor;
	private String[] batchID; 
	//系别集合
	private List<Code> deptList;
	private Map<String, Object> majorMap;
	//查询集合
	private List<Major> majorList;
	private List<Map<String, Object>> majorMaplist;
	private long id;
	
	//添加
	public String add(){
		System.out.println(updateMajor);
		this.majorService.save(updateMajor);
		return allDept();
	}
	//修改
	public String update(){
		OperationLog operation = new OperationLog("","专业修改","失败"); 
		this.majorService.update(updateMajor);
		operation.setState("成功");
		try {
			ologService.add(request, operation);
		} catch (DataException e) {
			e.printStackTrace();
		}
		
		return paginAll();
	}
	//删除
	public String delete(){
		OperationLog operation = new OperationLog("","专业删除","失败"); 
		this.majorService.delete(major);
		operation.setState("成功");
		try {
			ologService.add(request, operation);
		} catch (DataException e) {
			e.printStackTrace();
		}
		System.out.println(major);
		major=null;
		return paginAll();
	}
	//查询全部
	public String getAll(){
		majorList=majorService.getAllCode();
		return GETALL_MAJOR;
	}

	public String getAllMajor(){
		majorList=majorService.getAllCode();
		Map<String, Object> map=new HashMap<>();
		map.put("majors", majorList);
		JSON_CHAR_DATA=super.gson.toJson(map);
		return JSONOCHAR;
	}
	/**
	 * 根据No查询
	 * @return
	 */
	public String getMajorByNo(){
		//this.majorService.getAllCode();
		majorMap=this.majorService.majorIdbyMap(major.getMajorNo());
		deptList=this.departmentService.getAllDeptNo();
		return GETBYID_MAJOR;
	}
	//带分页的查询方法
	public String select(){
		majorService.paginGet(paginMap,"");
		deptList=this.departmentService.getAllDeptNo();
		return GETALL_MAJOR;
	}
	//多条件带分页查询
	public String pagin() {
		deptList=this.departmentService.getAllDeptNo();
		System.err.println(major.hashCode());
		majorService.paginSearchMajor(paginMap, major);
		return GETALL_MAJOR;
	}
	public String paginAll() {
		deptList=this.departmentService.getAllDeptNo();
		majorService.paginSearchMajor(paginMap, null);
		return GETALL_MAJOR;
	}
	//查看详情操作
	public String detail(){
		majorMap = this.majorService.majorIdbyMap(major.getMajorNo());
		System.err.println(majorMap);
		return DETAIL_MAJOR;
	}
	public long getRoleByID(){
		return id;
	}
	//查询全部系别
	public String allDept(){
		deptList=this.departmentService.getAllDeptNo();
		return INSERT_MAJOR;
	} 
	
	public String batch() {
		System.err.println(majorService.batchDelete(batchID));
		majorService.batchDelete(batchID);
		return pagin();
	}
	public String getMajorBydeptNo(){
		majorMaplist=majorService.getMajorBydeptNo(major.getDeptNo());
		System.err.println(majorMaplist);
		return "qt";
	}
	public String IsMajorbyNo(){
		System.out.println("action==============="+major);
		 boolean hasMajor = majorService.IsMajorbyNo(major.getMajorNo());
		 if (hasMajor==true) {
			 JSON_CHAR_DATA = 0+"";		
		}else{
		     JSON_CHAR_DATA = 1+"";
		 }
		 return JSONOCHAR;
	}

	@Override
	public Major getModel() {
		return major;
	}
	public Major getUpdateMajor() {
		return updateMajor;
	}
	public void setUpdateMajor(Major updateMajor) {
		this.updateMajor = updateMajor;
	}
	public String[] getBatchID() {
		return batchID;
	}
	public void setBatchID(String[] batchID) {
		this.batchID = batchID;
	}
	public List<Code> getDeptList() {
		return deptList;
	}
	public void setDeptList(List<Code> deptList) {
		this.deptList = deptList;
	}
	public Map<String, Object> getMajorMap() {
		return majorMap;
	}
	public void setMajorMap(Map<String, Object> majorMap) {
		this.majorMap = majorMap;
	}
	public List<Major> getMajorList() {
		return majorList;
	}
	public void setMajorList(List<Major> majorList) {
		this.majorList = majorList;
	}
	public List<Map<String, Object>> getMajorMaplist() {
		return majorMaplist;
	}
	public void setMajorMaplist(List<Map<String, Object>> majorMaplist) {
		this.majorMaplist = majorMaplist;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
