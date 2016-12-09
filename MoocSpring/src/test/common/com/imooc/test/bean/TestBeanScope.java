package common.com.imooc.test.bean;

import com.imooc.bean.BeanScope;
import common.com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by yun.li on 2016/12/9.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {


    public TestBeanScope(){
        super("classpath*:spring-beanscope.xml");
    }

    @Test
    public void testSay(){
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        beanScope = super.getBean("beanScope");
        beanScope.say();
    }

}
