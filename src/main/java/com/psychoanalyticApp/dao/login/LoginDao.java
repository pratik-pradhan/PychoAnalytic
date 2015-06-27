package com.psychoanalyticApp.dao.login;

import com.psychoanalyticApp.models.login.Users;



public interface LoginDao {
	Users findByUserName(String username);
}
