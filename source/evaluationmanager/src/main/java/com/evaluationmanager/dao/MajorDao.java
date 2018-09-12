package com.evaluationmanager.dao;

import java.util.List;
import java.util.Map;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.Major;
import com.evaluationmanager.support.DataDao;

/**
 * 
 * 
 * @Author 任少华
 * @Datetime 2018年7月30日-上午10:13:34
 * @Description 描述信息：专业操作接口
 *
 */
public interface MajorDao extends DataDao<Major> {
	/**
	 * 批量删除方法
	 * @return
	 */
	public int batchDelete(List<String[]> params);
	/**
	 * 
	 * @param pagin
	 * @param major
	 * @return
	 */
	public List<Map<String, Object>> paginSearchMajor(Pagin<Map<String, Object>> pagin, Major major);
	public long size(Major major);
	/**
	 * 查重
	 * @param majorNo
	 * @return
	 */
	public Major IsMajorbyNo(String majorNo);
}
