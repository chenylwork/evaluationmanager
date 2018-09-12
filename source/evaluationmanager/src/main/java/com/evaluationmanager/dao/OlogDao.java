package com.evaluationmanager.dao;

import java.util.List;
import java.util.Map;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.OperationLog;
import com.evaluationmanager.support.DataDao;

public interface OlogDao extends DataDao<OperationLog>{
	public int batchDelete(List<String[]> params);
	public List<Map<String, Object>> paginSearchMajor(Pagin<Map<String, Object>> pagin, OperationLog oLog);
	public long size(OperationLog oLog);
}
