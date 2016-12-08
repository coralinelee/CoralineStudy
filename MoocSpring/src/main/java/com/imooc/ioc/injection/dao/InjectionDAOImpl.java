package com.imooc.ioc.injection.dao;

/**
 * Created by yun.li on 2016/12/8.
 */
public class InjectionDAOImpl implements InjectionDAO {
    public void save(String arg) {
        //模拟数据库保存操作
        System.out.println("保存数据：" + arg);
    }
}
