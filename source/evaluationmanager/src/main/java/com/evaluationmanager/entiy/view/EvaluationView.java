package com.evaluationmanager.entiy.view;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 测评结果视图
 * @Author 陈彦磊
 * @DateTime 2018年8月24日-上午3:14:29
 * @Description 作用描述
 *
 */
@Entity
@Table(name="v_evaluation")
public class EvaluationView{
	@Id
	private String id;
	private String paper;//试卷
	private String user;//用户
	private String teacher;//教师
	private String paperType;//试卷类型编号
	private String time;//时间
	private String options;//选项
	private String score;//分数
	private String username;//用户名
	private String userSex;//性别
	private String userRole;//角色
	private String userRoleName;//角色名称
	private String userRoleTypeName;//角色类别名称
	private String teacherAccount;//教师工号
	private String teacherName; // 教师名称
	private String teacherRole;//教师职务
	private String teacherMajor;//教师专业
	private String teacherRoleName;//教师职务名称
	private String teacherRoleTypeName;//教师职务类别名称
	private String teacherMajorName;//教师专业名称
	private String teacherDept;//教师院系
	private String teacherDeptName;//教师院系名称
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPaper() {
		return paper;
	}
	public void setPaper(String paper) {
		this.paper = paper;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getPaperType() {
		return paperType;
	}
	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getUserRoleName() {
		return userRoleName;
	}
	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}
	public String getUserRoleTypeName() {
		return userRoleTypeName;
	}
	public void setUserRoleTypeName(String userRoleTypeName) {
		this.userRoleTypeName = userRoleTypeName;
	}
	public String getTeacherAccount() {
		return teacherAccount;
	}
	public void setTeacherAccount(String teacherAccount) {
		this.teacherAccount = teacherAccount;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherRole() {
		return teacherRole;
	}
	public void setTeacherRole(String teacherRole) {
		this.teacherRole = teacherRole;
	}
	public String getTeacherMajor() {
		return teacherMajor;
	}
	public void setTeacherMajor(String teacherMajor) {
		this.teacherMajor = teacherMajor;
	}
	public String getTeacherRoleName() {
		return teacherRoleName;
	}
	public void setTeacherRoleName(String teacherRoleName) {
		this.teacherRoleName = teacherRoleName;
	}
	public String getTeacherRoleTypeName() {
		return teacherRoleTypeName;
	}
	public void setTeacherRoleTypeName(String teacherRoleTypeName) {
		this.teacherRoleTypeName = teacherRoleTypeName;
	}
	public String getTeacherMajorName() {
		return teacherMajorName;
	}
	public void setTeacherMajorName(String teacherMajorName) {
		this.teacherMajorName = teacherMajorName;
	}
	public String getTeacherDept() {
		return teacherDept;
	}
	public void setTeacherDept(String teacherDept) {
		this.teacherDept = teacherDept;
	}
	public String getTeacherDeptName() {
		return teacherDeptName;
	}
	public void setTeacherDeptName(String teacherDeptName) {
		this.teacherDeptName = teacherDeptName;
	}
	@Override
	public String toString() {
		return "EvaluationView [id=" + id + ", paper=" + paper + ", user=" + user + ", teacher=" + teacher
				+ ", paperType=" + paperType + ", time=" + time + ", options=" + options + ", score=" + score
				+ ", username=" + username + ", userSex=" + userSex + ", userRole=" + userRole + ", userRoleName="
				+ userRoleName + ", userRoleTypeName=" + userRoleTypeName + ", teacherAccount=" + teacherAccount
				+ ", teacherName=" + teacherName + ", teacherRole=" + teacherRole + ", teacherMajor=" + teacherMajor
				+ ", teacherRoleName=" + teacherRoleName + ", teacherRoleTypeName=" + teacherRoleTypeName
				+ ", teacherMajorName=" + teacherMajorName + ", teacherDept=" + teacherDept + ", teacherDeptName="
				+ teacherDeptName + "]";
	}
}
