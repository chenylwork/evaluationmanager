package com.evaluationmanager.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.JSONCleaner;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.evaluationmanager.entiy.PowerInfo;
import com.evaluationmanager.entiy.PowerRole;
import com.evaluationmanager.entiy.PowerType;
import com.evaluationmanager.entiy.PowerUser;
import com.evaluationmanager.entiy.Role;
import com.evaluationmanager.entiy.User;
import com.evaluationmanager.exception.DataException;
import com.evaluationmanager.service.PowerService;
import com.evaluationmanager.service.RoleService;
import com.evaluationmanager.service.UserService;
import com.evaluationmanager.support.Action;

@Controller("powerAction")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PowerAction extends Action<PowerInfo> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HttpServletRequest request = ServletActionContext.getRequest();
	
	@Autowired
	private PowerService powerService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private UserService userService;
	
	/**
	 * 角色集合
	 */
	private List<Role> roleList;
	/**
	 * 权限集合
	 */
	private List<PowerInfo> powerList;
	/**
	 * 角色权限信息
	 */
	private PowerRole powerRole;
	
	private PowerInfo powerInfo = new PowerInfo();
	private PowerUser powerUser;
	
	//实体对象
	private User user;
	private Role role;
	

	
	
	/**
	 * 角色map对象
	 */
	private Map<String,Object> roleMap;
	/**
	 * 用户map对象
	 */
	private Map<String,Object> userMap;
	
	private List<Map<String,Object>> powerListMap;
	private List<PowerType> typeList;
	private Map<String,Object> typelist;
	private List<Map<String, Object>> powerMapList;
	private List<Map<String, Object>> userMapList;
	
	
	private String powerInfoNo;
	
	
	@Override
	public PowerInfo getModel() {
		return powerInfo;
	}
	
	/**
	 * 获取全部角色权限
	 * @return
	 */
	public String getAllRole(){
		roleList = roleService.getAllRole();
		return GETALLROLE;
	}
	
	/**
	 * 添加获取全部角色和权限信息
	 * @return
	 */
	public String AllRoleAndInfo(){
		roleList = roleService.getAllRole();
		powerList = powerService.getAllPower();
		return ALLROLEANDINFO;
	}
	
	/**
	 * 遍历所有的权限信息以及角色名字
	 * @Author 韩笑
	 * @DateTime 2018年8月20日-上午12:43:05
	 *
	 * @return
	 */
	public String getRoleName(){
		roleList = roleService.getAllRole();
		powerList = powerService.getAllPower();
		roleMap = this.roleService.getRoleByNo(powerRole.getRole());
		powerRole = powerService.getPowerRole(powerRole);
		return GETALLINFO;
	}
	
	/**
	 * 遍历所有的权限信息以及用户名字
	 * @Author 韩笑
	 * @DateTime 2018年8月20日-上午12:44:38
	 *
	 * @return
	 */
	public String getUserName(){
		powerList = powerService.getAllPower();
		userMap = this.userService.getMapById(user.getId());
		powerListMap = this.powerService.getInfoByUser(user.getAccount());
		powerRole = powerService.getPowerRole(powerRole);
		return GETALLINFO;
	}
	
	/**
	 * 分页获取用户信息
	 * @Author 韩笑
	 * @DateTime 2018年8月20日-上午12:46:57
	 *
	 * @return
	 */
	public String getAllUser(){
		userMapList = this.userService.paginGet(paginMap,"");
		return GETALLUSER;
	}
	/**
	 * 保存角色权限
	 * @Author 韩笑
	 * @DateTime 2018年8月20日-上午12:47:47
	 * @return
	 */
	public String savePowerRole(){
		System.err.println(powerRole);
		if(powerService.savePowerRole(powerRole)) {
			powerRole = powerService.getPowerRole(powerRole);
			JSON_CHAR_DATA = powerRole.getId()+"";
		} else {
			JSON_CHAR_DATA = "0";
		}
		System.out.println(powerRole);
		return JSONOCHAR;
	}
	/**
	 * 添加用户权限
	 * @Author 韩笑
	 * @DateTime 2018年8月20日-上午12:48:49
	 * @return
	 */
	public String addPu(){
		this.powerService.savePowerUser(powerUser);
		return ADDUSER;
	}
	/**
	 * 根据user获取权限信息
	 * @return
	 * @throws JSONException 
	 */
	public String getInfoByUser(){
		user=(User)request.getSession().getAttribute("LOGINED_USER");
		powerListMap = this.powerService.getInfoByUser(user.getAccount());
		Map<String, Object> map=new HashMap<>();
		map.put("powerInfo", powerListMap);
		JSON_CHAR_DATA=super.gson.toJson(map);
		return JSONOCHAR;
	}
	public String allPower() {
		JSON_CHAR_DATA = gson.toJson(powerService.getAllPower());
		return JSONOCHAR;
	}
	public String allPowerType() {
		JSON_CHAR_DATA = gson.toJson(powerService.getAllPowerType());
		return JSONOCHAR;
	}
	/**
     * 清除角色权限
     * @Author 邢燕蕊
     */
	public String remove() {
		this.powerService.remove(powerRole);
		return getAllRole();
	}
	/**
	 * 获取用户的权限集合
	 * @Author 陈彦磊
	 * @DateTime 2018年8月26日-下午8:11:50
	 *
	 * @return
	 * @throws DataException
	 */
	public String power() throws DataException {
		JSON_CHAR_DATA = powerService.getPowerByUser(data);
		return JSONOCHAR;
	}
	
	/*get 和 set 方法*/
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	public Map<String, Object> getRoleMap() {
		return roleMap;
	}

	public void setRoleMap(Map<String, Object> roleMap) {
		this.roleMap = roleMap;
	}

	public Map<String, Object> getUserMap() {
		return userMap;
	}

	public void setUserMap(Map<String, Object> userMap) {
		this.userMap = userMap;
	}

	public List<PowerInfo> getPowerList() {
		return powerList;
	}

	public void setPowerList(List<PowerInfo> powerList) {
		this.powerList = powerList;
	}

	public List<PowerType> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<PowerType> typeList) {
		this.typeList = typeList;
	}

	public List<Map<String, Object>> getPowerMapList() {
		return powerMapList;
	}

	public void setPowerMapList(List<Map<String, Object>> powerMapList) {
		this.powerMapList = powerMapList;
	}

	public List<Map<String, Object>> getUserMapList() {
		return userMapList;
	}

	public void setUserMapList(List<Map<String, Object>> userMapList) {
		this.userMapList = userMapList;
	}

	public List<Map<String, Object>> getPowerListMap() {
		return powerListMap;
	}

	public void setPowerListMap(List<Map<String, Object>> powerListMap) {
		this.powerListMap = powerListMap;
	}

	public Map<String, Object> getTypelist() {
		return typelist;
	}

	public void setTypelist(Map<String, Object> typelist) {
		this.typelist = typelist;
	}

	public PowerRole getPowerRole() {
		return powerRole;
	}

	public void setPowerRole(PowerRole powerRole) {
		this.powerRole = powerRole;
	}

	public PowerUser getPowerUser() {
		return powerUser;
	}

	public void setPowerUser(PowerUser powerUser) {
		this.powerUser = powerUser;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public PowerInfo getPowerInfo() {
		return powerInfo;
	}

	public void setPowerInfo(PowerInfo powerInfo) {
		this.powerInfo = powerInfo;
	}

	public String getPowerInfoNo() {
		return powerInfoNo;
	}

	public void setPowerInfoNo(String powerInfoNo) {
		this.powerInfoNo = powerInfoNo;
	}

	
}
