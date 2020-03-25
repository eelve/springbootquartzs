package com.eelve.springbootquartz.config;

import com.eelve.springbootquartz.job.JobTwo;
import com.eelve.springbootquartz.service.QuartzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;


/**
 * @ClassName ScheduledConfiguaration
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/1 10:40
 * @Version 1.0
 **/
@Component
@Slf4j
public class ScheduledConfiguaration implements CommandLineRunner {

    @Autowired
    QuartzService quartzService;

    @Override
    public void run(String... args) throws Exception {
        HashMap<String,Object> map = new HashMap<>();

        map.put("name",3);
        quartzService.deleteJob("job3", "JobTwo");
        quartzService.addJob(JobTwo.class, "job3", "JobTwo", "15 * * * * ?", map);

        map.put("name",13);
        quartzService.deleteJob("job4", "JobTwo");
        quartzService.addJob(JobTwo.class, "job4", "JobTwo", "15 * * * * ?", map);
        map.put("name",14);
        quartzService.deleteJob("job5", "JobTwo");
        quartzService.addJob(JobTwo.class, "job5", "JobTwo", "15 * * * * ?", map);

    }
}
