package com.eelve.springbootquartz.config;

import com.eelve.springbootquartz.job.JobTwo;
import com.eelve.springbootquartz.service.QuartzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;

/**
 * @ClassName QuartzConfig
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/2 16:53
 * @Version 1.0
 **/
//@Configuration
public class ScheduledQuartzConfig {

    @Autowired
    QuartzService quartzService;

    @Bean
    public void job3() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", 3);
        quartzService.deleteJob("job3", "JobTwo");
        quartzService.addJob(JobTwo.class, "job3", "JobTwo", "15 * * * * ?", map);
    }

    @Bean
    public void job4() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", 13);
        quartzService.deleteJob("job4", "JobTwo");
        quartzService.addJob(JobTwo.class, "job4", "JobTwo", "15 * * * * ?", map);
    }

    @Bean
    public void job5() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", 14);
        quartzService.deleteJob("job5", "JobTwo");
        quartzService.addJob(JobTwo.class, "job5", "JobTwo", "15 * * * * ?", map);
    }
}
