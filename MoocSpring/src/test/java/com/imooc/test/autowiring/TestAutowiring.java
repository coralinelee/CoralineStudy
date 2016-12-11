package com.imooc.test.autowiring;

import com.imooc.autowiring.AutoWiringService;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by yun.li on 2016/12/11.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutowiring extends UnitTestBase {

    public TestAutowiring(){
        super("classpath:spring-autowiring.xml");
    }

    @Test
    public void testSay(){
        AutoWiringService service = super.getBean("autoWiringService");
        service.say("test");
    }


}
