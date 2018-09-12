package com.evaluationmanager.service;

import java.util.List;
import java.util.Map;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.Code;

/**
 * 
 * @Author 张鼎瑜
 * @Datetime 2018年7月27日-下午2:32:08
 * @Description 描述信息:院系管理业务操作接口
 *
 */

public interface DepartmentService {
	//添加院系
	public boolean save(Code c);
	
	//修改院系
	public boolean update(Code c);
	
	//删除院系
	public boolean delete(Code c);
	
	//查询全部的院系
	public List<Code> getAllDeptNo();
	
	//根据院系id查询信息
	public Code getDeptById(long id);
	
	//分页查询
	//public List<Code> paginSearch(Pagin<Code> pagin,Code dept);
	//根据codeNo查询系别信息

	public Map<String, Object> getDeptByNo(String codeNo);
	//批量删除
	public int batchDelete(String[] params);
	/**
	 * 查询全部、多条件查询
	 * @param pagin
	 * @param student
	 * @param user
	 * @return
	 */
	public List<Code> paginSearchCode(Pagin<Code> pagin,Code code);
	
	
}
