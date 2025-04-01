package com.example.stateMachine.gumballMachine;

import com.example.stateMachine.state.State;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {

    public int getCount() throws RemoteException;

    public State getState() throws RemoteException;
}
