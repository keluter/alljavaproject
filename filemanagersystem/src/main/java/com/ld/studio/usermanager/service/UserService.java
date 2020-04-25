/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.ld.studio.usermanager.service;

import com.ld.studio.usermanager.entity.User;

/**
 * @author zhangwb15932
 * @version userservice: UserService, v0.1 2020年04月25日 21:02 zhang Exp $
 */
public interface UserService {

    /**
     *
     */
    public void saveUser();

    /**
     *
     * @return
     */
    public User findUserByUserName();



}
