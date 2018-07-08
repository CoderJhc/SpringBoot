package com.jhc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhc.dao.UserDao;
import com.jhc.model.UserModel;
import com.jhc.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public boolean registUser(UserModel userModel) {
		return userDao.registUser(userModel);
	}

	@Override
	public List<UserModel> getAllUser() {
		return userDao.getAllUser();
	}

}
