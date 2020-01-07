package com.eelve.springbootquartz.config;

import com.eelve.springbootquartz.job.Job;
import com.eelve.springbootquartz.service.QuartzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * @ClassName QuartzConfig
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/2 16:53
 * @Version 1.0
 **/
@Configuration
public class ScheduledQuartzConfig {

    @Autowired
    QuartzService quartzService;

    @Bean
    public void job() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", 1);
        quartzService.deleteJob("job", "test");
        quartzService.addJob(Job.class, "job", "test", "0 * * * * ?", map);
    }

    @Bean
    public void job2() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", 2);
        quartzService.deleteJob("job2", "test");
        quartzService.addJob(Job.class, "job2", "test", "10 * * * * ?", map);
    }

    @Bean
    public void job3() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", 3);
        quartzService.deleteJob("job3", "test2");
        quartzService.addJob(Job.class, "job3", "test2", "15 * * * * ?", map);
    }

    @Bean
    public void job4() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", 13);
        quartzService.deleteJob("job4", "test2");
        quartzService.addJob(Job.class, "job4", "test2", "15 * * * * ?", map);
    }

    @Bean
    public void job5() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", 14);
        quartzService.deleteJob("job5", "test2");
        quartzService.addJob(Job.class, "job5", "test2", "15 * * * * ?", map);
    }
}
