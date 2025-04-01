package com.example.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**必须继承Remote, 告诉java这个接口支持远程方法调用
 * 所有方法必须生命throws RemoteException 因为网络调用可能失败*/
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;

}
