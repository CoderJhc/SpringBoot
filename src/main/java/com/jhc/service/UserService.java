package com.jhc.service;

import java.util.List;

import com.jhc.model.UserModel;

public interface UserService {
	boolean registUser(UserModel userModel);
	List<UserModel> getAllUser();
}
