package com.evaluationmanager.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.evaluationmanager.annotation.Foreignkey;
/**
 * 
 * @author 耿佳康
 * @date 2018年7月26日-上午10:33:49
 * @description 教师-课程关系表
 */
@Entity
@Table(name="teacher_course")
public class TeacherCourse {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;//编号
	@Foreignkey(foreignClass=Teacher.class,column="teacherNo")
	private String teacher;//教师
	@Foreignkey(foreignClass=Course.class,column="courseNo")
	private String course;//课程
	public TeacherCourse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeacherCourse(int id, String teacher, String course) {
		super();
		this.id = id;
		this.teacher = teacher;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "TeacherCourse [id=" + id + ", teacher=" + teacher + ", course=" + course + "]";
	}
	
}
