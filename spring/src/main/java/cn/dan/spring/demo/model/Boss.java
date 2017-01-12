package cn.dan.spring.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * 
 * ClassName:cn.dan.spring.demo.model.Boss <br/>
 * 描述: TODO  <br/>
 * 日期:     2017年1月11日 <br/>
 * @author   muerdan
 * @version  
 * @since    1.0
 */
public class Boss {
    private List favorities;
    
    private Map jobs;

    
    public List getFavorities() {
        return favorities;
    }

    public void setFavorities(List favorities) {
        this.favorities = favorities;
    }

    
    public Map getJobs() {
        return jobs;
    }

    
    public void setJobs(Map jobs) {
        this.jobs = jobs;
    }

  
    
}
