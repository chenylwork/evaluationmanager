package com.evaluationmanager.entiy;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.evaluationmanager.annotation.Foreignkey;

/**
 * @author 耿佳康
 * @date 2018年7月26日-上午9:59:39
 * @description 试题-试题选项关系表
 */
@Entity
@Table(name="question_option")
@Component("questionOption")
public class QuestionOption {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;//编号
	@Foreignkey(foreignClass=Question.class,column="questionNo")
	private String question;//试题
	@Column(name="optionNo")
	@Foreignkey(foreignClass=Option.class,column="optionNo")
	private String option;//选项
	private String letter;//选项号
	private int ratio;//选项所占分值比例
	
	public QuestionOption() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuestionOption(int id, String question, String option, String letter, int ratio) {
		super();
		this.id = id;
		this.question = question;
		this.option = option;
		this.letter = letter;
		this.ratio = ratio;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}
	public int getRatio() {
		return ratio;
	}
	public void setRatio(int ratio) {
		this.ratio = ratio;
	}
	@Override
	public String toString() {
		return "QuestionOption [id=" + id + ", question=" + question + ", option=" + option + ", letter=" + letter
				+ ", ratio=" + ratio + "]";
	}
	
 
}
