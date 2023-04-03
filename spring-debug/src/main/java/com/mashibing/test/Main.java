package com.mashibing.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("testAop.xml");
        ProxyAOP bean = context.getBean(ProxyAOP.class);
        bean.m();
    }
}
