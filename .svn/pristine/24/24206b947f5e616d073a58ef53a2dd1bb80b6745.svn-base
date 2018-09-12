package com.evaluationmanager.unit;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @Author 陈彦磊
 * @DateTime 2018年7月27日-下午3:46:42
 * @Description 数据编号操作类
 *
 */
public enum NoEnum implements Serializable{
	Role , // 角色
	power, // 权限
	Department, // 系院
	Major, // 专业
	Teacher, // 教师
	Student, // 学生
	Course, // 课程
	Class, // 班级
	Question {
		public String getNo() {
			return System.currentTimeMillis()+"";
		}
	}, // 问题
	Option, // 选项
	Paper{
		public String getNo() {
			return (System.currentTimeMillis() & this.getClass().hashCode())+"";
		}
	}; // 试卷
	public String getNo() {
		return "";
	}
}
