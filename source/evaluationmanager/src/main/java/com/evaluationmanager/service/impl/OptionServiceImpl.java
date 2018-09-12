package com.evaluationmanager.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.evaluationmanager.dao.OptionDao;
import com.evaluationmanager.entiy.Option;
import com.evaluationmanager.service.OptionService;
import com.evaluationmanager.support.AbstractService;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年7月27日-下午3:54:41
 * @Description 描述信息：试题选项信息操作业务实现类
 *
 */
@org.springframework.stereotype.Service("optionService")
public class OptionServiceImpl extends AbstractService<Option> implements OptionService {
	
	@Autowired
	private OptionDao optionDao;
	
	//添加试题选项信息
	@Override
	@Transactional
	public boolean add(Option o) {
		return this.optionDao.add(o);
	}

	//修改试题选项信息
	@Override
	@Transactional
	public boolean update(Option o) {
		return this.optionDao.update(o);
	}

	//删除试题选项信息
	@Override
	@Transactional
	public boolean delete(Option o) {
		return this.optionDao.delete(o);
	}

	@Override
	public List<Option> getAllOption() {
		return optionDao.getDatas("");
	}
	
}
