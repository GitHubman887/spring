package com.mashibing.test.test;


import com.mashibing.test.factorybean.MyFactoryBean;
import com.mashibing.test.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test-xuhai.xml");
        User user = (User) context.getBean("myFactoryBean");
        MyFactoryBean factoryBean = (MyFactoryBean) context.getBean("&myFactoryBean");
        System.out.println(user);
        System.out.println(factoryBean);

    }
}
