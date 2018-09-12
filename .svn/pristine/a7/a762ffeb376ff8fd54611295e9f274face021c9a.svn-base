package com.evaluationmanager.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * 
 * @author 耿佳康
 * @date 2018年7月25日-下午5:31:01
 * @description 课程信息表对应类
 */
@Entity
@Table(name="course",uniqueConstraints={@UniqueConstraint(columnNames="courseNo")})
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;//编号
	public String courseNo;//课程编号
	public String name;//课程名称
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String courseNo, String name) {
		super();
		this.id = id;
		this.courseNo = courseNo;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseNo=" + courseNo + ", name=" + name + "]";
	}
 
}
