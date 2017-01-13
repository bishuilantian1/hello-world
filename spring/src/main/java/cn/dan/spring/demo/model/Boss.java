package cn.dan.spring.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
