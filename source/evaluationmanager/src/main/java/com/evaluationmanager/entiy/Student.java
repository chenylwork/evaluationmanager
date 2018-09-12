package com.evaluationmanager.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.evaluationmanager.annotation.Foreignkey;
import com.evaluationmanager.annotation.No;

@Entity
@Table(name="student",uniqueConstraints = {@UniqueConstraint(columnNames="stuNo")})
public class Student{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id; // 编号
	@No
	private String stuNo; // 学号
	@Foreignkey(foreignClass=User.class,column="account")
	private String user; // 用户信息
	@Foreignkey(foreignClass=Major.class,column="majorNo")
	private String major; // 所属专业
	private String joinTime; // 入学日期
	private String overTime; // 结业日期
	@Foreignkey(foreignClass=Code.class,column="codeNo")
	private String state; // 当前状态，在校学习、休学离校、服兵役离校、已毕业...等情况
	@Foreignkey(foreignClass=Class.class,column="classNo")
	private String classNo;
	@Foreignkey(foreignClass=Role.class,column="no")
	private String role;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String stuNo, String user, String major, String joinTime, String overTime, String state, String classNo, String role) {
		super();
		this.id = id;
		this.stuNo = stuNo;
		this.user = user;
		this.major = major;
		this.joinTime = joinTime;
		this.overTime = overTime;
		this.state = state;
		this.classNo=classNo;
		this.role=role;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getJoinTime() {
		return joinTime;
	}
	public void setJoinTime(String joinTime) {
		this.joinTime = joinTime;
	}
	public String getOverTime() {
		return overTime;
	}
	public void setOverTime(String overTime) {
		this.overTime = overTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", stuNo=" + stuNo + ", user=" + user + ", major=" + major + ", joinTime="
				+ joinTime + ", overTime=" + overTime + ", state=" + state + ",classNo=" + classNo + ",role=" + role + "]";
	}
	
}
