package com.imooc.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Created by yun.li on 2016/12/9.
 */
public class MoocBeanName implements BeanNameAware{

    public void setBeanName(String name) {
        System.out.println("MoocBeanName:" + name);
    }
}
