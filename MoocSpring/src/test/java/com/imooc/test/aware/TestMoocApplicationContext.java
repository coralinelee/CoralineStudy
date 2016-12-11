package com.imooc.test.aware;

import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by yun.li on 2016/12/9.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestMoocApplicationContext extends UnitTestBase{

    public TestMoocApplicationContext(){
        super("classpath:spring-aware.xml");
    }

//    @Test
//    public void testMoocApplicationContext(){
//        System.out.println("moocApplicationContext" + super.getBean("moocApplicationContext").hashCode());
//    }

    @Test
    public void testMoocBeanName(){
        System.out.println("moocBeanName" + super.getBean("moocBeanName").hashCode());
    }
}
