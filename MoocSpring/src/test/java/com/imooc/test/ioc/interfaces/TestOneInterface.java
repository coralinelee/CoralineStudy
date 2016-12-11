package com.imooc.test.ioc.interfaces;

import com.imooc.ioc.interfaces.OneInterface;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by yun.li on 2016/12/6.
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class  TestOneInterface extends UnitTestBase {

    public TestOneInterface(){
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testHello(){
        OneInterface oneInterface = super.getBean("oneInterface");
        System.out.println(oneInterface.hello("我的输入参数"));
    }
}
