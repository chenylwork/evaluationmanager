package com.evaluationmanager.service;

import java.util.List;
import java.util.Map;

import com.evaluationmanager.entiy.Code;
import com.evaluationmanager.entiy.Role;

/**
 * 
 * @Author 邢燕蕊
 * @Datetime 2018年7月27日-下午4:22:07
 * @Description 描述信息：
 *
 */ 
public interface RoleService {
	/**
	 * 添加角色
	 * @param code
	 * @return
	 */
	public boolean add(Role role);
	/**
	 * 修改角色
	 * @param code
	 * @return
	 */
	public boolean update(Role role);
	/**
	 * 删除角色
	 * @param code
	 * @return
	 */
	public boolean delete(Role role);
	/**
	 * 获取全部角色类型信息
	 * @Author 耿佳康
	 * @DateTime 2018年8月19日-下午11:46:47
	 *
	 * @return List<Code>
	 */
	public List<Role> getAllRole();
	/**
	 * 在code表中获取用户类型
	 * @return
	 */
	public List<Code> getAllCoderole();
	/**
	 * 查询全部角色信息，包括管理员、教师、学生
	 * @Author 邢燕蕊
	 * @DateTime 2018年8月19日-下午11:47:12
	 * @return List<Role>
	 */
	public List<Code> getRoleType();
	/**
	 * 根据角色编号查询角色信息
	 * @param codeNo
	 * @return
	 */
	public Map<String, Object> getRoleByNo(String roleNo);
	/**
	 * 查个数
	 * @param codeNo
	 * @return
	 */

}
