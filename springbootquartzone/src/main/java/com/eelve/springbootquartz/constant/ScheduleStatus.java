package com.eelve.springbootquartz.constant;

/**
 * @ClassName ScheduleStatus
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/7/31 17:13
 * @Version 1.0
 **/
public enum ScheduleStatus {
    /**
     * 正常
     */
    NORMAL(0),
    /**
     * 暂停
     */
    PAUSE(1);

    private int value;

    ScheduleStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
