package com.librarystore.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.librarystore.beans.User;
import com.librarystore.dao.IUserDao;

public class UserDaoImpl implements IUserDao {

	 static List<User> userList=new ArrayList<User>();
	 static
	 {
		 userList.add(new User("rutuja","admin","ADMIN"));
		 userList.add(new User("rutu","user","USER"));
	 }
	@Override
	public List<User> getAllUserDetails() {
		// TODO Auto-generated method stub
return userList;
	}

}
