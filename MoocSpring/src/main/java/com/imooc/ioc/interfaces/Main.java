package com.imooc.ioc.interfaces;

/**
 * Created by yun.li on 2016/12/6.
 */
public class Main {

    public static void main(String[] args) {
        OneInterface oif = new OneInterfaceImpl();
        System.out.println(oif.hello("world"));
    }
}
