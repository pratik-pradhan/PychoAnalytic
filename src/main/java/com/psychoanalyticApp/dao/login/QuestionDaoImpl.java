package com.psychoanalyticApp.dao.login;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.psychoanalyticApp.models.login.Question;

@Repository("questionDao")
public class QuestionDaoImpl implements QuestionDao {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public String addQuestion(Question question){
		
		Session session = sessionFactory.openSession();
		try{
			session.beginTransaction();
		      System.out.println(session.save(question));
		    session.getTransaction().commit();
		    return "success";
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Exception ");
			return "failure";
		}finally{
			if(session.isOpen()){
				session.close();
			}
		}	
		
	}
}

