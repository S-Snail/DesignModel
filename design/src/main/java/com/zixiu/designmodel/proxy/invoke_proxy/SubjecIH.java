package com.zixiu.designmodel.proxy.invoke_proxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Author: Snail
 * Time:  2020/8/20 5:22 PM
 * FileName:  SubjecIH
 * 简介：动态代理
 */
public class SubjecIH implements InvocationHandler {
    private final String tag = "代理模式";

    private Object mTarget;

    public SubjecIH(Object target) {
        this.mTarget = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        before();
        Object res = method.invoke(this.mTarget, objects);
        after();
        if ("request".equals(method.getName())) {
            Log.d(tag, "do something");
        }
        return res;
    }

    private void before() {
        Log.d(tag, "before()");
    }

    private void after() {
        Log.d(tag, "after()");
    }
}
