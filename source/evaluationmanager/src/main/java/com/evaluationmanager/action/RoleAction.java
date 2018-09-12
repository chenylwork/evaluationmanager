package com.evaluationmanager.action;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.evaluationmanager.entiy.Code;
import com.evaluationmanager.entiy.OperationLog;
import com.evaluationmanager.entiy.Role;
import com.evaluationmanager.exception.DataException;
import com.evaluationmanager.service.OlogService;
import com.evaluationmanager.service.RoleService;
import com.evaluationmanager.support.Action;

/**
 * 
 * @Author 邢燕蕊
 * @Datetime 2018年7月27日-下午4:31:22
 * @Description 描述信息：
 *
 */
@Controller("roleAction")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class RoleAction extends Action<Role>{
	
	private static final long serialVersionUID = 423709953794339294L;
	HttpServletRequest request = ServletActionContext.getRequest();
	@Autowired
	private RoleService roleService;
	@Autowired
    private OlogService ologService;
	
	private Role role=new Role();

	private List<Role> roleList;
	private List<Code> typeList;//geng
	private List<Code> codeRoleList;
	private Map<String, Object> roleMap;

	@Override
	public Role getModel() {
		return role;
	}
	
	/**
	 * 添加角色页面下拉框遍历
	 * @return
	 */
	public String selectType() {
		typeList=this.roleService.getRoleType();
		return SELECT_ROLE;
	}
	/**
	 * 添加角色
	 * @return
	 */
	public String add(){
		this.roleService.add(role);
		return getRole();
	}
	/**
	 * 修改角色
	 * @return
	 */
	public String update(){
		OperationLog operation = new OperationLog("","修改角色","失败");
		this.roleService.update(role);
		operation.setState("成功");
		try {
			ologService.add(request, operation);
		} catch (DataException e) {
			e.printStackTrace();
		}
		return getRole();
	}
	/**
	 * 删除角色
	 * @return
	 */
	public String delete(){
		OperationLog operation = new OperationLog("","删除角色","失败");
		this.roleService.delete(role);
		try {
			operation.setState("成功");
			ologService.add(request, operation);
		} catch (DataException e) {
			e.printStackTrace();
		}
		return getRole();
	}
    /**
     * 查看全部角色8(邢)
     * @return
     */
	public String getRole(){
		roleList=roleService.getAllRole();
		return GETALL_ROLE;
	}
    /**
     * 查看全部角色3(耿)
     * @return
     */
	public String getAllLogin(){
		JSON_CHAR_DATA=gson.toJson(roleService.getRoleType());
		return JSONOCHAR;
	}
	/**
	 * 查看全部角色信息role表
	 * @return
	 */
	public String getAllRole(){
		JSON_CHAR_DATA=super.gson.toJson(roleService.getAllRole());
		return JSONOCHAR;
	}
	/**
	 * 根据No查角色
	 * @return
	 */
	public String roleByNo() {
		roleMap=this.roleService.getRoleByNo(role.getNo());
		return BYNO_ROLE;
	}
	
	
	//get、set方法
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	public List<Code> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<Code> typeList) {
		this.typeList = typeList;
	}

	public Map<String, Object> getRoleMap() {
		return roleMap;
	}
	public void setRoleMap(Map<String, Object> roleMap) {
		this.roleMap = roleMap;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Code> getCodeRoleList() {
		return codeRoleList;
	}

	public void setCodeRoleList(List<Code> codeRoleList) {
		this.codeRoleList = codeRoleList;
	}
	

}
