package cn.dan.spring.demo.operating;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;


public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter{

    public Object postProcessBeforeInstantiation(Class beanClass,String beanName) throws BeansException{
        if("car".equals(beanName)){
            System.out.println("InstantiationAwareBeanPostProcessor.postProcess BeforeInstantiation");
            
        }
        return null;
    }
    
    public boolean postProcessAfterInstantiation(Object bean,String beanName) throws BeansException{
        if("car".equals(beanName)){
            System.out.println("InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation");
            
        }
        return true;
    }
    
    public PropertyValues postProcessPropertyValues(PropertyValues pvs,PropertyDescriptor[] pds,Object bean,String beanName) throws BeansException{
        if("car".equals(beanName)){
            System.out.println("InstantiationAwareBeanPostProcessor.postProcessPropertyValues");
            
        }
        return pvs;
    }
}
