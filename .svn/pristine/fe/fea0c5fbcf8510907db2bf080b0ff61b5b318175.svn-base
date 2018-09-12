package com.evaluationmanager.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.evaluationmanager.entiy.Question;
import com.evaluationmanager.service.QuestionService;
import com.evaluationmanager.support.Action;

/**
 * @Author 陈彦磊
 * @DateTime 2018年7月26日-上午10:23:40
 * @Description 问题操作action类
 */
@Controller("questionAction")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class QuestionAction extends Action<Question> {
	/**
	 * 本类的序列化编号
	 */
	private static final long serialVersionUID = -562466119093895304L;
	/**
	 * 业务操作类，本action类的一切请求的业务处理接口
	 */
	@Autowired
	private QuestionService questionService;
	/**
	 * 本action类的处理模型
	 */
	private Question question = new Question(); 
	/**
	 * 随机获取试题的个数
	 */
	private int randomSize;
	/**
	 * 批量删除用到的问题编号数组
	 */
	private String[] no;
	/**
	 * 添加修改问题信息用到json格式数据的字符串
	 */
	private String data;
	
	@Override
	public Question getModel() {
		return question;
	}
	/**
	 * 添加问题及其相关信息请求
	 * 该请求处理将返回一个字符
	 * 请求操作成功返回1 请求操作失败返回0
	 * @Author 陈彦磊
	 * @DateTime 2018年8月9日-下午9:19:26
	 * @return 返回结果为json 需要在配置文件中的result节点中的配置name属性值为json
	 */
	public String add() {
		JSON_CHAR_DATA = questionService.add(data)+"";
		return JSONOCHAR;
	}
	/**
	 * 修改问题信息请求
	 * 该请求处理将返回一个字符
	 * 请求操作成功返回1 请求操作失败返回0
	 * @Author 陈彦磊
	 * @DateTime 2018年8月9日-下午10:19:30
	 * @return 返回结果为json 需要在配置文件中的result节点中的配置name属性值为json
	 */
	public String update() {
		JSON_CHAR_DATA = questionService.update(data)+"";
		return JSONOCHAR;
	}
	public String getAll() {
		JSON_CHAR_DATA = questionService.getAllQuestion();
		return JSONOCHAR;
	}
	/**
	 * 数据获取请求
	 * @Author 陈彦磊
	 * @DateTime 2018年8月9日-下午9:21:21
	 * @return 返回结果为json 需要在配置文件中的result节点中的配置name属性值为json
	 */
	public String search() {
		JSON_CHAR_DATA = questionService.paginSearch(pagin, question);
		return JSONOCHAR;
	}
	/**
	 * 根据question的no查询获取question信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月7日-下午10:32:39
	 * @return 返回结果为json 需要在配置文件中的result节点中的配置name属性值为json
	 */
	public String searchByNo() {
		JSON_CHAR_DATA =  questionService.getQuestionByNo(question.getQuestionNo());
		return JSONOCHAR;
	}
	public String getQuestionByNoName() {
		JSON_CHAR_DATA =  questionService.getQuestionByNoName(question.getQuestionNo());
		return JSONOCHAR;
	}
	/**
	 * 随机获取试题请求
	 * @Author 陈彦磊
	 * @DateTime 2018年8月12日-下午2:57:57
	 * @Description 作用描述
	 *
	 * @return
	 */
	public String randomSearch() {
		JSON_CHAR_DATA =  questionService.randomGetQuestionO(randomSize);
		return JSONOCHAR;
		
	}
	public String searchByPaperNo(){
		JSON_CHAR_DATA =  questionService.getQuestionByPaperNo(data);
		return JSONOCHAR;
	}
	/**
	 * 删除操作
	 * @Author 陈彦磊
	 * @DateTime 2018年8月7日-下午11:04:28
	 * @return  返回结果为json 需要在配置文件中的result节点中的配置name属性值为json
	 */
	public String delete() {
		JSON_CHAR_DATA = questionService.delete(no)+"";
		return JSONOCHAR;
	}
	/**
	 * 问题查重检查请求
	 * 该请求结果将返回一个字符
	 * 请求操作成功返回1 请求操作失败返回0
	 * @Author 陈彦磊
	 * @DateTime 2018年8月9日-下午10:32:40
	 * @return 返回结果为json 需要在配置文件中的result节点中的配置name属性值为json
	 */
	public String check() {
		JSON_CHAR_DATA = questionService.check(question)+"";
		return JSONOCHAR;
	}
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String[] getNo() {
		return no;
	}
	public void setNo(String[] no) {
		this.no = no;
	}
	public int getRandomSize() {
		return randomSize;
	}
	public void setRandomSize(int randomSize) {
		this.randomSize = randomSize;
	}
	
}
