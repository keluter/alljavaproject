/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.hundsun.base;

import com.hundsun.jrescloud.common.boot.CloudApplication;
import com.hundsun.jrescloud.common.boot.CloudBootstrap;

/**
 * @author zhangwb15932
 * @version basestart: BaseStarter, v0.1 2020年04月17日 16:14 zhang Exp $
 */
@CloudApplication
public class BaseStarter {

    public static void main(String[] args) {
        CloudBootstrap.run(BaseStarter.class, args);

    }
}