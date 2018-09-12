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
 * @author chenyl
 * @Date 2018年7月19日-下午2:06:36
 * @Description  班级信息表对应类
 *
 */
@Entity
@Table(name="class",uniqueConstraints={@UniqueConstraint(columnNames="classNo")})
public class Class {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id; // 编号
	@No
	private String classNo; // 班级编号
	private String name; // 班级名称
	@Foreignkey(foreignClass=Major.class,column="majorNo")
	private String major; // 所属专业
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Class(long id, String classNo, String name, String major) {
		super();
		this.id = id;
		this.classNo = classNo;
		this.name = name;
		this.major = major;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Class [id=" + id + ", classNo=" + classNo + ", name=" + name + ", major=" + major + "]";
	}
	
}
