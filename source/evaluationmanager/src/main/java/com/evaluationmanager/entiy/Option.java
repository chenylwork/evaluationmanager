package com.evaluationmanager.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.evaluationmanager.annotation.No;
/**
 * 
 * @author 耿佳康
 * @date 2018年7月26日-上午9:28:50
 * @description 试题选项信息表
 */
@Entity
@Table(name="optionInfo")
public class Option {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;//编号
	
	@No
	private String optionNo;//选项编号
	private String info;//选项信息
	
	public Option() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOptionNo() {
		return optionNo;
	}

	public void setOptionNo(String optionNo) {
		this.optionNo = optionNo;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Option [id=" + id + ", optionNo=" + optionNo + ", info=" + info + "]";
	}
}
