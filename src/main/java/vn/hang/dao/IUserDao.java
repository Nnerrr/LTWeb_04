package vn.hang.dao;

import java.util.List;

import vn.hang.models.UserModel;

public interface IUserDao {
	
	List<UserModel> findAll();
	
	UserModel findOne(int id);
	
	UserModel findByUsername(String username);
	
	void insert(UserModel user);
	

}