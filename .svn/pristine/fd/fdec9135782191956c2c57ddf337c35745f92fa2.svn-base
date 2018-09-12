package com.evaluationmanager.entiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.evaluationmanager.annotation.Foreignkey;
/**
 * 
 * @author 耿佳康
 * @date 2018年7月26日-上午10:33:54
 * @description 教师-班级信息-课程关系表
 */
@Entity
@Table(name="teacher_class_course")
public class TeacherClassCourse {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;//编号
	 @Foreignkey(foreignClass=Teacher.class,column="teacherNo")
	 private String teacher;//教师
	 @Foreignkey(foreignClass=Class.class,column="classNo")
	 @Column(name="class")
	 private String classes;//班级
	 @Foreignkey(foreignClass=Course.class,column="courseNo")
	 private String course;//课程
	 
	public TeacherClassCourse() {
		super();
	}

	public TeacherClassCourse(int id, String teacher, String classes, String course) {
		super();
		this.id = id;
		this.teacher = teacher;
		this.classes = classes;
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

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "TeacherClassCourse [id=" + id + ", teacher=" + teacher + ", classes=" + classes + ", course=" + course
				+ "]";
	}
	 
}
