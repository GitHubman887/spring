package com.mashibing.test;

import com.mashibing.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.StandardEnvironment;

public class TestCycle {

    public static void main(String[] args) {
//        new StandardEnvironment();
        ApplicationContext ac = new ClassPathXmlApplicationContext("test-xuhai.xml");
//        T bean = ac.getBean(T.class);
//        System.out.println(bean);
//        B bean1 = ac.getBean(B.class);
//        System.out.println(bean1);

    }
}
