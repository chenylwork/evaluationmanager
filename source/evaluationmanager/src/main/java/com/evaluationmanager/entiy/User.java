package com.evaluationmanager.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.evaluationmanager.annotation.Foreignkey;
import com.evaluationmanager.annotation.No;
import com.evaluationmanager.unit.Md5Unit;

/**
 * yonghu
 * @author chenyl
 * @Date 2018年7月19日-下午2:10:54
 * @Description  作用描述信息
 *
 */
/**
 * 改
 * @author 耿佳康
 * @date 2018年7月26日-上午10:43:03
 * @description 用户信息表
 */
@Entity
@Table(name="user",uniqueConstraints = {@UniqueConstraint(columnNames="pid"),@UniqueConstraint(columnNames="account")})
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;//编号
	@No
	private String account ; // 账号
	private String password;// 密码
	private String name; // 用户名称
	@Foreignkey(foreignClass=Code.class,column="name")
	private String sex; // 性别
	private int age; // 年龄
	@Foreignkey(foreignClass=Role.class,column="no")
	private String role; // 用户类型：教师、学生
	private String pid; // 身份证号
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long id, String account, String password, String name, String sex, int age, String role, String pid) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.role = role;
		this.pid = pid;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		//md5密码加密 Md5Unit.encodeByMD5()
		this.password =password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", password=" + password + ", name=" + name + ", sex=" + sex
				+ ", age=" + age + ", role=" + role + ", pid=" + pid + "]";
	}
	
}
