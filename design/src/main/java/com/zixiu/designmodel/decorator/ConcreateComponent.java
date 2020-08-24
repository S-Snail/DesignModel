package com.zixiu.designmodel.decorator;

import android.util.Log;

/**
 * Author: Snail
 * Time:  2020/8/21 4:49 PM
 * FileName:  ConcreateComponent
 * 简介：被装饰者的实现
 */
public class ConcreateComponent extends Component {
    @Override
    public void operate() {
        Log.d("装饰者模式", "被装饰者的实现");
    }
}
