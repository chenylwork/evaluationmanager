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
import com.evaluationmanager.dao.ClassDao;
import com.evaluationmanager.entiy.Class;
import com.evaluationmanager.entiy.Student;
import com.evaluationmanager.support.AbstractDataDao;
/**
 * 
 * @author 耿佳康
 * @date 2018年7月27日-下午1:53:40
 * @description 班级信息操作实现
 */
@Repository("classDao")
public class ClassDaoImpl extends AbstractDataDao<Class> implements ClassDao{

	@Override
	public Class renameClassbyNo(String classNo) {
		return template.execute(new HibernateCallback<Class>() {

			
			@Override
			public Class doInHibernate(Session session) throws HibernateException {
				Class classes=null;
				String hql="from Class where classNo=?";
				//session.createNativeQuery(queryString);
				@SuppressWarnings("unchecked")
				Query<Class> query=session.createQuery(hql);
				query.setParameter(0, classNo);
				List<Class> list=query.list();
				if (list.size()>0) {
					classes=list.get(0);
				}
				return classes;
			}
		});
		
	}

	@Override
	public List<Map<String, Object>> paginSearchClass(Pagin<Map<String, Object>> pagin, Class classes) {
		 String moditions = "1=1 ";
			List<String> paramsList = new ArrayList<>();
			if(classes !=null && classes.getName() != null && !"".equals(classes.getName())) {
				moditions += " and this.name like ? ";
				paramsList.add("%"+classes.getName()+"%");
			}
			if(classes !=null && classes.getMajor() !=null && !"".equals(classes.getMajor())){
				
				moditions += " and this.major = ? ";
				paramsList.add(classes.getMajor());
			}
		return super.paginGetMapDatas(pagin, moditions, paramsList.toArray(new String[]{}));
	}

	@Override
	public long size(Class classes) {
        String moditions = "1=1 ";
		List<String> paramsList = new ArrayList<>();
		if(classes !=null && classes.getName() != null && !"".equals(classes.getName())) {
			moditions += " and this.name like ? ";
			paramsList.add("%"+classes.getName()+"%");
		}
		if(classes !=null && classes.getMajor() !=null && !"".equals(classes.getMajor())){
			
			moditions += " and this.major = ? ";
			paramsList.add(classes.getMajor());
		}
		return super.size(moditions, paramsList.toArray(new String[]{}));
	}
	@Override
	public int BatchDelete(List<String[]> params) {
		int count=template.execute(new HibernateCallback<Integer>() {
			@SuppressWarnings("unchecked")
			@Override
			public Integer doInHibernate(Session session) throws HibernateException {
				int row=0;
				String hql="from Student where classNo=?";
				Query<Student> query;
				for (String[] classNos : params) {
					for (String classNo : classNos) {
						query=session.createQuery(hql);
						System.out.println("dao:"+classNo);
						query.setParameter(0, classNo);
						List<Student> list=query.list();
						if (list.size()>0) {
							row=row+1;
						}
					}
					
				}
				return row;
			}
		});
		
        System.out.println("count:"+count);
        int win=0;
		String sql="delete from class where classNo = ?";
		if (count==0) {
			try {
				win=super.batchModification(sql, params);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else{
			win=0;
		}
		return win;
	}

}
