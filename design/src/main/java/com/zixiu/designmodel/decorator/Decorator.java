package com.zixiu.designmodel.decorator;

/**
 * Author: Snail
 * Time:  2020/8/21 4:59 PM
 * FileName:  Decorator
 * 简介：装饰者的抽象
 */
public abstract class Decorator extends Component {

    private Component mComponent;

    public Decorator(Component mComponent) {
        this.mComponent = mComponent;
    }

    @Override
    public void operate() {
        //委托给被装饰者执行的方法
        this.mComponent.operate();
    }
}
