package com.evaluationmanager.action;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.evaluationmanager.entiy.Option;
import com.evaluationmanager.service.OptionService;
import com.evaluationmanager.support.Action;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年7月27日-下午4:04:24
 * @Description 描述信息：试题选项操作action类
 *
 */
@Controller("optionAction")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class OptionAction extends Action<Option> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private OptionService optionService;
	private Option option = new Option();
	
	//添加试题选项信息
	public String add(){
		this.optionService.add(option);
		return INSERT_OPTION;
	}
	//删除试题选项信息
	public String delete(){
		this.optionService.delete(option);
		return DELETE_OPTION;
	}
	//修改试题选项信息
	public String update(){
		this.optionService.update(option);
		return UPDATE_OPTION;
	}
	@JSON(serialize=false)
	public String all() {
		JSON_CHAR_DATA = gson.toJson(optionService.getAllOption());
		return JSONOCHAR;
	}
	
	
	@Override
	public Option getModel() {
		return option;
	}
	
	
	
}
