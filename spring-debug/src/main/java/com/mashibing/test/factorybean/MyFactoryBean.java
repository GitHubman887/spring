package com.mashibing.test.factorybean;

import com.mashibing.test.pojo.User;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setName("zhangsan");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
