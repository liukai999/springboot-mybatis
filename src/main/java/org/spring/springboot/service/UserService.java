package org.spring.springboot.service;

import org.spring.springboot.domain.User;

import java.util.List;

public interface UserService {
    List <User> getUser(String userName);
}
