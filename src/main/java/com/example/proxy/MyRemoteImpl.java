package com.example.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**UnicateRemoteObject 让java处理远程调用的细节，序列化，网络传输等*/
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    private static final long serialVersionUID = 1L;

    protected MyRemoteImpl() throws RemoteException {
        super(); // 调用父类 UnicastRemoteObject 构造方法，导出对象
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello there!";
    }

    /** Naming.rebind()把servicec绑定到rmiregistry，让客户端可以lookup获取stub，
     * rebind由远程对象本身执行，因为它需要把自己注册到rmiregistry*/
    public static void main(String[] args) {
        try{
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("rmi://127.0.0.1/RemoteHello", service); //绑定服务
            System.out.println("Remote service is running");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
