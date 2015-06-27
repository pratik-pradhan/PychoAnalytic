package com.psychoanalyticApp.models.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questions", catalog = "test")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "question_no", unique = true, nullable = false)
	private Integer questionNo;
	
	@Column(name = "category", nullable = false, length = 450)
	private String category;
	
	@Column(name = "question", nullable = false, length = 450)
	private String quest;
	
	@Column(name = "option1", nullable = false, length = 100)
	private String option1;
	
	@Column(name = "option2", nullable = false, length = 100)
	private String option2;
	
	@Column(name = "option3", nullable = false, length = 100)
	private String option3;
	
	@Column(name = "option4", nullable = false, length = 100)
	private String option4;

	public Integer getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(Integer questionNo) {
		this.questionNo = questionNo;
	}

	public String getQuest() {
		return quest;
	}

	public void setQuest(String quest) {
		this.quest = quest;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	

}
