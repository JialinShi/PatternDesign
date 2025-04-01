package com.example.protectionProxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {
    /** 创建一个本人代理，防止自己给自己评分*/
    public static Person getOwnerProxy(Person person){
        return (Person) Proxy.newProxyInstance(
            person.getClass().getClassLoader(), //类加载器
            person.getClass().getInterfaces(), // 代理的接口
            new OwnerInvocationHandler(person) // 调用处理器
        );
    }
    /** 创建一个别人代理，防止修改别人的兴趣*/
    public static Person getNonOwnerProxy(Person person){
        return (Person) Proxy.newProxyInstance(
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new NonOwnerInvocationHandler(person)
        );
    }


}
