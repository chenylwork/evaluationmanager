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
 * @Date 2018年7月19日-下午1:48:45
 * @Description  编码信息数据表对应类
 *
 */
@Entity
@Table(name="code",uniqueConstraints={@UniqueConstraint(columnNames="codeNo")})
public class Code {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; // 编号
	@No
	private String codeNo; // 编码编号
	private String name; // 编码代表名称
	private String description;//描述信息
	@Foreignkey(foreignClass=Type.class,column="typeNo")
	private String typeNo; // 编码所属类别
	public Code() {
		super();
	}

	public Code(int id, String codeNo, String name, String description, String typeNo) {
		super();
		this.id = id;
		this.codeNo = codeNo;
		this.name = name;
		this.description = description;
		this.typeNo = typeNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodeNo() {
		return codeNo;
	}

	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
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

	public String getTypeNo() {
		return typeNo;
	}

	public void setTypeNo(String typeNo) {
		this.typeNo = typeNo;
	}

	@Override
	public String toString() {
		return "Code [id=" + id + ", codeNo=" + codeNo + ", name=" + name + ", description=" + description + ", typeNo="
				+ typeNo + "]";
	}
	
}
