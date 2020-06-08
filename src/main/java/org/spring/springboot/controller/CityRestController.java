package org.spring.springboot.controller;

import org.spring.springboot.domain.User;
import org.spring.springboot.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    private UserServiceImpl userserviceimpl;

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    @ResponseBody
    public List<User> findOneCity(String username) {
        return userserviceimpl.getUser(username);
    }

}
