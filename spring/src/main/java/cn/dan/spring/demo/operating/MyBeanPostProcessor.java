package cn.dan.spring.demo.operating;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import cn.dan.spring.demo.model.Car;


public class MyBeanPostProcessor implements BeanPostProcessor{

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if("car".equals(beanName)){
            Car car=(Car)bean;
            if(car.getMaxSpeed()>=200){
                System.out.println("调用BeanPostProcessor.postProcessAfterInitialization(),将maxSpeed调整为200。");
                car.setMaxSpeed(200);
            }
        }
        return bean;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("car".equals(beanName)){
            Car car=(Car)bean;
            if(car.getColor()==null){
                System.out.println("调用BeanPostProcessor.BeforeInitialization(),color为空，设置为默认黑色。");
                car.setColor("黑色");
            }
        }
        return bean;
    }

}
