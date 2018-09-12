package com.evaluationmanager.action;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.evaluationmanager.entiy.Code;
import com.evaluationmanager.entiy.User;
import com.evaluationmanager.service.CodeService;
import com.evaluationmanager.service.LogService;
import com.evaluationmanager.service.UserService;
import com.evaluationmanager.support.Action;
/**
 * 
 * @author 耿佳康
 * @date 2018年7月31日-下午3:54:21
 * @description 用户信息操作action类
 */
@Controller("userAction")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UserAction extends Action<User>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	HttpServletRequest request = ServletActionContext.getRequest();
     @Autowired
     private UserService userService;
     @Autowired
     private LogService logService;
     @Autowired
     private CodeService  codeService;
     
     private User user;
     //private String account;
     //private String password;
     private String oldpwd;
     private String newpwd;
     //private String role;
     private Map<String, Object> usermap;
     private Map<String, Object> countMap;
     
     //提示消息
   	 private String message;

     

     private List<Map<String, Object>> userMapList;

	@Override
	public User getModel() {
		if (user==null) {
			user= new User();
		}
		return user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getOldpwd() {
		return oldpwd;
	}

	public void setOldpwd(String oldpwd) {
		this.oldpwd = oldpwd;
	}

	public String getNewpwd() {
		return newpwd;
	}

	public void setNewpwd(String newpwd) {
		this.newpwd = newpwd;
	}
    
	public List<Map<String, Object>> getUserMapList() {
		return userMapList;
	}

	public void setUserMapList(List<Map<String, Object>> userMapList) {
		this.userMapList = userMapList;
	}
	

	public Map<String, Object> getUsermap() {
		return usermap;
	}

	public void setUsermap(Map<String, Object> usermap) {
		this.usermap = usermap;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getCountMap() {
		return countMap;
	}

	public void setCountMap(Map<String, Object> countMap) {
		this.countMap = countMap;
	}

	/**
	 * 登录验证
	 * @return
	 */
	public String login(){
		System.out.println("用户信息："+user.getAccount()+"***"+user.getPassword()+"***"+user.getRole());
		String selectRole=user.getRole();
		user=userService.loginUser(user.getAccount(),user.getPassword(), user.getRole());
		if (user!=null) {
			String Role=user.getRole().substring(0,2);
			 //判断登录选择的角色类型和用户角色类型是否一致
			if (selectRole.substring(selectRole.length()-2).equals(Role)) {
					//在会话中存放已登录用户信息
					request.getSession().setAttribute("LOGINED_USER",user);
					logService.add(user, request);
					String mas=null;
					//
					System.out.println("用户类型："+user.getRole());
					
					if (Role.equals("00")) {
						mas="loginadmin";
					}else if (Role.equals("01")||Role.equals("02")) {
						mas="login";
					}else{
						mas="login";
					}
			   return mas;
			}else{
				user=null;
				message="输入错误请确认后登录。。";
			   return "error";
			}
		}else{
			 message="输入错误请确认后登录。。";
			 return "error";
		}

	}
	/**
	 * 注销用户
	 * @return
	 */
	public String dologout(){
		request.getSession().invalidate();
		return "logout";
	}
	
	/**
	 * 修改用户
	 * @return
	 */
	public String updateUser(){
		System.out.println("参数1："+user);
		User updateUser = userService.update(user);
		if (updateUser!=null) {
			return "updateUser";
		}else{
		    return "error";
		}
	}
	/**
	 * 修改密码
	 * @return
	 */
	public String updatePwd(){
		int count=userService.updatePwd(user.getAccount(),user.getPassword(), oldpwd, newpwd);
		if (count>0) {			
			return "updatepwd";
		} else {
            return "error"; 
		}
	}
	/**
	 * 重置密码
	 * @return
	 */
	public String resetPwd(){
		int count=userService.resetPwd(user.getAccount());
		if (count>0) {
			return "resetpwd";
		}else{
			return "error";
		}
	}
	/**
	 * 分页查询用户
	 * @return
	 */
   public String search(){
	   System.out.println(paginMap);
	   System.out.println("*****************************"+user);
	   userMapList= userService.paginSearch(paginMap, user);
	   Map<String, Object> map=new HashMap<>();
	   map.put("users", userMapList);
	   map.put("pagin",paginMap);
	   JSON_CHAR_DATA=super.gson.toJson(map);
	   return JSONOCHAR;
   }
   /**
    * 根据ID查询用户
    * @return
    */
   public String getuserById(){
	   System.out.println(user.getId());
	   Map<String, Object> mapById = userService.getMapById(user.getId());
	   Map<String, Object> map=new HashMap<>();
	   map.put("user", mapById);
	   JSON_CHAR_DATA=super.gson.toJson(map);
	   return JSONOCHAR;
   }
   /**
    * 查询性别信息
    * @return
    */
   public String getUserSex(){
	   List<Code> sex = codeService.getSex();
	   Map<String, Object> map=new HashMap<>();
	   map.put("sex", sex);
	   JSON_CHAR_DATA=super.gson.toJson(map);
	   return JSONOCHAR;
   }
   public String translate(){
	   countMap=userService.translate();
	   System.out.println(countMap.size());
	   Map<String, Object> map=new HashMap<>();
	   map.put("count", countMap);
	   JSON_CHAR_DATA=super.gson.toJson(map);
	   return JSONOCHAR;
   }
}
