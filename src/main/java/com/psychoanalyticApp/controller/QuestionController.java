package com.psychoanalyticApp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.psychoanalyticApp.models.login.Question;
import com.psychoanalyticApp.service.QuestionService;


@Controller
public class QuestionController {
	
	@Autowired
	QuestionService questionService;
	
	
	@RequestMapping(value="/addQuestions", method = RequestMethod.GET)
	public String addQuestions(Map<String, Object> map){
		 map.put("question", new Question());
		return "addQuestion";
	}
	
	@RequestMapping(value = "/addQuestions", method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute("question") Question question, BindingResult result) {
        if (result.hasErrors()) {
            return "question";
        }
        
        questionService.addQuestion(question);
        
        return "redirect:/addQuestions";
    }

}
