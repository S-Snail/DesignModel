package com.zixiu.designmodel.combination;

import android.util.Log;

import java.util.List;

/**
 * Author: Snail
 * Time:  2020/8/24 5:36 PM
 * FileName:  Leaf
 * 简介：叶节点
 */
public class Leaf extends Componention {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        Log.d("组合模式", "叶子节点 - 文件：" + this.mName);
    }

    @Override
    public void addChild(Componention componention) {
        throw new UnsupportedOperationException("叶子节点不支持该操作");
    }

    @Override
    public void removeChild(Componention componention) {
        throw new UnsupportedOperationException("叶子节点不支持该操作");
    }

    @Override
    public List<Componention> getChildren() {
        throw new UnsupportedOperationException("叶子节点不支持该操作");
    }
}
