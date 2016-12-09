package com.imooc.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by yun.li on 2016/12/9.
 */
public class BeanLifeCycle implements InitializingBean,DisposableBean{


    //既实现了这两个接口，又在xml里面对初始化和销毁定义了方法
    //会先执行接口里面的方法，再执行xml里面对应的方法
    public void destroy() throws Exception {
        System.out.println("bean destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("bean afterPropertiesSet");
    }

    public void start(){
        System.out.println("Bean start");
    }

    public void stop(){
        System.out.println("Bean stop");
    }

    public void defaultstart(){
        System.out.println("defaultstart");
    }

    public void defaultstop(){
        System.out.println("defaultstop");
    }

}
