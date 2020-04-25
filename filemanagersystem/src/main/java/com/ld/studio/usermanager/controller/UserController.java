/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.ld.studio.usermanager.controller;

import com.ld.studio.usermanager.service.UserService;
import com.ld.studio.usermanager.utiles.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author zhangwb15932
 * @version usercontroller: UserController, v0.1 2020年04月25日 20:22 zhang Exp $
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public Result login(String userName, String userPassws, HttpSession httpsession){

        Result result = new Result();


        return result;
    }
}