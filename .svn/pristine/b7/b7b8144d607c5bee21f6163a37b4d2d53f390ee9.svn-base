package com.evaluationmanager.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.evaluationmanager.dao.CodeDao;
import com.evaluationmanager.entiy.Code;
import com.evaluationmanager.support.AbstractDataDao;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年8月2日-下午2:47:15
 * @Description 描述信息：
 *
 */
@Repository("codeDao")
public class CodeDaoImpl extends AbstractDataDao<Code> implements CodeDao {

	@Override
	public List<Map<String, Object>> getPaperType() {
		return getMapDatas("typeNo.name = ?", "试卷类型");
	}
	@Override
	public List<Code> getRole() {
		return getDatas("typeNo = ?","3");
	}
	
	@Override
	public List<Code> getSex() {
		return getDatas("typeNo = ?","4");
	}

	

	@Override
	public List<Code> getTeacherState() {
		return getDatas("typeNo = ?","5");
	}
	
	@Override
	public List<Code> getStudentState() {
		return getDatas("typeNo = ?","6");
	}
	@Override
	public List<Code> getpaperType() {
		return getDatas("typeNo = ?","7");
	}
}
