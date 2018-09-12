package com.evaluationmanager.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.dao.MajorDao;
import com.evaluationmanager.entiy.Major;
import com.evaluationmanager.service.MajorService;
import com.evaluationmanager.support.AbstractService;
import com.google.gson.Gson;
/**
 * 
 * 
 * @Author 任少华
 * @Datetime 2018年7月30日-上午10:58:52
 * @Description 描述信息：专业信息操作业务实现类
 *
 */
@org.springframework.stereotype.Service("majorService")
public class MajorServiceImpl extends AbstractService<Major> implements MajorService  {
	@Autowired
	private MajorDao majorDao;
	@Autowired
	private Gson gson;
	public void setMajorDao(MajorDao majorDao) {
		super.setDataDao(this.majorDao = majorDao);
	}

	@Override
	@Transactional
	public boolean save(Major major) {
		// TODO Auto-generated method stub
		return majorDao.add(major);
	}

	@Override
	@Transactional
	public boolean update(Major major) {
		// TODO Auto-generated method stub
		return majorDao.update(major);
	}

	@Override
	@Transactional
	public boolean delete(Major major) {
		// TODO Auto-generated method stub
		return majorDao.delete(major);
	}

	@Override
	@Transactional
	public List<Major> getAllCode() {
		// TODO Auto-generated method stub
		List<Major> major = majorDao.getDatas("");
		return major;
	}


	
	@Override
	@Transactional
	public List<Map<String,Object>> getMajorBydeptNo(String deptNo){
		String hql=" deptNo=? ";
		return majorDao.getMapDatas(hql, deptNo);
		
	}

/**	@Override
	public List<Map<String, Object>> paginGet(Pagin<Map<String, Object>> pagin, Major major) {
		
		String conditions = " 1=1 ";
		List<String> list = new ArrayList<>();
		if(major.getName() != null) {
			conditions = conditions + " and this.name = ?";
			list.add("%"+major.getName()+"%");
		}
		if(major.getDeptNo() != null) {
			conditions = conditions + " and this.deptNo = ?";
			list.add("%"+major.getDeptNo()+"%");
		}
		String[] params = list.toArray(new String[]{});
		System.out.println(conditions);
		System.out.println(params.length);
		// 获取总个数
		pagin.setCount(majorDao.size(conditions, params));
		// 获取数据
		return majorDao.paginGetMapDatas(pagin, conditions, params);
	}**/
	@Override
	public List<Map<String, Object>> paginGet(Pagin<Map<String,Object>> pagin, String conditions, String... params) {
		// 获取总个数
		pagin.setCount(majorDao.size(conditions, params));
		// 获取数据
		return majorDao.paginGetMapDatas(pagin, conditions, params);
	}
	
	
	@Override
	@Transactional
	public List<Map<String, Object>> paginSearchMajor(Pagin<Map<String, Object>> pagin,Major major) {
		pagin.setCount(majorDao.size(major));
		return this.majorDao.paginSearchMajor(pagin,major);
	}
	

	//根据majorNo查询专业（连外键）
		@Override
		@Transactional
		public Map<String, Object> majorIdbyMap(String majorNo){
			Map<String, Object> majorbyNo = null;
			try {
				majorbyNo = this.majorDao.getMapDataByNo(majorNo);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return majorbyNo;
		}

		@Override
		public List<Map<String, Object>> getAllMajor() {
			return this.majorDao.getMapDatas("");
		}
		
		@Override
		public int batchDelete(String[] params) {
			List<String[]> paramList = new ArrayList<>();
			for(String string : params) {
				System.out.println(string);
				paramList.add(new String[]{string});
			}
			return majorDao.batchDelete(paramList);
		}

		@Override
		public List<Map<String, Object>> getMapDatas(String conditions, String... params) {
			String hql=" Major.deptNo=? and Major.name=? ";
			return majorDao.getMapDatas(hql, params);
		}
		@Override
		@Transactional
		public boolean IsMajorbyNo(String majorNo) {
			System.out.println("majorno="+majorNo);
			Major major = majorDao.IsMajorbyNo(majorNo);
			if (major!=null) {
				System.out.println("major============"+major);
				return false;
			}else {
				System.out.println("major————————————————"+major);
				return true;
			}
		}
	
}
