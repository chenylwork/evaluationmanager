package com.evaluationmanager.entiy.view;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 试卷教师对应关系视图
 * @Author 陈彦磊
 * @DateTime 2018年8月22日-上午12:38:05
 * @Description 作用描述
 *
 */
@Entity
@Table(name="v_paper_teacher")
public class PaperTeacher {
	@Id
	private String id;
	private String paperNo; // 试卷编号
	private String teacherNo; // 教师编号
	@Column(name="type")
	private String paperType; // 试卷类型编号
	@Column(name="typeName")
	private String paperTypeName; // 试卷类型名称
	private String description; // 试卷描述
	private String startTime; // 试卷启用时间
	private String endTime; // 试卷封闭时间
//	private String teacherNo; // 教师编号
//	private String paperNo; // 试卷编号
	@Column(name="name")
	private String teacherName; // 教师名称
	private String role; // 教师职位角色
	private String major; // 教师专业
	private String state; // 教师状态
	private String dept; // 教师系别
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPaperNo() {
		return paperNo;
	}
	public void setPaperNo(String paperNo) {
		this.paperNo = paperNo;
	}
	public String getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}
	public String getPaperType() {
		return paperType;
	}
	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}
	public String getPaperTypeName() {
		return paperTypeName;
	}
	public void setPaperTypeName(String paperTypeName) {
		this.paperTypeName = paperTypeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "PaperTeacher [id=" + id + ", paperNo=" + paperNo + ", teacherNo=" + teacherNo + ", paperType="
				+ paperType + ", paperTypeName=" + paperTypeName + ", description=" + description + ", startTime="
				+ startTime + ", endTime=" + endTime + ", teacherName=" + teacherName + ", role=" + role + ", major="
				+ major + ", state=" + state + ", dept=" + dept + "]";
	}
}
