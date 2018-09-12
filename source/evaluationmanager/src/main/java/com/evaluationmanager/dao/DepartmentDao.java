package com.evaluationmanager.dao;

import java.util.List;
import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.Code;
import com.evaluationmanager.support.DataDao;

/**
 * 
 * @Author 张鼎瑜
 * @Datetime 2018年7月27日-下午2:13:44
 * @Description 描述信息 ： 院系管理接口
 *
 */

public interface DepartmentDao extends DataDao<Code> {
	//批量删除、
	public int batchDelete(List<String[]> params);
	
	//public List<Code> paginSearchDept(Pagin<Code> pagin,Code dept);
	//public long size(Code dept);
	public List<Code> paginSearchCode(Pagin<Code> pagin, Code code);
}
