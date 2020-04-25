/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.ld.studio.usermanager.entity;

import java.io.Serializable;

/**
 * @author zhangwb15932
 * @version user: User, v0.1 2020年04月25日 21:09 zhang Exp $
 */
public class User implements Serializable {

    private Long userId;

    private String userName;

    private String userPassWord;

    private String userType;

    /**
     * Getter method for property <tt>userId</tt>.
     *
     * @return property value of userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Setter method for property <tt>userId</tt>.
     *
     * @param userId value to be assigned to property userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter method for property <tt>userName</tt>.
     *
     * @return property value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter method for property <tt>userName</tt>.
     *
     * @param userName value to be assigned to property userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter method for property <tt>userPassWord</tt>.
     *
     * @return property value of userPassWord
     */
    public String getUserPassWord() {
        return userPassWord;
    }

    /**
     * Setter method for property <tt>userPassWord</tt>.
     *
     * @param userPassWord value to be assigned to property userPassWord
     */
    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

    /**
     * Getter method for property <tt>userType</tt>.
     *
     * @return property value of userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Setter method for property <tt>userType</tt>.
     *
     * @param userType value to be assigned to property userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }
}