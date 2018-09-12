package com.evaluationmanager.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.evaluationmanager.entiy.Code;
import com.evaluationmanager.entiy.OperationLog;
import com.evaluationmanager.exception.DataException;
import com.evaluationmanager.service.DepartmentService;
import com.evaluationmanager.service.MajorService;
import com.evaluationmanager.service.OlogService;
import com.evaluationmanager.support.Action;

/**
 * 
 * @Author 张鼎瑜
 * @Datetime 2018年7月27日-下午3:22:43
 * @Description 描述信息:院系操作action类
 *
 */
@Controller("deptAction")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DeptAction extends Action<Code> {

	private static final long serialVersionUID = 1L;

	public HttpSession getSession() {
		HttpSession session = getRequest().getSession();
		return session;
	}

	public HttpServletRequest getRequest() {
		HttpServletRequest request = ServletActionContext.getRequest();
		return request;
	}

	HttpServletRequest request = ServletActionContext.getRequest();
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private MajorService majorService;
	@Autowired
	private OlogService ologService;
	private Code code = new Code();
	private Code updateCode;
	private List<Code> deptList;
	private List<Map<String, Object>> majorList;
	private Map<String, Object> deptMap;
	private String[] batchID;
	private long id;

	// 添加院系
	public String saveDept() {
		updateCode.setTypeNo("1");
		this.departmentService.save(updateCode);
		return INSERT_DEPT;
	}

	// 修改院系
	public String updateDept() {
		OperationLog operation = new OperationLog("", "院系修改", "失败");
		updateCode.setTypeNo("1");

		this.departmentService.update(updateCode);
		operation.setState("成功");
		try {
			ologService.add(request, operation);
		} catch (DataException e) {
			e.printStackTrace();
		}
		return pagin();
	}

	// 删除院系
	public String deleteDept() {
		OperationLog operation = new OperationLog("", "删除院系", "失败");
		this.departmentService.delete(code);
		operation.setState("成功");
		try {
			ologService.add(request, operation);
		} catch (DataException e) {
			e.printStackTrace();
		}

		return pagin();
	}

	// 获取全部院系
	public String allDept() {
		deptList = this.departmentService.getAllDeptNo();
		return ALL_DEPT;
	}

	// 查询该系的详情信息
	public String deptByNo() {
		deptMap = this.departmentService.getDeptByNo(code.getCodeNo());
		return BYNO_DEPT;
	}

	// 查询该院系下的所有专业
	public String allMajor() {
		String deptNo = getRequest().getParameter("deptId");
		majorList = this.majorService.getMajorBydeptNo(deptNo);
		return MAJOR_DEPT;
	}

	// 分页查询全部院系
	public String paginAll() {
		departmentService.paginSearchCode(pagin, code);
		return ALL_DEPT;
	}

	public String pagin() {
		departmentService.paginSearchCode(pagin, null);
		return ALL_DEPT;
	}

	// 批量删除
	public String batch() {
		this.departmentService.batchDelete(batchID);
		return pagin();
	}
	/*
	 * @Autowired private DepartmentService departmentService;
	 * 
	 * @Autowired private MajorService majorService; private Code code = new
	 * Code(); private Map<String, Object> deptMap; private List<Code> deptList;
	 * private List<Map<String, Object>> majorList; private String[] batchID;
	 * 
	 * public Map<String, Object> getDeptMap() { return deptMap; } public void
	 * setDeptMap(Map<String, Object> deptMap) { this.deptMap = deptMap; }
	 * //添加院系 public String saveDept() { code.setTypeNo("1");
	 * this.departmentService.save(code); return paginAll(); }
	 * 
	 * //修改院系 public String updateDept() { code.setTypeNo("1");
	 * this.departmentService.update(code); code = null; return paginAll(); }
	 * 
	 * //删除院系 public String deleteDept() { this.departmentService.delete(code);
	 * code = null; return paginAll(); }
	 * 
	 * //获取全部院系 public String allDept() { deptList =
	 * this.departmentService.getAllDeptNo(); return ALL_DEPT; }
	 * 
	 * //查询该院系下的所有专业 public String allMajor() { String deptNo =
	 * getRequest().getParameter("deptId"); majorList =
	 * this.majorService.getMajorBydeptNo(deptNo); return MAJOR_DEPT; }
	 * 
	 * //分页查询全部院系 public String paginAll() { try {
	 * departmentService.paginSearch(pagin, code); System.out.println(pagin); }
	 * catch (Exception e) { e.printStackTrace(); } return ALL_DEPT; } public
	 * String paginAll(){ departmentService.paginSearchCode(pagin, code); return
	 * ALL_DEPT; }
	 * 
	 * //查询该系的详情信息 public String deptByNo() {
	 * deptMap=this.departmentService.getDeptByNo(code.getCodeNo()); return
	 * BYNO_DEPT;
	 * 
	 * }
	 * 
	 * //批量删除 public String batch() {
	 * System.out.println(departmentService.batchDelete(batchID));
	 * this.departmentService.batchDelete(batchID); return paginAll(); }
	 * 
	 * public List<Code> getDeptList() { return deptList; } public void
	 * setDeptList(List<Code> deptList) { this.deptList = deptList; } public
	 * List<Map<String, Object>> getMajorList() { return majorList; } public
	 * void setMajorList(List<Map<String, Object>> majorList) { this.majorList =
	 * majorList; } public String[] getBatchID() { return batchID; } public void
	 * setBatchID(String[] batchID) { this.batchID = batchID; }
	 * 
	 * @Override public Code getModel() { // TODO Auto-generated method stub
	 * return code; }
	 */

	@Override
	public Code getModel() {
		return code;
	}

	public List<Code> getDeptList() {
		return deptList;
	}

	public void setDeptList(List<Code> deptList) {
		this.deptList = deptList;
	}

	public List<Map<String, Object>> getMajorList() {
		return majorList;
	}

	public void setMajorList(List<Map<String, Object>> majorList) {
		this.majorList = majorList;
	}

	public Map<String, Object> getDeptMap() {
		return deptMap;
	}

	public void setDeptMap(Map<String, Object> deptMap) {
		this.deptMap = deptMap;
	}

	public String[] getBatchID() {
		return batchID;
	}

	public void setBatchID(String[] batchID) {
		this.batchID = batchID;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Code getUpdateCode() {
		return updateCode;
	}

	public void setUpdateCode(Code updateCode) {
		this.updateCode = updateCode;
	}
	
}
