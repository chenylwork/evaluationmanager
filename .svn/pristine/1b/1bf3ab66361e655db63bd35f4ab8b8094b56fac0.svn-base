package com.evaluationmanager.entiy.view;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class EvaluationViewID implements Serializable{
	private static final long serialVersionUID = 3187197133748662150L;
	
	private String paper;//试卷
	private String user;//用户
	private String teacher;//教师
	
	
	public EvaluationViewID() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EvaluationViewID(String paper, String user, String teacher) {
		super();
		this.paper = paper;
		this.user = user;
		this.teacher = teacher;
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
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((paper == null) ? 0 : paper.hashCode());
		result = prime * result + ((teacher == null) ? 0 : teacher.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		EvaluationViewID other = (EvaluationViewID) obj;
		if (paper == null) {
			if (other.paper != null)
				return false;
		} else if (!paper.equals(other.paper))
			return false;
		if (teacher == null) {
			if (other.teacher != null)
				return false;
		} else if (!teacher.equals(other.teacher))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
}