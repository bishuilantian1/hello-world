package cn.dan.spring.demo.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Car implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean{

    private String brand;
    private String color;
    private int maxSpeed;
    
    private BeanFactory beanFactory;
    private String beanName;
    
    
    
    public Car() {
        System.out.println("����car()���캯��");
    }


    public String getBrand() {
        System.out.println("����car��getBrand��������");
        return brand;
    }

    
    public void setBrand(String brand) {
        System.out.println("����car��setBrand��������");
        this.brand = brand;
    }

    
    public String getColor() {
        System.out.println("����car��getColor��������");
        return color;
    }

    
    public void setColor(String color) {
        System.out.println("����car��setColor��������");
        this.color = color;
    }

    
    public int getMaxSpeed() {
        System.out.println("����car��getMaxSpeed��������");
        return maxSpeed;
    }

    
    public void setMaxSpeed(int maxSpeed) {
        System.out.println("����car��setMaxSpeed��������");
        this.maxSpeed = maxSpeed;
    }
    
    public void introduce(){
        System.out.println("brand:"+brand+",color:"+color+",maxSpeed:"+maxSpeed);
    }
    
    
    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    
    public String getBeanName() {
        return beanName;
    }


    public void destroy() throws Exception {
       System.out.println("����DisposableBean.destory().");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("����InitializalizingBean.afterPropertiesSet().");
    }

    public void setBeanName(String beanName) {
       System.out.println("����BeanNameWare.setBeanName().");
       this.beanName=beanName;
        
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("����BeanFactoryAware.setBeanFactory().");
        this.beanFactory=beanFactory;
    }
    
    public void myInit(){
        System.out.println("����init-method��ָ����myInit(),��maxSpeed����Ϊ240");
        this.maxSpeed=240;
    }
    
    public void myDestroy(){
        System.out.println("����destory-methodָ����myDestroy().");
    }


    @Override
    public String toString() {
        return "Car [brand=" + brand + ", color=" + color + ", maxSpeed=" + maxSpeed + ", beanFactory=" + beanFactory + ", beanName=" + beanName + "]";
    }
    
    

}
