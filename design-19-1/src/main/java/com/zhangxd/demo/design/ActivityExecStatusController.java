package com.zhangxd.demo.design;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
public class ActivityExecStatusController {

    /**
     * 活动状态变更
     * 1. 编辑中 -> 提审、关闭
     * 2. 审核通过 -> 拒绝、关闭、活动中
     * 3. 审核拒绝 -> 撤审、关闭
     * 4. 活动中 -> 关闭
     * 5. 活动关闭 -> 开启
     * 6. 活动开启 -> 关闭
     *
     * @param activityId   活动ID
     * @param beforeStatus 变更前状态
     * @param afterStatus  变更后状态
     * @return 返回结果
     */
    public Result execStatus(String activityId, Enum<Status> beforeStatus, Enum<Status> afterStatus) {

        // 1. 编辑中 -> 提审、关闭
        if (Status.EDITING.equals(beforeStatus)) {
            if (Status.CHECK.equals(afterStatus) || Status.CLOSE.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return Result.success();
            } else {
                return Result.fail();
            }
        }

        // 2. 审核通过 -> 拒绝、关闭、活动中
        if (Status.PASS.equals(beforeStatus)) {
            if (Status.REFUSE.equals(afterStatus) || Status.DOING.equals(afterStatus) || Status.CLOSE.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return Result.success();
            } else {
                return Result.fail();
            }
        }

        // 3. 审核拒绝 -> 撤审、关闭
        if (Status.REFUSE.equals(beforeStatus)) {
            if (Status.EDITING.equals(afterStatus) || Status.CLOSE.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return Result.success();
            } else {
                return Result.fail();
            }
        }

        // 4. 活动中 -> 关闭
        if (Status.DOING.equals(beforeStatus)) {
            if (Status.CLOSE.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return Result.success();
            } else {
                return Result.fail();
            }
        }

        // 5. 活动关闭 -> 开启
        if (Status.CLOSE.equals(beforeStatus)) {
            if (Status.OPEN.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return Result.success();
            } else {
                return Result.fail();
            }
        }

        // 6. 活动开启 -> 关闭
        if (Status.OPEN.equals(beforeStatus)) {
            if (Status.CLOSE.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return Result.success();
            } else {
                return Result.fail();
            }
        }

        return Result.fail("非可处理的活动状态变更");

    }
}
