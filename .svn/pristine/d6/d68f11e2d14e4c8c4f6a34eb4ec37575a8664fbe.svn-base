package com.evaluationmanager.service;

import java.util.List;
import java.util.Map;
import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.Major;

/**
 * 
 * 
 * @Author 任少华
 * @Datetime 2018年7月30日-上午10:47:29
 * @Description 描述信息：专业的service
 *
 */
public interface MajorService {
		//添加专业
		public boolean save(Major major);
		
		//修改专业
		public boolean update(Major major);
		
		//删除专业
		public boolean delete(Major major);
		
		//查询全部专业
		public List<Major> getAllCode();
		//查询全部专业（外键）
		public List<Map<String, Object>> getAllMajor();
		
		//根据Id查询专业（连外键）
		public Map<String, Object> majorIdbyMap(String majorNo);
		
		//查询一个院系下的全部专业
		public List<Map<String,Object>> getMajorBydeptNo(String deptNo);
		/**
		 * 分页数据查询
		 * @param pagin
		 * @param conditions
		 * @param params
		 * @return 
		 */
		//public List<Map<String, Object>> paginGet(Pagin<Map<String, Object>> pagin, Major major);
		public List<Map<String, Object>> paginGet(Pagin<Map<String,Object>> pagin, String conditions, String... params);
		public List<Map<String, Object>> paginSearchMajor(Pagin<Map<String, Object>> pagin,Major major);
		/**
		 * @return
		 */
		public int batchDelete(String[] params);
		/**
		 * 
		 */
		public List<Map<String, Object>> getMapDatas(String conditions, String... params);
		
		public boolean IsMajorbyNo(String majorNo);
}
