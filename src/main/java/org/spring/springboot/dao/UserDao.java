package org.spring.springboot.dao;

import org.spring.springboot.domain.User;

import java.util.List;

public interface UserDao {
    List<User> getUser(String userName);
}
