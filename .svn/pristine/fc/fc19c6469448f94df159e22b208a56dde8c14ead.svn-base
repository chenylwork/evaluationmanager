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
@Table(name="paper_question")
public class PaperQuestion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; // 编号
	@Foreignkey(foreignClass=Paper.class,column="paperNo")
	private String paper; // 试卷
	@Foreignkey(foreignClass=Question.class,column="question")
	private String question; // 试题
	private int number;//题号
	private int score;//所占分值
	public PaperQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaperQuestion(int id, String paper, String question, int number, int score) {
		super();
		this.id = id;
		this.paper = paper;
		this.question = question;
		this.number = number;
		this.score = score;
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
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "PaperQuestion [id=" + id + ", paper=" + paper + ", question=" + question + ", number=" + number
				+ ", score=" + score + "]";
	}
	
}
