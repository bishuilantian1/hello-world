package cn.dan.spring.demo.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;





import cn.dan.spring.demo.model.Boss;
import cn.dan.spring.demo.model.BossListImpl;


public class BossBeanTest {
    
    public static void main(String[] args) {
        Resource rs=new ClassPathResource("bean_boss.xml");
        BeanFactory bf=new XmlBeanFactory(rs);
        Boss boss=(Boss)bf.getBean("boss");
        List list=boss.getFavorities();
        System.out.println(list);
        Map map=boss.getJobs();
        System.out.println(map);
        List list1=(List) bf.getBean("mylists");
        System.out.println(list1);
        BossListImpl bli=(BossListImpl) bf.getBean("bossList");
        System.out.println(bli.size());
    }

}
