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
 * @Datetime 2018年7月30日-下午4:05:54
 * @Description 描述信息：试卷信息实体类
 *
 */
@Entity
@Table(name="paper",uniqueConstraints={@UniqueConstraint(columnNames="paperNo")})
public class Paper {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; // 编号
	
	@No
	private String paperNo; // 试卷编号
	
	@Foreignkey(foreignClass=Code.class,column="codeNo")
	private String type; // 试卷类型
	
	private String description; // 试卷描述
	private String startTime; // 开始使用时间
	private String endTime; // 结束使用时间
	
	public Paper() {
		super();
	}
	public Paper(String paperNo, String type, String description, String startTime, String endTime) {
		super();
		this.paperNo = paperNo;
		this.type = type;
		this.description = description;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Paper(int id, String paperNo, String type, String description, String startTime, String endTime) {
		super();
		this.id = id;
		this.paperNo = paperNo;
		this.type = type;
		this.description = description;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPaperNo() {
		return paperNo;
	}
	public void setPaperNo(String paperNo) {
		this.paperNo = paperNo;
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
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
}