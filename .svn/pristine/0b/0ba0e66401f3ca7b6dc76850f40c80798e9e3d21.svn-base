package com.evaluationmanager.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.evaluationmanager.annotation.Foreignkey;

/**
 * 
 * @author chenyl
 * @Date 2018年7月19日-下午5:57:46
 * @Description  试卷试题关系表对应类
 *
 */
@Entity
@Table(name="paper_teacher")
public class PaperTeacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; // 编号
	@Foreignkey(foreignClass=Paper.class,column="paperNo")
	private String paper; // 试卷
	@Foreignkey(foreignClass=Teacher.class,column="teacherNo")
	private String teacher; // 被测教师
	private String startTime; // 开始时间
	private String endTime;// 结束时间
	
	
	public PaperTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaperTeacher(String paper, String teacher, String startTime, String endTime) {
		super();
		this.paper = paper;
		this.teacher = teacher;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPaper() {
		return paper;
	}
	public void setPaper(String paper) {
		this.paper = paper;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
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
	@Override
	public String toString() {
		return "PaperTeacher [id=" + id + ", paper=" + paper + ", teacher=" + teacher + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}
	
}