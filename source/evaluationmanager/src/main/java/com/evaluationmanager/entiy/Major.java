package com.evaluationmanager.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

import com.evaluationmanager.annotation.Foreignkey;
import com.evaluationmanager.annotation.No;

/**
 * 
 * @author 耿佳康
 * @date 2018年7月25日-下午5:37:30
 * @description 院系专业关系表
 */
@Entity
@Table(name = "major", uniqueConstraints = { @UniqueConstraint(columnNames = "majorNo") })
@Component("major")
public class Major {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;// 编号
	@Foreignkey(foreignClass = Code.class, column = "codeNo")
	private String deptNo;// 系别编号
	@No
	private String majorNo;
	private String name;// 专业名称
	private String description;// 描述信息
	public Major() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Major(int id, String deptNo, String majorNo, String name, String description) {
		super();
		this.id = id;
		this.deptNo = deptNo;
		this.majorNo = majorNo;
		this.name = name;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getMajorNo() {
		return majorNo;
	}
	public void setMajorNo(String majorNo) {
		this.majorNo = majorNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Major [id=" + id + ", deptNo=" + deptNo + ", majorNo=" + majorNo + ", name=" + name + ", description="
				+ description + "]";
	}

	
}
