package com.evaluationmanager.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.DepartmentDao;
import com.evaluationmanager.entiy.Code;
import com.evaluationmanager.support.AbstractDataDao;

/**
 * 
 * @Author 张鼎瑜
 * @Datetime 2018年7月27日-下午2:21:33
 * @Description 描述信息：院系操作实现类
 *
 */

@Repository("departmentDao")
public class DepartmentDaoImpl extends AbstractDataDao<Code> implements DepartmentDao{
	public int batchDelete(List<String[]> params) {
		String sql = "delete from Code where id = ?";
		try {
			return batchModification(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	/*@Override
	public List<Code> paginSearchDept(Pagin<Code> pagin, Code dept) {
		if(dept !=null && dept.getName() != null 
				&& !"".equals(dept.getName())) {
			return super.paginSearchData(pagin, "typeNo = 1 and name like ?", "%"+dept.getName()+"%");
		}else{
			return super.paginSearchData(pagin, "typeNo = 1");
		}
	}

	@Override
	public long size(Code dept) {
		if(dept !=null && dept.getName() != null 
				&& !"".equals(dept.getName())) {
			return super.size("typeNo = 1 and name = ?", "%"+dept.getName()+"%");
		}else{
			return super.size("typeNo = 1");
		}
	}*/
	/**
	 * 查询全部、多条件查询
	 */
	@Override
	public List<Code> paginSearchCode(Pagin<Code> pagin, Code code) {
		String sql = "typeNo = 1";
		List<String> paramsList = new ArrayList<>();
		
		if(code !=null && code.getName() != null && code.getName() != "" && !"".equals(code.getName())) {
			sql += " and name like ?";
			paramsList.add("%"+code.getName()+"%");
		}
		String[] array = paramsList.toArray(new String[]{});
		pagin.setCount(super.size(sql, array));
		return super.paginSearchData(pagin, sql, array);
	}
	
	
}
