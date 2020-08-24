package com.zixiu.designmodel;

import android.os.Bundle;
import android.util.Log;

import com.zixiu.designmodel.adaptee.Adaptee;
import com.zixiu.designmodel.adaptee.Adapter;
import com.zixiu.designmodel.adaptee.ConcreateTarget;
import com.zixiu.designmodel.adaptee.ObjAdapter;
import com.zixiu.designmodel.adaptee.Target;
import com.zixiu.designmodel.bridge.Abstraction;
import com.zixiu.designmodel.bridge.ConcreateImplementor1;
import com.zixiu.designmodel.bridge.ConcreateImplementor2;
import com.zixiu.designmodel.bridge.Implementor;
import com.zixiu.designmodel.bridge.RefineAbstraction1;
import com.zixiu.designmodel.bridge.RefineAbstraction2;
import com.zixiu.designmodel.builder.Product;
import com.zixiu.designmodel.decorator.Component;
import com.zixiu.designmodel.decorator.ConcreateComponent;
import com.zixiu.designmodel.decorator.ConcreateDecorator1;
import com.zixiu.designmodel.decorator.ConcreateDecorator2;
import com.zixiu.designmodel.facade.Facade;
import com.zixiu.designmodel.facroty.abstract_factory.ConcreateFactory1;
import com.zixiu.designmodel.facroty.abstract_factory.ConcreateFactory2;
import com.zixiu.designmodel.facroty.factory_method.ConcreateFactory;
import com.zixiu.designmodel.facroty.factory_method.ConcreateProduct1;
import com.zixiu.designmodel.facroty.factory_method.ConcreateProduct2;
import com.zixiu.designmodel.proxy.Subject;
import com.zixiu.designmodel.proxy.invoke_proxy.SubjecIH;
import com.zixiu.designmodel.proxy.static_proxy.RealSubject;
import com.zixiu.designmodel.proxy.static_proxy.SubjectProxy;
import com.zixiu.designmodel.singleton.ContainerModelSingleTon;
import com.zixiu.designmodel.singleton.DCLSingleTon;
import com.zixiu.designmodel.singleton.EnumSingleTon;
import com.zixiu.designmodel.singleton.HangrySingleTon;
import com.zixiu.designmodel.singleton.SingleTon;
import com.zixiu.designmodel.singleton.StaticInnerClassSingleTon;

