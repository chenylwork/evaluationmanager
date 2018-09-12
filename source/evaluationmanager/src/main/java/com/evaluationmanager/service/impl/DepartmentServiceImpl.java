package com.evaluationmanager.service.impl;


import com.evaluationmanager.entiy.Code;
import com.evaluationmanager.exception.DataException;
import com.evaluationmanager.service.DepartmentService;
import com.evaluationmanager.support.AbstractService;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.DepartmentDao;

/**
 * 
 * @Author 张鼎瑜
 * @Datetime 2018年7月27日-下午2:39:07
 * @Description 描述信息：院系管理操作业务实现类
 *
 */

@org.springframework.stereotype.Service("departmentService")
public class DepartmentServiceImpl extends AbstractService<Code> implements DepartmentService {
	
	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private Gson gson;
	
	
	
	//添加院系信息
	@Override
	@Transactional
	public boolean save(Code c) {
		// TODO Auto-generated method stub
		return this.departmentDao.add(c);
	}
	
	//修改院系信息
	@Override
	@Transactional
	public boolean update(Code c) {
		// TODO Auto-generated method stub
		return this.departmentDao.update(c);
	}
	
	//删除院系信息
	@Override
	@Transactional
	public boolean delete(Code c) {
		// TODO Auto-generated method stub
		return this.departmentDao.delete(c);
	}

	//typeNo=1为院系编号，根据查询所有院系
	@Override
	@Transactional
	public List<Code> getAllDeptNo() {	
		return this.departmentDao.getDatas("typeNo = ?" , "1");
	}
	
	/*//分页查询
	@Override
	public List<Code> paginSearch(Pagin<Code> pagin,Code dept) {	
		dept.setTypeNo("1");
		pagin.setCount(departmentDao.size(dept));
		return this.departmentDao.paginSearchDept(pagin, dept);
      
	}*/

	
	@Override
	@Transactional
	public Code getDeptById(long id) {
		// TODO Auto-generated method stub
		return this.departmentDao.getDataByID(id);
	}
	
	
	//查询院系详情
	//查询院系详情
	@Override
	public Map<String, Object> getDeptByNo(String codeNo) {
		// TODO Auto-generated method stub
		//return this.departmentDao.getMapDataByNo(codeNo);
		Map<String, Object> deptbyNo = null;
		try {
			deptbyNo = this.departmentDao.getMapDataByNo(codeNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deptbyNo;
	}
	//批量删除
	@Override
	public int batchDelete(String[] params) {
		List<String[]> paramList = new ArrayList<>();
		for(String string : params) {
			System.out.println(string);
			paramList.add(new String[]{string});
		}
		return departmentDao.batchDelete(paramList);
	}
	
	
	/**
	 * 查询全部、多条件查询
	 */
	@Override
	@Transactional
	public List<Code> paginSearchCode(Pagin<Code> pagin, Code code) {
		return this.departmentDao.paginSearchCode(pagin, code);
	}
	
}
