package com.evaluationmanager.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author 陈彦磊
 * @DateTime 2018年7月25日-下午3:48:49
 * @Description 对象外键注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Foreignkey {
	/**
	 * 
	 * @Author 陈彦磊
	 * @DateTime 2018年7月30日-下午1:09:27
	 * @Description 外键链接类
	 * @return Class<? extends Object> 外键链接类
	 */
	public Class<? extends Object> foreignClass();
	/**
	 * 
	 * @Author 陈彦磊
	 * @DateTime 2018年7月30日-下午1:09:51
	 * @Description 外键链接类的链接属性
	 * @return String
	 */
	public String column();
	/**
	 * 
	 * @Author 陈彦磊
	 * @DateTime 2018年8月4日-上午12:04:44
	 * @Description 作用描述:是否级联查询
	 *
	 * @return
	 */
	public boolean cascade() default false;
}
