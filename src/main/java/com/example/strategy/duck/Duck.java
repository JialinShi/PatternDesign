package com.example.strategy.duck;

import com.example.strategy.behavior.FlyBehavior;
import com.example.strategy.behavior.QuackBehavior;

/** 鸭子的基类
 * 将鸭子的飞行行为和叫声行为独立出来：
 * 定义 FlyBehavior 接口（比如 fly() 方法）。
 * 定义 QuackBehavior 接口（比如 quack() 方法）。
 * 每种行为都由具体类实现，比如 FlyWithWings、FlyNoWay，或者 Quack、MuteQuack。
 * Duck类中不直接实现这些行为，而是通过组合方式使用。
 *
 * 优点
 * 代码复用：飞行和叫声的逻辑可以被多个类共享。
 * 灵活性：可以在运行时动态更改鸭子的行为。
 * 符合开闭原则：添加新的行为或鸭子时，不需要修改已有代码。*/
public abstract class  Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public abstract void display();
}
