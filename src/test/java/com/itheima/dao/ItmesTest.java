package com.itheima.dao;

import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItmesTest {
    @Test
    public void findById(){
        //获取spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中拿到所需dao的代理对象
        Dao dao = app.getBean(Dao.class);
        //调用方法
        Items byId = dao.findById(1);
        System.out.println(byId);
    }
}