import java.lang.reflect.Proxy;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bridge();
    }

    /**
     * 桥接模式
     */
    public void bridge() {
        Implementor i1 = new ConcreateImplementor1();//加糖
        Implementor i2 = new ConcreateImplementor2();//不加糖

        Abstraction b1 = new RefineAbstraction1(i1);//大杯 - 加糖
        Abstraction b2 = new RefineAbstraction1(i2);//大杯 - 不加糖

        Abstraction s1 = new RefineAbstraction2(i1);//小杯 - 加糖
        Abstraction s2 = new RefineAbstraction2(i2);//小杯 - 不加糖
        b1.operator();
        b2.operator();
        s1.operator();
        s2.operator();
    }

    /**
     * 门面模式
     */
    public void facade() {
        Facade facade = new Facade();
        facade.doSomethingA();
        facade.doSomethingB();
        facade.doSomethingC();
    }

    /**
     * 装饰者模式
     */
    private void decorator() {
        Component component = new ConcreateDecorator1(new ConcreateDecorator2(new ConcreateComponent()));
        component.operate();
    }

    /**
     * 适配器模式
     */
    private void adapter() {
        String tag = "适配器模式";
        //类适配器
        Target t1 = new ConcreateTarget();
        Target t2 = new Adapter();
        t1.volt5();
        t2.volt5();
        //对象适配器
        Target objt1 = new ObjAdapter(new Adaptee());
        objt1.volt5();
    }

    /**
     * 代理模式
     */
    private void proxy() {
        String tag = "代理模式——静态代理";
        SubjectProxy subjectProxy = new SubjectProxy(new RealSubject());
        subjectProxy.request();

        String tagIH = "代理模式-动态代理";
        Subject proxy = (Subject) Proxy.newProxyInstance(
                Subject.class.getClassLoader(),
                new Class[]{Subject.class},
                new SubjecIH(new RealSubject()));
        proxy.request();
    }

    /**
     * 构造者模式
     */
    private void builder() {
        String tag = "构造者模式";
        Product product = new Product.Builder()
                .addPartA("a")
                .addPartB("b")
                .addPartC("c")
                .build();
        Dlog(tag, product.getContent());
    }

    /**
     * 抽象工厂模式
     */
    private void abstractFactory() {
        String tag = "抽象工厂模式";
        ConcreateFactory1 concreateFactory1 = new ConcreateFactory1();
        ConcreateFactory2 concreateFactory2 = new ConcreateFactory2();
        Dlog(tag, concreateFactory1.createProductA().productname());
        Dlog(tag, concreateFactory1.createProductB().productname());
        Dlog(tag, concreateFactory2.createProductA().productname());
        Dlog(tag, concreateFactory2.createProductB().productname());
    }

    /**
     * 工厂方法模式
     */
    private void factoryMethod() {
        String tag = "工厂方法模式";
        ConcreateFactory concreateFactory = new ConcreateFactory();
        ConcreateProduct1 products1 = concreateFactory.createProducts(ConcreateProduct1.class);
        ConcreateProduct2 products2 = concreateFactory.createProducts(ConcreateProduct2.class);
        Dlog(tag, products1.productname());
        Dlog(tag, products2.productname());
    }

    /**
     * 单例模式
     */
    private void singleTonModule() {
        String tag1 = "单例模式_懒汉式";
        SingleTon singleTon1 = SingleTon.getSingleTon();
        SingleTon singleTon2 = SingleTon.getSingleTon();
        Dlog(tag1, "singTon1 hashCode = " + singleTon1.hashCode());
        Dlog(tag1, "singTon2 hashCode = " + singleTon2.hashCode());

        String tag2 = "单例模式_双检锁模式";
        DCLSingleTon dclSingleTon1 = DCLSingleTon.getDCLSingleTon();
        DCLSingleTon dclSingleTon2 = DCLSingleTon.getDCLSingleTon();
        Dlog(tag2, "dclSingleTon1 hashCode = " + dclSingleTon1.hashCode());
        Dlog(tag2, "dclSingleTon2 hashCode = " + dclSingleTon2.hashCode());

        String tag3 = "单例模式_饿汉式";
        HangrySingleTon hangrySingleTon1 = HangrySingleTon.getHangrySingleTon();
        HangrySingleTon hangrySingleTon2 = HangrySingleTon.getHangrySingleTon();
        Dlog(tag3, "hangrySingleTon1 hashCode = " + hangrySingleTon1.hashCode());
        Dlog(tag3, "hangrySingleTon2 hashCode = " + hangrySingleTon2.hashCode());

        String tag4 = "单例模式_静态内部类的方式";
        StaticInnerClassSingleTon staticInnerClassSingleTon1 = StaticInnerClassSingleTon.getStaticInnerClassSingleTon();
        StaticInnerClassSingleTon staticInnerClassSingleTon2 = StaticInnerClassSingleTon.getStaticInnerClassSingleTon();
        Dlog(tag4, "staticInnerClassSingleTon1 hashCode = " + staticInnerClassSingleTon1.hashCode());
        Dlog(tag4, "staticInnerClassSingleTon2 hashCode = " + staticInnerClassSingleTon2.hashCode());

        String tag5 = "单例模式_枚举";
        EnumSingleTon enumSingleTon1 = EnumSingleTon.EnumSingleTon;
        EnumSingleTon enumSingleTon2 = EnumSingleTon.EnumSingleTon;
        Dlog(tag5, "enumSingleTon1 hashCode = " + enumSingleTon1.hashCode());
        Dlog(tag5, "enumSingleTon2 hashCode = " + enumSingleTon2.hashCode());

        String tag6 = "容器实现单例模式";
        ContainerModelSingleTon containermodelSingleTon1 = new ContainerModelSingleTon();
        ContainerModelSingleTon.SingleTonManager.register("key1", containermodelSingleTon1);
        ContainerModelSingleTon containerModelSingleTon2 = new ContainerModelSingleTon();
        ContainerModelSingleTon.SingleTonManager.register("key2", containerModelSingleTon2);
        ContainerModelSingleTon key1SingleTon = ContainerModelSingleTon.SingleTonManager.getSingleTon("key1");
        ContainerModelSingleTon key2SingleTon = ContainerModelSingleTon.SingleTonManager.getSingleTon("key2");
        Dlog(tag6, "key1SingleTon hashCode = " + key1SingleTon.hashCode());
        Dlog(tag6, "key2SingleTOn hashCode = " + key2SingleTon.hashCode());
    }

    private void Dlog(String tag, String message) {
        Log.d(tag, message);
    }
}