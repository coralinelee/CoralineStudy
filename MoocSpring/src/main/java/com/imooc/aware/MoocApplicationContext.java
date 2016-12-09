package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by yun.li on 2016/12/9.
 */
public class MoocApplicationContext implements ApplicationContextAware{

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //this.applicationContext = applicationContext;
        System.out.println("moocApplicationContext" + applicationContext.getBean("moocApplicationContext").hashCode());
    }


}
