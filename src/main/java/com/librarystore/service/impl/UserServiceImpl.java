package com.librarystore.service.impl;

import java.util.List;

import com.librarystore.beans.User;
import com.librarystore.dao.IUserDao;
import com.librarystore.dao.impl.UserDaoImpl;
import com.librarystore.service.IUserService;

public class UserServiceImpl implements IUserService {
IUserDao userDao=new UserDaoImpl();
	@Override
	public List<User> showUserDetails() {
		// TODO Auto-generated method stub
		return userDao.getAllUserDetails();
	}

}
