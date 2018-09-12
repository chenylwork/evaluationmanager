package com.evaluationmanager.entiy;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.evaluationmanager.annotation.Foreignkey;
import com.evaluationmanager.annotation.No;

/**
 * 
 * @Author 韩笑
 * @Datetime 2018年7月30日-下午4:06:21
 * @Description 描述信息：教师实体类
 *
 */
@Entity
@Table(name="teacher",uniqueConstraints = {@UniqueConstraint(columnNames="teacherNo"),})
public class Teacher{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; // 编号
	
	@No
	private String teacherNo; // 工号
	
	@Foreignkey(foreignClass=User.class,column="account")
	private String user; // 用户信息
	
	@Foreignkey(foreignClass=Role.class,column="no")
	private String role; // 职务
	
	@Foreignkey(foreignClass=Major.class,column="majorNo")
	private String major; // 所属专业
	
	@Foreignkey(foreignClass=Code.class,column="codeNo")
	private String state; // 教师当前状态：在授课、不授课、病事等特殊情况
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int id, String teacherNo, String user, String role, String major, String state) {
		super();
		this.id = id;
		this.teacherNo = teacherNo;
		this.user = user;
		this.role = role;
		this.major = major;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teacherNo=" + teacherNo + ", user=" + user + ", role=" + role + ", major="
				+ major + ", state=" + state + "]";
	}
	
}
