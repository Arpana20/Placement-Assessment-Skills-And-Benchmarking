package com.sample.loginController;

import java.util.List;

public class Questionaire {

	public int questionId;
	public int levelId;
	public int subLevelId;
	public String questionName;
	public String questionChoice1;
	public String questionChoice2;
	public String questionChoice3;
	public String questionChoice4;
	public int questionChoiceAns;
	public List questionTextAns;
	public String activeStatus;
	
	
	
	public Questionaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Questionaire(int questionId, int levelId, int subLevelId, String questionName, String questionChoice1,
			String questionChoice2, String questionChoice3, String questionChoice4, int questionChoiceOption,
			List questionTextAns, String activeStatus) {
		super();
		this.questionId = questionId;
		this.levelId = levelId;
		this.subLevelId = subLevelId;
		this.questionName = questionName;
		this.questionChoice1 = questionChoice1;
		this.questionChoice2 = questionChoice2;
		this.questionChoice3 = questionChoice3;
		this.questionChoice4 = questionChoice4;
		this.questionChoiceAns = questionChoiceAns;
		this.questionTextAns = questionTextAns;
		this.activeStatus = activeStatus;
	}
	public String getChoice() {
		String choice = questionChoice1 + questionChoice2 + questionChoice3 + questionChoice4;
		return choice;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getLevelId() {
		return levelId;
	}
	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}
	public int getSubLevelId() {
		return subLevelId;
	}
	public void setSubLevelId(int subLevelId) {
		this.subLevelId = subLevelId;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public String getQuestionChoice1() {
		return questionChoice1;
	}
	public void setQuestionChoice1(String questionChoice1) {
		this.questionChoice1 = questionChoice1;
	}
	public String getQuestionChoice2() {
		return questionChoice2;
	}
	public void setQuestionChoice2(String questionChoice2) {
		this.questionChoice2 = questionChoice2;
	}
	public String getQuestionChoice3() {
		return questionChoice3;
	}
	public void setQuestionChoice3(String questionChoice3) {
		this.questionChoice3 = questionChoice3;
	}
	public String getQuestionChoice4() {
		return questionChoice4;
	}
	public void setQuestionChoice4(String questionChoice4) {
		this.questionChoice4 = questionChoice4;
	}
	public int getQuestionChoiceAns() {
		return questionChoiceAns;
	}
	public void setQuestionChoiceAns(int questionChoiceAns) {
		this.questionChoiceAns = questionChoiceAns;
	}
	public List getQuestionTextAns() {
		return questionTextAns;
	}
	public void setQuestionTextAns(List questionTextAns) {
		this.questionTextAns = questionTextAns;
	}
	public String getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}
	@Override
	public String toString() {
		return "Questionaire [questionId=" + questionId + ", levelId=" + levelId + ", subLevelId=" + subLevelId
				+ ", questionName=" + questionName + ", questionChoice1=" + questionChoice1 + ", questionChoice2="
				+ questionChoice2 + ", questionChoice3=" + questionChoice3 + ", questionChoice4=" + questionChoice4
				+ ", questionChoiceAns=" + questionChoiceAns + ", questionTextAns=" + questionTextAns
				+ ", activeStatus=" + activeStatus + "]";
	}
	
}
