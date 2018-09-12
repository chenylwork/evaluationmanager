package com.evaluationmanager.service.impl;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.evaluationmanager.dao.CodeDao;
import com.evaluationmanager.dao.RoleDao;
import com.evaluationmanager.entiy.Code;
import com.evaluationmanager.entiy.Role;
import com.evaluationmanager.service.RoleService;
import com.evaluationmanager.support.AbstractService;

/**
 * 
 * @Author 邢燕蕊
 * @Datetime 2018年7月27日-下午4:25:35
 * @Description 描述信息：
 *
 */
@org.springframework.stereotype.Service("roleService")
public class RoleServiceImpl extends AbstractService<Role> implements RoleService  {

	@Autowired
	private RoleDao roleDao;
	
	@Autowired
	private CodeDao codeDao;
	
	/**
	 * 添加角色
	 */
	@Override
	@Transactional
	public boolean add(Role role) {
		return roleDao.add(role);
	}
    
	/**
	 * 修改角色
	 */
	@Override
	@Transactional
	public boolean update(Role role) {
		return roleDao.update(role);
	}
    
	/**
	 * 删除角色
	 */
	@Override
	@Transactional
	public boolean delete(Role role) {
		return roleDao.delete(role);
	}
    
	/**
	 * 查看全部角色3(耿)
	 */
	@Override
	@Transactional
	public List<Role> getAllRole() {
		return roleDao.getDatas("");
	}
	@Override
	public List<Code> getAllCoderole() {
		System.out.println(codeDao.getDatas("typeNo=?","3").size());
		return codeDao.getDatas("typeNo=?","3");
	}
	
	/**
	 * 查看全部角色8(邢)
	 */
	@Override
	public List<Code> getRoleType() {
		return codeDao.getRole();
	}

    /**
     * 根据No查角色
     */
	@Override
	@Transactional
	public Map<String, Object> getRoleByNo(String codeNo) {
		return roleDao.getMapDataByNo(codeNo);
	}

	

}
