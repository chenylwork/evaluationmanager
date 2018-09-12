package com.evaluationmanager.service;

import java.util.List;
import java.util.Map;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.User;

/**
 * 
 * @author 耿佳康
 * @date 2018年7月27日-下午5:03:07
 * @description 用户信息业务操作借口
 */
public interface UserService {
	/**
	 * 添加单个用户信息
	 * @param 参数：user
	 * @return 返回值 user
	 */
	public User add(User user);
	/**
	 * 修改单个用户
	 * @param 参数：user
	 * @return 返回值 user
	 */
	public User update(User user);
	/**
	 * 删除单个用户
	 * @param 参数：user
	 * @return 返回值 user
	 */
	public User delete(User user);
	/**
	 * 查询全部用户
	 * @return list
	 */
	public List<Map<String, Object>> userList();
	/**
	    * 多条件分页查询user的数据信息
	    * @param pagin 分页对象
	    * @param conditions 查询条件
	    * @param params 为查询条件赋值的参数
	    * @return 查询到的pagin对象对应的，一页数据
	    */
	public List<Map<String, Object>> paginGet(Pagin<Map<String,Object>> pagin,String hql,String... params);
	/**
	 * 多条件查询
	 * @param pagin
	 * @param user
	 * @return
	 */
	public List<Map<String, Object>> paginSearch(Pagin<Map<String,Object>> pagin,User user);
	/**
	 * 根据ID查询用户
	 * @param id
	 * @return user
	 */
	public User getUserById(long id);
	
	public Map<String, Object> getMapById(long id);
	/**
	 * 根据用户类型查询用户
	 * @param role
	 * @return user
	 */
	public List<Map<String, Object>> getUserByRole(String role);
	/**
	 * 根据用户账号查询用户
	 * @param account 用户账号
	 * @return
	 */
	public List<Map<String, Object>> getUserByAccount(String account);
    /**
     * 用户登录验证
     * @param account
     * @param password
     * @param role
     * @return
     */
	public User loginUser(String account, String password, String role);
	/**
	 * 个人修改密码
	 * @param account
	 * @param password
	 * @param oldpwd
	 * @param newpwd
	 * @return
	 */
	public int updatePwd(String account,String password,String oldpwd,String newpwd);
	/**
	 * 重置密码
	 */
	public int resetPwd(String account);
	/**
	 * 用户批量删除根据account
	 * @param params
	 * @return
	 */
	public int BatchDelete(String[] params);
	/**
	 * 数据统计
	 * @return
	 */
	public Map<String, Object> translate();
}
