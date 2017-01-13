package cn.dan.spring.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import cn.dan.spring.demo.service.UserLoginService;


public class UserLoginServiceTest {
    
    @Autowired
    private UserLoginService userLoginService;

    @Deprecated
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("zhujie_beans.xml");
        System.out.println("hahha");
    }
}
