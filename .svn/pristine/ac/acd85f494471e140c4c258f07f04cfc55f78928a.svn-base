package com.evaluationmanager.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

import com.evaluationmanager.annotation.No;
/**
 * 
 * @author chenyl
 * @Date 2018年7月19日-下午5:36:53
 * @Description  试题信息表对应类
 *
 */
/**
 * 改
 * @author 耿佳康
 * @date 2018年7月26日-上午9:50:30
 * @description 试题信息表对应类
 */
@Entity
@Table(name="question",uniqueConstraints={@UniqueConstraint(columnNames="questionNo"),@UniqueConstraint(columnNames="question")})
@Component("question")
public class Question{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id; // 编号
	@No
	private String questionNo;
	private String question;
	private String description;
	public Question() {
		super();
	}
	public Question(int id, String questionNo, String question, String description) {
		super();
		this.id = id;
		this.questionNo = questionNo;
		this.question = question;
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(String questionNo) {
		this.questionNo = questionNo;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", questionNo=" + questionNo + ", question=" + question + ", description="
				+ description + "]";
	}
	
}
