package com.evaluationmanager.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @Author 陈彦磊
 * @DateTime 2018年7月27日-下午3:16:44
 * @Description 标识该属性为数据的no字段信息
 */
@Target(ElementType.FIELD) // 只能作用在属性上面
@Retention(RetentionPolicy.RUNTIME)
public @interface No {
}
