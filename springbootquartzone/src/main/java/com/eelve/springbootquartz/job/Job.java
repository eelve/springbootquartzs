package com.eelve.springbootquartz.job;

import com.eelve.springbootquartz.utils.QuartzCronDateUtils;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * @ClassName Job
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/7/31 15:52
 * @Version 1.0
 **/
@Slf4j
public class Job extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        // 获取参数
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        // 业务逻辑 ...
        log.info("------springbootquartzonejob执行"+jobDataMap.get("name").toString()+"###############"+jobExecutionContext.getTrigger());

    }
}
