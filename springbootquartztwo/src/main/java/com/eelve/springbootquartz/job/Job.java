package com.eelve.springbootquartz.job;

import com.eelve.springbootquartz.utils.QuartzCronDateUtils;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;
import java.util.concurrent.Future;

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
        log.info("------springbootquartztwojob执行"+jobDataMap.get("name").toString()+"###############"+jobExecutionContext.getTrigger());
        //任务开始时间
        long startTime = System.currentTimeMillis();
        try {
            //任务执行总时长
            long times = System.currentTimeMillis() - startTime;
            log.info("任务执行完毕，任务ID：" + jobExecutionContext.getJobDetail() + "  总共耗时：" + times + "毫秒");
        } catch (Exception e) {
            long times = System.currentTimeMillis() - startTime;
            log.error("任务执行失败，任务ID：" + jobExecutionContext.getJobDetail()+ "  总共耗时：" + times + "毫秒", e);

        } finally {

        }
    }
}
