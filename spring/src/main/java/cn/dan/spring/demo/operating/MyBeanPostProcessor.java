package cn.dan.spring.demo.operating;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import cn.dan.spring.demo.model.Car;


public class MyBeanPostProcessor implements BeanPostProcessor{

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if("car".equals(beanName)){
            Car car=(Car)bean;
            if(car.getMaxSpeed()>=200){
                System.out.println("����BeanPostProcessor.postProcessAfterInitialization(),��maxSpeed����Ϊ200��");
                car.setMaxSpeed(200);
            }
        }
        return bean;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("car".equals(beanName)){
            Car car=(Car)bean;
            if(car.getColor()==null){
                System.out.println("����BeanPostProcessor.BeforeInitialization(),colorΪ�գ�����ΪĬ�Ϻ�ɫ��");
                car.setColor("��ɫ");
            }
        }
        return bean;
    }

}
