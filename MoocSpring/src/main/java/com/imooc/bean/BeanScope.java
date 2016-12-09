package com.imooc.bean;

/**
 * Created by yun.li on 2016/12/9.
 */
public class BeanScope {

    public void say(){
        System.out.println("Bean scope say:" + this.hashCode());
    }

}
