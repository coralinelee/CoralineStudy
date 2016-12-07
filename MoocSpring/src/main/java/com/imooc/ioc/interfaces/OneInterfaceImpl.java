package com.imooc.ioc.interfaces;

/**
 * Created by yun.li on 2016/12/6.
 */


public class OneInterfaceImpl implements OneInterface {

    public String hello(String word) {
        return "Word from interface" + word;
    }
}
