package com.librarystore.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.librarystore.beans.User;

import com.librarystore.dao.IUserDao;

class UserDaoImplTest {
	private IUserDao dao;
	@BeforeEach
	void setUp() throws Exception {
		dao=new UserDaoImpl();
	}
	
	@Test
	void testGetAllUserDetails() {
		List<User> users=dao.getAllUserDetails();
		assertNotNull(users);
		assertEquals(2,users.size());
		assertEquals("rutuja",users.get(0).getName());
		assertEquals("rutu",users.get(1).getName());
		assertEquals("admin",users.get(0).getPassword());
		assertEquals("user",users.get(1).getPassword());
	}

}
