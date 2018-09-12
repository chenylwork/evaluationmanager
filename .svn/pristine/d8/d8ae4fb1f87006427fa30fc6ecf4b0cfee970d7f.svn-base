package com.evaluationmanager.entiy.view;

import java.io.Serializable;

import javax.persistence.Embeddable;
/**
 * 试卷教师对应关系视图联合主键
 * @Author 陈彦磊
 * @DateTime 2018年8月22日-上午12:38:05
 * @Description 作用描述
 *
 */
@Embeddable
public class PaperTeacherID implements Serializable {
	
	private static final long serialVersionUID = -2405190581254854638L;
	private String paperNo; // 试卷编号
	private String teacherNo; // 教师编号
	public String getPaperNo() {
		return paperNo;
	}
	public void setPaperNo(String paperNo) {
		this.paperNo = paperNo;
	}
	public String getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((paperNo == null) ? 0 : paperNo.hashCode());
		result = prime * result + ((teacherNo == null) ? 0 : teacherNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaperTeacherID other = (PaperTeacherID) obj;
		if (paperNo == null) {
			if (other.paperNo != null)
				return false;
		} else if (!paperNo.equals(other.paperNo))
			return false;
		if (teacherNo == null) {
			if (other.teacherNo != null)
				return false;
		} else if (!teacherNo.equals(other.teacherNo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PaperTeacherID [paperNo=" + paperNo + ", teacherNo=" + teacherNo + "]";
	}
	
}
