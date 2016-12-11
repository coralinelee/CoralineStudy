package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by yun.li on 2016/12/9.
 */
public class MoocBeanName implements BeanNameAware,ApplicationContextAware{

    //@Override

    private String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("MoocBeanName : " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        System.out.println("setApplicationContext : " + applicationContext.getBean(this.beanName).hashCode());
    }
}
