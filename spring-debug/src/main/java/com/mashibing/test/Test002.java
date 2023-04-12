package com.mashibing.test;

import com.mashibing.test.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test002 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("t1.xml");
        Person person = context.getBean(Person.class);
        System.out.println(person);

//        Student student = (Student)context.getBean("student");
//        System.out.println(student);


    }
}
