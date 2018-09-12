package com.evaluationmanager.entiy.view;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 试卷教师对应关系视图
 * @Author 陈彦磊
 * @DateTime 2018年8月22日-上午12:38:05
 * @Description 作用描述
 *
 */
@Entity
@Table(name="v_paper")
public class PaperView implements Serializable{
	
	private static final long serialVersionUID = -1270482962574746670L;
	@Id
	private String paperNo; // 试卷编号
	private String paperType; // 试卷类型编号
	private String description; // 试卷描述
	private String startTime; // 试卷启用时间
	private String endTime; // 试卷封闭时间
	@Id
	private String questionNo; // 问题编号
	private String questionInfo; // 问题信息
	private String number; // 问题序号
	private String score; // 问题所占分值
	@Id
	private String optionNo; // 选项编号
	private String optionInfo; // 选项信息
	private String letter; // 选项字母
	private String ratio; // 选项所占分值比例
	public String getPaperNo() {
		return paperNo;
	}
	public void setPaperNo(String paperNo) {
		this.paperNo = paperNo;
	}
	public String getPaperType() {
		return paperType;
	}
	public void setPaperType(String paperType) {
		this.paperType = paperType;
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
	public String getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(String questionNo) {
		this.questionNo = questionNo;
	}
	public String getQuestionInfo() {
		return questionInfo;
	}
	public void setQuestionInfo(String questionInfo) {
		this.questionInfo = questionInfo;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getOptionNo() {
		return optionNo;
	}
	public void setOptionNo(String optionNo) {
		this.optionNo = optionNo;
	}
	public String getOptionInfo() {
		return optionInfo;
	}
	public void setOptionInfo(String optionInfo) {
		this.optionInfo = optionInfo;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}
	public String getRatio() {
		return ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + ((letter == null) ? 0 : letter.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((optionInfo == null) ? 0 : optionInfo.hashCode());
		result = prime * result + ((optionNo == null) ? 0 : optionNo.hashCode());
		result = prime * result + ((paperNo == null) ? 0 : paperNo.hashCode());
		result = prime * result + ((paperType == null) ? 0 : paperType.hashCode());
		result = prime * result + ((questionInfo == null) ? 0 : questionInfo.hashCode());
		result = prime * result + ((questionNo == null) ? 0 : questionNo.hashCode());
		result = prime * result + ((ratio == null) ? 0 : ratio.hashCode());
		result = prime * result + ((score == null) ? 0 : score.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
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
		PaperView other = (PaperView) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (letter == null) {
			if (other.letter != null)
				return false;
		} else if (!letter.equals(other.letter))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (optionInfo == null) {
			if (other.optionInfo != null)
				return false;
		} else if (!optionInfo.equals(other.optionInfo))
			return false;
		if (optionNo == null) {
			if (other.optionNo != null)
				return false;
		} else if (!optionNo.equals(other.optionNo))
			return false;
		if (paperNo == null) {
			if (other.paperNo != null)
				return false;
		} else if (!paperNo.equals(other.paperNo))
			return false;
		if (paperType == null) {
			if (other.paperType != null)
				return false;
		} else if (!paperType.equals(other.paperType))
			return false;
		if (questionInfo == null) {
			if (other.questionInfo != null)
				return false;
		} else if (!questionInfo.equals(other.questionInfo))
			return false;
		if (questionNo == null) {
			if (other.questionNo != null)
				return false;
		} else if (!questionNo.equals(other.questionNo))
			return false;
		if (ratio == null) {
			if (other.ratio != null)
				return false;
		} else if (!ratio.equals(other.ratio))
			return false;
		if (score == null) {
			if (other.score != null)
				return false;
		} else if (!score.equals(other.score))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PaperView [paperNo=" + paperNo + ", paperType=" + paperType + ", description=" + description
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", questionNo=" + questionNo + ", questionInfo="
				+ questionInfo + ", number=" + number + ", score=" + score + ", optionNo=" + optionNo + ", optionInfo="
				+ optionInfo + ", letter=" + letter + ", ratio=" + ratio + "]";
	}
	
}
