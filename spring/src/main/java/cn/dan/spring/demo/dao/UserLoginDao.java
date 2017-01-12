package cn.dan.spring.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class UserLoginDao {
    
    public void userlogin(){
        System.out.println("call user login");
    }
    
    public void isExist(){
        System.out.println("call user is exist");
    }

}
