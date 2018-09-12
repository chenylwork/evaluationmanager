package com.evaluationmanager.entiy.view;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.evaluationmanager.annotation.No;

/**
 * @Author 陈彦磊
 * @DateTime 2018年8月22日-下午3:47:48
 * @Description 教师信息视图
 * 该对象包含教师基本信息，及其专业信息，所属专业，所属系别，教师职务全部显示
 */
@Entity
@Table(name="v_teacher")
public class TeacherView {
	@Id
	@No
	private String no; // 编号
	private String account; // 账号
	private String name; // 名称
	private String password; // 密码
	private String sex; // 性别
	private int age; // 年龄
	private String pid; // 身份证号
	private String roleNo; // 职位编号
	private String roleName; // 职位名称
	private String majorNo; // 专业编号
	private String majorName; // 专业名称
	private String state; // 教师状态
	private String stateName; // 教师状态名称
	private String deptNo; // 教师所属系别
	private String deptName; // 教师所属系别名称
	
	public TeacherView() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getRoleNo() {
		return roleNo;
	}
	public void setRoleNo(String roleNo) {
		this.roleNo = roleNo;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getMajorNo() {
		return majorNo;
	}
	public void setMajorNo(String majorNo) {
		this.majorNo = majorNo;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "TeacherView [no=" + no + ", account=" + account + ", name=" + name + ", password=" + password + ", sex="
				+ sex + ", age=" + age + ", pid=" + pid + ", roleNo=" + roleNo + ", roleName=" + roleName + ", majorNo="
				+ majorNo + ", majorName=" + majorName + ", state=" + state + ", stateName=" + stateName + ", deptNo="
				+ deptNo + ", deptName=" + deptName + "]";
	}
}
