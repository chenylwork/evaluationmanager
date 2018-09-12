package com.evaluationmanager.dao;

import java.util.List;

import com.evaluationmanager.common.Pagin;
import com.evaluationmanager.entiy.Question;
import com.evaluationmanager.support.DataDao;
/**
 * @Author 陈彦磊
 * @DateTime 2018年7月26日-上午10:24:54
 * @Description 问题信息操作接口
 */
public interface QuestionDao extends DataDao<Question>{
	/**
	 * 添加问题信息，根据传入的问题实体对象数组进行添加
	 * 该方法也可传入多个问题信息实体对象进行批量添加
	 * @Author 陈彦磊
	 * @DateTime 2018年8月9日-下午7:34:52
	 * @param questions 需要添加的问题信息实体对象可变数组
	 * @return 添加成功的记录数 异常将返回0
	 */
	public int insert(Question... questions);
	/**
	 * 修改问题信息，根据传入的问题实体对象数组进行修改
	 * 该方法也可传入多个问题信息实体对象进行批量修改
	 * @Author 陈彦磊
	 * @DateTime 2018年8月9日-下午7:44:41
	 * @param questions 需要添加的问题信息实体对象可变数组
	 * @return 添加成功的记录数 异常将返回0
	 */
	public int update(Question... questions);
	/**
	 * 根据问题信息检查该问题信息是否已存在
	 * @Author 陈彦磊
	 * @DateTime 2018年8月9日-下午3:38:48
	 * @Description 作用描述
	 * @param question 问题信息
	 * @return 存在返回true 不存在返回false
	 */
	public boolean check(String question);
	/**
	 * 删除问题信息，根据传入的问题编号进行删除
	 * 该方法也可传入多个问题编号进行批量删除
	 * @Author 陈彦磊
	 * @DateTime 2018年8月7日-下午10:45:27
	 * @param params 问题编号可变数组
	 * @return 成功删除记录数 
	 */
	public int delete(String... params);
	/**
	 * 根据问题信息判断有该信息
	 * @Author 陈彦磊
	 * @DateTime 2018年8月9日-下午1:58:05
	 * @param questionInfo 试题信息
	 * @return 存在返回true 不存在返回false
	 */
	public boolean ishas(String questionInfo);

	/**
	 * 分页多条件模糊查询问题根信息
	 * 当有查询条件时，返回约束查询的一页信息List集合,
	 * 当没有条件信息时，将返回全部数据中的一页数据
	 * 该方法执行之后将查询到底数据存入pagin对象的data属性中
	 * @Author 陈彦磊
	 * @DateTime 2018年8月9日-下午2:06:59
	 * @param pagin 分页对象
	 * @param question 问题查询条件参数对象
	 * @return List<Question>
	 */
	public List<Question> paginSearchQuestion(Pagin<Question> pagin,Question question);
	/**
	 * 根据约束条件查询问题信息记录数
	 * 若没有约束条件即为获取全部记录数
	 * @Author 陈彦磊
	 * @DateTime 2018年8月9日-下午2:12:44
	 * @param question 查询约束条件对象
	 * @return 若有约束条件返回由约束条件获取到的数据记录数，否则返回全部记录数
	 */
	public long size(Question question);
	
}
