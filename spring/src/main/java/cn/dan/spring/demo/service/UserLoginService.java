package cn.dan.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dan.spring.demo.dao.UserLoginDao;

@Service
public class UserLoginService {
    
    @Autowired
    private UserLoginDao userLoginDao;
    
    public void sayHello(){
        System.out.println("call userloginService sayHello");
        userLoginDao.userlogin();
    }
    
}
