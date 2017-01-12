package cn.dan.spring.demo.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import cn.dan.spring.demo.model.Car;
import cn.dan.spring.demo.operating.MyBeanPostProcessor;
import cn.dan.spring.demo.operating.MyInstantiationAwareBeanPostProcessor;


public class BeanLifeCycle {
    
    private static void lifeCycleInBeanFactory(){
        Resource res=new ClassPathResource("beans.xml");
        BeanFactory bf=new XmlBeanFactory(res);
        
        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyBeanPostProcessor());
        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
        Car car1=(Car)bf.getBean("car");
        car1.introduce();
        car1.setColor("ºìÉ«");
        
        Car car2=(Car)bf.getBean("car");
        System.out.println("car1==car2:"+(car1==car2));
        ((XmlBeanFactory)bf).destroySingletons();
    }
    
    public static void main(String[] args) {
        lifeCycleInBeanFactory(); 
        //Dan dan=new Dan();
        Dan.sayHello();
    }
    
    public static class Dan{
        private String name;
        private String value;
        
        
        
        public String getName() {
            return name;
        }


        
        public void setName(String name) {
            this.name = name;
        }


        
        public String getValue() {
            return value;
        }


        
        public void setValue(String value) {
            this.value = value;
        }


        public static void  sayHello(){
            System.out.println("hello world");
        }
    }

}
