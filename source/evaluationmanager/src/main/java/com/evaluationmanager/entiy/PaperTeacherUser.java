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
@Table(name="paper_teacher_user")
public class PaperTeacherUser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; // 编号
	@Foreignkey(foreignClass=PaperTeacher.class,column="id")
	private String paper; // 试卷
	@Foreignkey(foreignClass=User.class,column="account")
	private String user; // 被测教师
	
	private String isUse; // 是否可用

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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getIsUse() {
		return isUse;
	}

	public void setIsUse(String isUse) {
		this.isUse = isUse;
	}
		
}