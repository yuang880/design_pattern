package com.zhangxd.demo.design;

import com.zhangxd.demo.design.impl.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangxd
 * @version 1.0 2023/5/7
 */
public class StateHandler {

    private Map<Enum<Status>, State> stateMap = new ConcurrentHashMap<>();

    public StateHandler() {
        stateMap.put(Status.CHECK, new CheckState());
        stateMap.put(Status.CLOSE, new CloseState());
        stateMap.put(Status.DOING, new DoingState());
        stateMap.put(Status.EDITING, new EditingState());
        stateMap.put(Status.OPEN, new OpenState());
        stateMap.put(Status.PASS, new PassState());
        stateMap.put(Status.REFUSE, new RefuseState());
    }

    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).arraignment(activityId, currentStatus);
    }

    public Result checkPass(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).checkPass(activityId, currentStatus);
    }

    public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).checkRefuse(activityId, currentStatus);
    }

    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).checkRevoke(activityId, currentStatus);
    }

    public Result close(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).close(activityId, currentStatus);
    }

    public Result open(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).open(activityId, currentStatus);
    }

    public Result doing(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).doing(activityId, currentStatus);
    }

}
