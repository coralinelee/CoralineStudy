package common.com.imooc.test.ioc.injection;

import com.imooc.ioc.injection.service.InjectionService;
import common.com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by yun.li on 2016/12/8.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase{

    public TestInjection() {
        super("classpath*:spring-injection.xml");
    }

    @Test
    public void testSetter(){
        InjectionService service = super.getBean("injectionService");
        service.save("这是要保存的数据");
    }

    @Test
    public void testConstructor(){
        InjectionService service = super.getBean("injectionService");
        service.save("这是要保存的数据");
    }
}
