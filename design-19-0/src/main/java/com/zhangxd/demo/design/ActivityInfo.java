package com.zhangxd.demo.design;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
@Setter
@Getter
public class ActivityInfo {

    private String activityId;
    private String activityName;
    private Enum<Status> status;
    private Date beginTime;
    private Date endTime;

    public ActivityInfo(String activityId, Enum<Status> status) {
        this.activityId = activityId;
        this.activityName = "早起学习打卡领奖活动";
        this.status = status;
        this.beginTime = new Date();
        this.endTime = new Date();
    }

}
