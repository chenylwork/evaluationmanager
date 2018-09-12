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
 * @Author 韩笑
 * @Datetime 2018年8月9日-上午11:14:40
 * @Description 描述信息：权限-用户关系表
 *
 */
@Entity
@Table(name="user_power")
public class PowerUser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Foreignkey(foreignClass=PowerInfo.class,column="powerInfoNo")
	@Column(name="powerInfo")
	private String powerInfoNo;
	@Foreignkey(foreignClass=User.class,column="account")
	private String user;
	
	public PowerUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PowerUser(String powerInfoNo, String user) {
		super();
		this.powerInfoNo = powerInfoNo;
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPowerInfoNo() {
		return powerInfoNo;
	}
	public void setPowerInfoNo(String powerInfoNo) {
		this.powerInfoNo = powerInfoNo;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "PowerUser [id=" + id + ", powerInfoNo=" + powerInfoNo + ", user=" + user + "]";
	}
	
	

}
