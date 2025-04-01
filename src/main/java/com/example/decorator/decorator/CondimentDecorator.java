package com.example.decorator.decorator;

import com.example.decorator.beverage.Beverage;

/**
 * 为什么要继承 Beverage？
 在 Java 中，Soy 继承自 CondimentDecorator，而 CondimentDecorator 需要是 Beverage 的子类，这样才能保证装饰者链条可以无缝替代 Beverage。
 否则，Beverage drink2 = new Soy(drink2); 会报类型不兼容错误。

 *为什么必须实现 cost() 方法？
 因为 Beverage 是抽象类，子类必须提供 cost() 的实现，否则会导致编译错误。*/
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(Beverage b){
        this.beverage = b;
    }

    public abstract String getDescription();
    public void setSize(Size size){
        beverage.setSize(size);
    }

    public abstract double cost();

}
