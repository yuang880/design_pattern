package com.zhangxd.demo.design.util;

import java.util.*;

/**
 * @author zhangxd
 * @version 1.0 2023/3/5
 */
public class TopicRandomUtil {


    public static Topic random(Map<String, String> option, String key){
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<>(keySet);
        Collections.shuffle(keyList);
        Map<String, String> optionNew = new HashMap<>();
        int idx = 0;
        String newKey = "";
        for (String next : keySet) {
            String randomKey = keyList.get(idx++);
            if(key.equals(next)){
                newKey = randomKey;
            }
            optionNew.put(randomKey, option.get(next));
        }
        return new Topic(optionNew, newKey);
    }

}
