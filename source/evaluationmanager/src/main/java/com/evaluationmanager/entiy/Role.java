package com.evaluationmanager.entiy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.evaluationmanager.annotation.Foreignkey;
import com.evaluationmanager.annotation.No;

/**
 * 角色实体类
 * @Author 陈彦磊
 * @DateTime 2018年8月19日-下午11:36:19
 *
 */
@Entity
@Table(name="role")
public class Role {
	@Id
	private int id; // 主键id
	@No
	private String no; // 编号
	private String name; // 名称
	@Foreignkey(foreignClass=Code.class,column="codeNo")
	private String type; // 角色类型
	private String description; // 描述信息
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(String no, String name, String type, String description) {
		super();
		this.no = no;
		this.name = name;
		this.type = type;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", no=" + no + ", name=" + name + ", type=" + type + ", description=" + description
				+ "]";
	}
}
