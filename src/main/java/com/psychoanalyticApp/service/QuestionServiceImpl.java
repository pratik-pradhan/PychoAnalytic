package com.psychoanalyticApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psychoanalyticApp.dao.login.QuestionDao;
import com.psychoanalyticApp.models.login.Question;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	QuestionDao questionDao;
	
	
	public String addQuestion(Question question){
		Question quest = new Question();
		quest.setQuest(question.getQuest());
	    quest.setCategory(question.getCategory());
		quest.setOption1(question.getOption1());
		quest.setOption2(question.getOption2());
		quest.setOption3(question.getOption3());
		quest.setOption4(question.getOption4());
		
		return questionDao.addQuestion(quest);
				
	}

}
