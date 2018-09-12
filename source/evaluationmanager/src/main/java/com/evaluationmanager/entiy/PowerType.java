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
 * @Datetime 2018年8月9日-上午10:31:49
 * @Description 描述信息：权限类别实体类
 *
 */

@Entity
@Table(name="powertype",uniqueConstraints = {@UniqueConstraint(columnNames="powerTypeNo"),})
public class PowerType {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; // 编号
	@No
	private String powerTypeNo; // 权限类别编号
	private String name;//
	@Foreignkey(foreignClass=Code.class,column="codeNo")
	private String codeNo;//所属类别
	
	
	public PowerType(int id, String powerTypeNo, String name, String codeNo) {
		super();
		this.id = id;
		this.powerTypeNo = powerTypeNo;
		this.name = name;
		this.codeNo = codeNo;
	}
	public PowerType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPowerTypeNo() {
		return powerTypeNo;
	}
	public void setPowerTypeNo(String powerTypeNo) {
		this.powerTypeNo = powerTypeNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCodeNo() {
		return codeNo;
	}
	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}
	@Override
	public String toString() {
		return "PowerType [id=" + id + ", powerTypeNo=" + powerTypeNo + ", name=" + name + ", codeNo=" + codeNo
				+ "]";
	}
	

}
