package com.jhc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jhc.model.UserModel;
@Repository
public interface UserDao {
	public boolean registUser(UserModel userModel);
	public List<UserModel> getAllUser();
	public UserModel getUserById(Integer userid);
	public boolean modifyUser(UserModel userModel);
}
