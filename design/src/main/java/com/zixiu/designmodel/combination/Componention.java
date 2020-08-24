package com.zixiu.designmodel.combination;

import java.util.List;

/**
 * Author: Snail
 * Time:  2020/8/24 4:19 PM
 * FileName:  Component
 * 简介：组合模式：将对象组合成树形结构，以表示"整体-部分"的层次结构，使得用户对单个对象和组合对象的使用是一致的
 * <p>
 * 抽象构件角色：定义组合对象的共有方法和属性，可以定义默认的属性和方法
 */
public abstract class Componention {

    /**
     * 节点名字：如文件/文件夹的名字
     */
    protected String mName;

    public Componention(String name) {
        this.mName = name;
    }

    /**
     * 业务逻辑
     */
    public abstract void doSomething();

    /**
     * 添加节点：文件夹/文件
     */
    public abstract void addChild(Componention componention);

    /**
     * 删除节点：文件夹/文件
     */
    public abstract void removeChild(Componention componention);

    /**
     * 获取所有的节点
     */
    public abstract List<Componention> getChildren();
}
