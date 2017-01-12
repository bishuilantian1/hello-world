package cn.dan.spring.demo.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 
 * ClassName:cn.dan.spring.demo.Car <br/>
 * 描述: TODO  <br/>
 * 日期:     2017年1月10日 <br/>
 * @author   muerdan
 * @version  
 * @since    1.0
 */
public class Car implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean{

    private String brand;
    private String color;
    private int maxSpeed;
    
    private BeanFactory beanFactory;
    private String beanName;
    
    
    
    public Car() {
        System.out.println("调用car()构造函数。");
    }


    public String getBrand() {
        System.out.println("调用car的getBrand（）方法");
        return brand;
    }

    
    public void setBrand(String brand) {
        System.out.println("调用car的setBrand（）方法");
        this.brand = brand;
    }

    
    public String getColor() {
        System.out.println("调用car的getColor（）方法");
        return color;
    }

    
    public void setColor(String color) {
        System.out.println("调用car的setColor（）方法");
        this.color = color;
    }

    
    public int getMaxSpeed() {
        System.out.println("调用car的getMaxSpeed（）方法");
        return maxSpeed;
    }

    
    public void setMaxSpeed(int maxSpeed) {
        System.out.println("调用car的setMaxSpeed（）方法");
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
       System.out.println("调用DisposableBean.destory().");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializalizingBean.afterPropertiesSet().");
    }

    public void setBeanName(String beanName) {
       System.out.println("调用BeanNameWare.setBeanName().");
       this.beanName=beanName;
        
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware.setBeanFactory().");
        this.beanFactory=beanFactory;
    }
    
    public void myInit(){
        System.out.println("调动init-method所指定的myInit(),将maxSpeed设置为240");
        this.maxSpeed=240;
    }
    
    public void myDestroy(){
        System.out.println("调用destory-method指定的myDestroy().");
    }


    @Override
    public String toString() {
        return "Car [brand=" + brand + ", color=" + color + ", maxSpeed=" + maxSpeed + ", beanFactory=" + beanFactory + ", beanName=" + beanName + "]";
    }
    
    

}
