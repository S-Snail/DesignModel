package com.zixiu.designmodel.combination;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Snail
 * Time:  2020/8/24 5:27 PM
 * FileName:  Componsite
 * 简介：枝节点
 */
public class Componsite extends Componention {

    private List<Componention> componentions = new ArrayList<>();

    public Componsite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        Log.d("组合模式", "根节点 - 文件夹：" + this.mName);
    }

    @Override
    public void addChild(Componention componention) {
        this.componentions.add(componention);
    }

    @Override
    public void removeChild(Componention componention) {
        this.componentions.remove(componention);
    }

    @Override
    public List<Componention> getChildren() {
        return componentions;
    }
}
