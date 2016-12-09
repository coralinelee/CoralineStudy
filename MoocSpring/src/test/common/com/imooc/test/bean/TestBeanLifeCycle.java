package common.com.imooc.test.bean;

import common.com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by yun.li on 2016/12/9.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifeCycle extends UnitTestBase{

    public TestBeanLifeCycle(){
        super("classpath*:spring-lifecycle.xml");
    }

    @Test
    public void test(){
        super.getBean("beanLifeCycle");
    }
}
