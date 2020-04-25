/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.ld.studio.usermanager.utiles;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author zhangwb15932
 * @version result: Result, v0.1 2020年04月25日 20:34 zhang Exp $
 */
public class Result<T> implements Serializable {

    //是否成功
    private boolean sucess;

    //返回结果信息
    private String message;

    //对象实例
    private T responseData;

    //构造哈数
    public Result() {
    }

    public Result(boolean sucess, String message, T responseData) {
        this.sucess = sucess;
        this.message = message;
        this.responseData = responseData;
    }

    /**
     * Getter method for property <tt>sucess</tt>.
     *
     * @return property value of sucess
     */
    public boolean isSucess() {
        return sucess;
    }

    /**
     * Setter method for property <tt>sucess</tt>.
     *
     * @param sucess value to be assigned to property sucess
     */
    public void setSucess(boolean sucess) {
        this.sucess = sucess;
    }

    /**
     * Getter method for property <tt>message</tt>.
     *
     * @return property value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method for property <tt>message</tt>.
     *
     * @param message value to be assigned to property message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter method for property <tt>responseData</tt>.
     *
     * @return property value of responseData
     */
    public T getResponseData() {
        return responseData;
    }

    /**
     * Setter method for property <tt>responseData</tt>.
     *
     * @param responseData value to be assigned to property responseData
     */
    public void setResponseData(T responseData) {
        this.responseData = responseData;
    }

    @Override public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}