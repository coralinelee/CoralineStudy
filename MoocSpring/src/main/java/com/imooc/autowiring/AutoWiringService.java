package com.imooc.autowiring;

/**
 * Created by yun.li on 2016/12/11.
 */
public class AutoWiringService {

    private AutoWiringDAO autoWiringDAO;

    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        this.autoWiringDAO = autoWiringDAO;
    }

    public void say(String word){
        System.out.println("AutoWiringService:" + word);
    }
}
