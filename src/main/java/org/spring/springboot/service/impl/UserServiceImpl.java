package org.spring.springboot.service.impl;

import org.spring.springboot.dao.UserDao;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @SuppressWarnings("unchecked")
    @Autowired
    UserDao userDao;


    @Override
    public List<User> getUser(String userName) {
        return userDao.getUser(userName);
    }
}
