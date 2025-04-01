package com.example.protectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    private Person person;

    public NonOwnerInvocationHandler(Person person){
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try{
            if(method.getName().startsWith("get")){
                return method.invoke(person, args);
            }else if(method.getName().equals("setHobby")){
                throw new IllegalAccessException("You cannot modify others' hobbies."); //权限不对，不能修改自己的rating
            }else if(method.getName().startsWith("setRating")){
                return method.invoke(person, args);
            }
        }catch (InvocationTargetException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
