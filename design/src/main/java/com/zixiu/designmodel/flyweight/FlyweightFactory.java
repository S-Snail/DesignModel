package com.zixiu.designmodel.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Snail
 * Time:  2020/8/21 4:29 PM
 * FileName:  FlyweightFactory
 * 简介：缓冲池
 */
public class FlyweightFactory {

    private static Map<String, Flyweight> flyweightPool = new HashMap<>();

    public Flyweight getFlyweight(String extrinsic) {
        if (flyweightPool.containsKey(extrinsic)) {
            return flyweightPool.get(extrinsic);
        } else {
            Flyweight flyweight = new ConcreateFlyweight(extrinsic);
            flyweightPool.put(extrinsic, flyweight);
            return flyweight;
        }
    }
}
