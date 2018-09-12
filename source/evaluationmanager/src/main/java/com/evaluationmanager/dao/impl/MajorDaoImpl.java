package com.evaluationmanager.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.stereotype.Repository;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.MajorDao;
import com.evaluationmanager.entiy.Major;
import com.evaluationmanager.support.AbstractDataDao;
/**
 * 
 * 
 * @Author 任少华
 * @Datetime 2018年7月30日-上午10:20:06
 * @Description 描述信息：
 *
 */
@Repository("MajorDao")
public class MajorDaoImpl extends AbstractDataDao<Major> implements MajorDao {

	
	private String moditions;
	private String[] params;
	public int batchDelete(List<String[]> params) {
		String sql = "delete from major where id = ?";
		try {
			return batchModification(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public List<Map<String, Object>> paginSearchMajor(Pagin<Map<String, Object>> pagin, Major major) {
		initConditios(major);
		return super.paginGetMapDatas(pagin, moditions, params);
		//return super.paginGetMapDatas(pagin, moditions, paramsList.toArray(new String[]{}));
			
	}
	@Override
	public long size(Major major) {
		initConditios(major);
		return super.size(moditions, params);
		
	}
	
	private void initConditios(Major major) {
		moditions = "1=1 ";
		List<String> paramsList = new ArrayList<>();
		if(major !=null && major.getName() != null 
				&& !"".equals(major.getName())) {
			moditions += " and this.name like ? ";
			paramsList.add("%"+major.getName()+"%");
		}
		if(major !=null && major.getDeptNo() !=null && !"".equals(major.getDeptNo())){
			
			moditions += " and this.deptNo = ? ";
			paramsList.add(major.getDeptNo());
		}
		System.err.println(major);
		params = paramsList.toArray(new String[]{});
	}
	
	
	@Override
	public Major IsMajorbyNo(String majorNo) {
		return template.execute(new HibernateCallback<Major>() {

			@Override
			public Major doInHibernate(Session session) throws HibernateException {
				Major major=null;
				String hql="from Major where majorNo=?";
				@SuppressWarnings("unchecked")
				Query<Major> query=session.createQuery(hql);
				query.setParameter(0, majorNo);
				List<Major> list=query.list();
				if (list.size()>0) {
					major=list.get(0);
				}
				return major;
			}
		});
		
	}
	
}
