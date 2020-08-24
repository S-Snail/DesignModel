package com.zixiu.designmodel.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Snail
 * Time:  2020/8/20 11:37 AM
 * FileName:  ContainerModeSingleTon
 * 简介：
 */
public class ContainerModelSingleTon {
    /**
     * 通过容器实例化,选择合适时间动态注入（如初始化时），降低耦合，提高易用性
     */

    public static class SingleTonManager {

        private static Map<String, ContainerModelSingleTon> singleTonContainer = new HashMap<>();

        private SingleTonManager() {

        }

        public static void register(String key, ContainerModelSingleTon value) {
            if (!singleTonContainer.containsKey(key)) {
                singleTonContainer.put(key, value);
            }
        }

        public static void unRegister(String key) {
            if (singleTonContainer.containsKey(key)) {
                singleTonContainer.remove(key);
            }
        }

        public static ContainerModelSingleTon getSingleTon(String key) {
            return singleTonContainer.get(key);
        }
    }
}
