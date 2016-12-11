package com.imooc.test.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * Created by yun.li on 2016/12/6.
 */
//@RunWith(BlockJUnit4ClassRunner.class)  //使用junit4进行测试

public class UnitTestBase {

    private ClassPathXmlApplicationContext context;

    private String springXmlpath;

    private UnitTestBase(){}

    public UnitTestBase(String springXmlpath){
        this.springXmlpath = springXmlpath;
    }

    @Before
    public void before(){
        if(StringUtils.isEmpty(springXmlpath)){
            springXmlpath = "classpath*:spring-*.xml";
        }
        try{
            //spring容器
            context = new ClassPathXmlApplicationContext(springXmlpath.split("[,\\s]+"));
            //容器启动 解析配置信息,装载到spring容器
            context.start();
        }
        catch(BeansException ex){
            ex.printStackTrace();
        }
    }

    @After
    public void after(){
        context.destroy();
    }

    @SuppressWarnings("unchecked")
    protected <T extends Object> T getBean(String beanID){
        return (T)context.getBean(beanID);
    }

    protected <T extends Object> T getBean(Class<T> classType){
        return context.getBean(classType);
    }

}
