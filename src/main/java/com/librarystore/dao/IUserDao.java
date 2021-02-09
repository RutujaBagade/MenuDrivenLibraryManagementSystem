package com.librarystore.dao;

import java.util.List;

import com.librarystore.beans.User;

public interface IUserDao {
    public List<User> getAllUserDetails();
}
