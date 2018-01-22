package com.dmsd.controller;

import com.dmsd.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ares on 2017/10/24.
 */
@Controller
public class UserController {

    //注入api
    @Autowired
    private UserService userService;


    @RequestMapping("/addStudent")
    @ResponseBody
    public void addStudent() {
       userService.addStudent();
    }



    @RequestMapping("/addStudent2")
    @ResponseBody
    public void addStudent2() {
        userService.addStudent2();
    }

}
