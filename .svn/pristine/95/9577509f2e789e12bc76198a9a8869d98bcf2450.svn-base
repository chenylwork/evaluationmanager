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
 * @author chenyl
 * @Date 2018年7月19日-下午6:12:17
 * @Description  登录日志信息表
 *
 */
@Entity
@Table(name="login_log")
public class LoginLog {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; // 编号
	@Foreignkey(foreignClass=User.class,column="account")
	private String user; // 登录用户
	@Column(name="loginTime", length=19)
	private String loginTime; // 登录日期
	private String ip; // 登录ip地址
	public LoginLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginLog(int id, String user, String loginTime, String ip) {
		super();
		this.id = id;
		this.user = user;
		this.loginTime = loginTime;
		this.ip = ip;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	@Override
	public String toString() {
		return "LoginLog [id=" + id + ", user=" + user + ", loginTime=" + loginTime + ", ip=" + ip + "]";
	}
	
}
