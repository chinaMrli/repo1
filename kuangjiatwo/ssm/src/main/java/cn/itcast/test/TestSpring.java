package cn.itcast.test;

import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    @Test
    public  void  test(){
        ApplicationContext ac= new ClassPathXmlApplicationContext( "classpath:applicationContext.xml" ) ;
        //获取对象
        AccountService as = (AccountService) ac.getBean(  "accountService");
        as.findAll();



    }
}
