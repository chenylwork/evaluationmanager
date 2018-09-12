package com.evaluationmanager.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.stereotype.Repository;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.UserDao;
import com.evaluationmanager.entiy.User;
import com.evaluationmanager.support.AbstractDataDao;
import com.evaluationmanager.unit.Md5Unit;

/**
 * 
 * @author 耿佳康
 * @date 2018年7月27日-下午4:57:10
 * @description 用户信息操作实现
 */
@Repository("userDao")
public class UserDaoImpl extends AbstractDataDao<User> implements UserDao {

	@Override
	public User loginUser(String account, String password, String role) {
//		String hql="account=? and password=? and role=? ";
//        role=role.substring(role.length()-2);
//        System.out.println(role);
//        String[]  params={account,password,role};
//		List<Map<String, Object>> usermapList = super.getMapDatas(hql,params);
//		Map<String, Object> usermap=null;
//		if (usermapList.size()>0) {
//			usermap=usermapList.get(0);
//		}
		
		return template.execute(new HibernateCallback<User>() {
			@Override
			public User doInHibernate(Session session) throws HibernateException {
				User user = null;
				// select user
				String hql = "from User where account=? and password=?";
				String role1=role.substring(role.length()-2);
				String[] params = { account, password};
				System.out.println("daopassword"+password);
				try {
					@SuppressWarnings("unchecked")
					Query<User> query = session.createQuery(hql);
					for (int i = 0; i < params.length; i++) {
						query.setParameter(i,params[i]);
					}
					user = query.uniqueResult();
					System.out.println("用户：" + user);
					System.out.println("参数：" + account + "参数2：" + password + "参数3：" + role1);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return user;
			}
		});

	}

	@Override
	public int updatePwd(String account, String password, String oldpwd, String newpwd) {

		return template.execute(new HibernateCallback<Integer>() {
			int row;

			@Override
			public Integer doInHibernate(Session session) throws HibernateException {
				if (password.equals(oldpwd)) {
					String hql = "update User set password=" + newpwd + " where account=" + account;
					@SuppressWarnings("rawtypes")
					Query query = session.createQuery(hql);
					row = query.executeUpdate();
					System.out.println("修改成功" + row);
				}
				return row;
			}
		});

	}

	@Override
	public int resetPwd(String account) {
		return template.execute(new HibernateCallback<Integer>() {
			int row;
			@Override
			public Integer doInHibernate(Session session) throws HibernateException {
				String resetPwd="123456";
				//md5加密验证
				resetPwd=Md5Unit.encodeByMD5(resetPwd);
				String hql = "update User set password="+"'"+resetPwd+ "'"+" where account=" + "'" + account + "'";
				@SuppressWarnings("rawtypes")
				Query query = session.createQuery(hql);
				row = query.executeUpdate();
				return row;
			}
		});
	}

	@Override
	public int BatchDelete(List<String[]> params) {
		String sql = "delete from user where account = ?";
		try {
			return super.batchModification(sql, params);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public long size(User user) {
		String moditions = "1=1 ";
		
		List<String> paramsList = new ArrayList<>();
		if(user !=null && user.getName() != null && !"".equals(user.getName())) {
			moditions += " and name like ? ";
			paramsList.add("%"+user.getName()+"%");
		}
		if(user !=null && user.getRole() !=null && !"".equals(user.getRole())){
			
			moditions += " and role = ? ";
			paramsList.add(user.getRole());
		}
		if (user!=null && user.getSex()!=null && !"".equals(user.getSex())) {
			moditions +=" and sex = ?";
			paramsList.add(user.getSex());
		}
		return super.size(moditions, paramsList.toArray(new String[]{}));
	}

	@Override
	public List<Map<String, Object>> paginSearchUser(Pagin<Map<String, Object>> pagin, User user) {
		String moditions = "1=1 ";
		List<String> paramsList = new ArrayList<>();
		if(user !=null && user.getName() != null && !"".equals(user.getName())) {
			moditions += " and this.name like ? ";
			paramsList.add("%"+user.getName()+"%");
		}
       if(user !=null && user.getRole() !=null && !"".equals(user.getRole())){
			moditions += " and role.no= ? ";
			paramsList.add(user.getRole());
		}
		if (user!=null && user.getSex()!=null && !"".equals(user.getSex())) {
			moditions +=" and this.sex = ?";
			paramsList.add(user.getSex());
		}
		
		return super.paginGetMapDatas(pagin, moditions, paramsList.toArray(new String[]{}));
	}

	@Override
	public Map<String, Object> translate() {
		Connection jdbcCOnnection = getJdbcCOnnection();
		String sql="SELECT (SELECT COUNT(*) deptNo FROM CODE WHERE typeNo = '1') deptNo ,(SELECT COUNT(id)  FROM major) majorSize,(SELECT COUNT(id) FROM teacher) teacherSize,(SELECT COUNT(id) FROM student) studentSize,(SELECT COUNT(id) FROM evaluation_Info) evaluationSize FROM mysql.user LIMIT 1;";
		String deptNo = "";
		String majorSize="";
		String teacherSize="";
		String studentSize="";
		String evaluationSize="";
		Map<String, Object> countMap=new HashMap<String, Object>();
		try {
			PreparedStatement prepareStatement = jdbcCOnnection.prepareStatement(sql);
			ResultSet resultSet = prepareStatement.executeQuery();
			
			
			while(resultSet.next()) {
				deptNo = resultSet.getString("deptNo");
				majorSize=resultSet.getString("majorSize");
				teacherSize=resultSet.getString("teacherSize");
				studentSize=resultSet.getString("studentSize");
				evaluationSize=resultSet.getString("evaluationSize");
				countMap.put("deptNo", deptNo);
				countMap.put("majorSize", majorSize);
				countMap.put("teacherSize", teacherSize);
				countMap.put("studentSize", studentSize);
				countMap.put("evaluationSize", evaluationSize);
				}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return countMap;
	}

}
