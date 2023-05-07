package com.zhangxd.demo.design;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
public class ActivityService {

    private static Map<String, Enum<Status>> statusMap = new ConcurrentHashMap<>();

    public static void init(String activityId, Enum<Status> status) {
        // 模拟查询活动信息
        ActivityInfo activityInfo = new ActivityInfo(activityId, status);
        statusMap.put(activityId, status);
    }

    /**
     * 查询活动信息
     *
     * @param activityId 活动ID
     * @return 查询结果
     */
    public static ActivityInfo queryActivityInfo(String activityId) {
        // 模拟查询活动信息
        return new ActivityInfo(activityId, statusMap.get(activityId));
    }

    /**
     * 查询活动状态
     *
     * @param activityId 活动ID
     * @return 查询结果
     */
    public static Enum<Status> queryActivityStatus(String activityId) {
        return statusMap.get(activityId);
    }

    /**
     * 执行状态变更
     *
     * @param activityId   活动ID
     * @param beforeStatus 变更前状态
     * @param afterStatus  变更后状态 b
     */
    public static synchronized void execStatus(String activityId, Enum<Status> beforeStatus, Enum<Status> afterStatus) {
        if (!beforeStatus.equals(statusMap.get(activityId))) {
            return;
        }
        statusMap.put(activityId, afterStatus);
    }

}
