package com.evaluationmanager.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.UserDao;
import com.evaluationmanager.entiy.User;
import com.evaluationmanager.service.UserService;
import com.evaluationmanager.support.AbstractService;
import com.evaluationmanager.unit.Md5Unit;
/**
 * 
 * @author 耿佳康
 * @date 2018年7月30日-下午1:52:48
 * @description 用户信息业务操作实现
 */
@org.springframework.stereotype.Service("userService")
public class UserServiceImpl extends AbstractService<User> implements UserService {
   private UserDao userDao;
   @Autowired
   public void setUserDao(UserDao userDao) {
	   super.setDataDao(this.userDao = userDao);
   }

	@Override
	@Transactional
	public User add(User user) {
		String password=Md5Unit.encodeByMD5(user.getPassword());
		user.setPassword(password);
		super.changeData(user, SAVE);
		return user;
	}

	@Override
	@Transactional
	public User update(User user) {
		String password=Md5Unit.encodeByMD5(user.getPassword());
		user.setPassword(password);
		super.changeData(user,UPDATE);
		return user;
	}

	@Override
	@Transactional
	public User delete(User user) {
	    super.changeData(user, DELETE);
		return user;
	}
	@Override
	@Transactional(readOnly=true)
	public List<Map<String, Object>> userList() {
	    List<Map<String, Object>> userMapList = userDao.getMapDatas("");
		return userMapList;
	}
	@Override
	@Transactional(readOnly=true)
	public User getUserById(long id) {
		User userByID = userDao.getDataByID(id);
		return userByID;
	}
	@Override
	@Transactional(readOnly=true)
	public List<Map<String, Object>> getUserByRole(String role) {
		String hql="role=?";
		List<Map<String, Object>> userMapbyRole = userDao.getMapDatas(hql,role);
		return userMapbyRole;
	}

	@Override
	@Transactional(readOnly=true)
	public User loginUser(String account, String password, String role) {
		//用户登录时进行md5验证
		password=Md5Unit.encodeByMD5(password);
		return userDao.loginUser(account, password, role);
	}

	@Override
	@Transactional
	public int updatePwd(String account, String password, String oldpwd, String newpwd) {		 
		password=Md5Unit.encodeByMD5(password);
		oldpwd=Md5Unit.encodeByMD5(oldpwd);
		newpwd=Md5Unit.encodeByMD5(newpwd);
		return userDao.updatePwd(account, password, oldpwd, newpwd);
	}

	@Override
	@Transactional
	public int resetPwd(String account) {
		return userDao.resetPwd(account);
	}

	@Override
	@Transactional
	public List<Map<String, Object>> paginGet(Pagin<Map<String, Object>> pagin, String conditions, String... params) {
		//获取个数
		pagin.setCount(userDao.size(conditions, params));
		List<Map<String, Object>> paginGetMapDatas = userDao.paginGetMapDatas(pagin, conditions, params);
		//返回查询结果
		return paginGetMapDatas;
	}

	@Override
	@Transactional
	public Map<String, Object> getMapById(long id) {
		
		return userDao.getMapDataById(id);
	}

	@Override
	@Transactional
	public List<Map<String, Object>> getUserByAccount(String account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public int BatchDelete(String[] params) {
		List<String[]> paramList = new ArrayList<>();
		for(String string : params) {
			System.out.println(string);
			paramList.add(new String[]{string});
		}
		return userDao.BatchDelete(paramList);
	}

	@Override
	public List<Map<String, Object>> paginSearch(Pagin<Map<String, Object>> pagin, User user) {
		//获取个数
		pagin.setCount(userDao.size(user));
		List<Map<String, Object>> paginGetMapDatas = userDao.paginSearchUser(pagin, user);
		//返回查询结果
		return paginGetMapDatas;
	}

	@Override
	public Map<String, Object> translate() {
		return userDao.translate();
	}

}
