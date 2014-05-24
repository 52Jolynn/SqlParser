package com.laudandjolynn.sqlparser.utils;

/**
 * Author: tdhuang
 * Date: 14-5-23 下午1:49
 * Copyright: www.laudandjolynn.com
 */
public class Assert {
    public static void assertNotNull(Object value) {
        if (value == null) {
            throw  new SqlParserException("can't not be null.");
        }
    }
}
