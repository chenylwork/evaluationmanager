package com.evaluationmanager.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * 
 * @author chenyl
 * @Date 2018年7月19日-下午12:05:09
 * @Description  作用描述信息
 *
 */
/**
 * 改
 * @author 耿佳康
 * @date 2018年7月26日-上午10:38:08
 * @description 编码类别
 */
@Entity
@Table(name="type",uniqueConstraints={@UniqueConstraint(columnNames="typeNo")})
public class Type {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // 自增配置
	private int id; // 编号
	private String typeNo; // 类别编号
	private String name; // 类别名称
	private String description;//描述信息
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Type(int id, String typeNo, String name, String description) {
		super();
		this.id = id;
		this.typeNo = typeNo;
		this.name = name;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeNo() {
		return typeNo;
	}
	public void setTypeNo(String typeNo) {
		this.typeNo = typeNo;
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
		return "Type [id=" + id + ", typeNo=" + typeNo + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
