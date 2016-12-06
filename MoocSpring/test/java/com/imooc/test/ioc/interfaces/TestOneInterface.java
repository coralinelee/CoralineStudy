package test.java.com.imooc.test.ioc.interfaces;

import main.java.com.imooc.ioc.interfaces.OneInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.com.imooc.test.base.UnitTestBase;

/**
 * Created by yun.li on 2016/12/6.
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class  TestOneInterface extends UnitTestBase{
    public TestOneInterface(){
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testHello(){
        OneInterface oneInterface = super.getBean("oneInterface");
        System.out.println(oneInterface.hello("我的输入参数"));
    }
}
