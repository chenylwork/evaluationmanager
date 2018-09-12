package com.evaluationmanager.support;
/**
 * 业务操作接口，
 * 该接口中定义业务操作的一些返回值常亮
 * @Author 陈彦磊
 * @DateTime 2018年8月9日-下午2:51:25
 * @Description 作用描述
 */
public interface Service {
	
	/**
	 *  保存操作标识
	 */
	public final static int SAVE = 0;
	/**
	 *  修改操作标识
	 */
	public final static int UPDATE = 1;
	/**
	 *  删除操作标识
	 */
	public final static int DELETE = -1;
	/**
	 * 操作成功标识
	 */
	public final static int SUCCESS = 1;
	/**
	 * 操作失败标识
	 */
	public final static int FAIL = 0;
	/**
	 * 操作异常标识
	 */
	public final static int ERROR = -1;

}
