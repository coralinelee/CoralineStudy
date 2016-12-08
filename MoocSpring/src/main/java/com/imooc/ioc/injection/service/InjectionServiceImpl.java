package com.imooc.ioc.injection.service;

import com.imooc.ioc.injection.dao.InjectionDAO;

/**
 * Created by yun.li on 2016/12/8.
 */
public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;

    public void save(String arg) {
        System.out.println("Service接收参数:" + arg);
        arg = arg + ":" + arg.hashCode();
        injectionDAO.save(arg);
    }

    //构造注入 两个point
    //有这个方法的时候，xml中需要引入construct-arg参数
    //这个方法，injectionDAO如果改为其他变量名，会报错，但是setter方法不会有这样的现象
    public InjectionServiceImpl(InjectionDAO injectionDAO){
        this.injectionDAO = injectionDAO;

    }

    //设值注入
    public void setInjectionDAO(InjectionDAO injectionDAO1) {
        this.injectionDAO = injectionDAO1;
    }
}
