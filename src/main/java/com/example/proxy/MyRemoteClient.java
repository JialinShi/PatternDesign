package com.example.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go(){
        try{
            MyRemote service =(MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
