package com.example.stateMachine.gumballMachine;

import com.example.stateMachine.state.*;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private static final long serialVersionUID = 2L;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    private State state;
    int count  = 0;

    public GumballMachine(int count) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = count;
        state = soldOutState;
        if(count > 0){
            state = soldState;
        }
    }

    public static void main(String[] args) {

        if (args.length < 2)
            System.exit(1);
        try {
            int count = Integer.parseInt(args[1]);
            GumballMachineRemote gumballMachineRemote = new GumballMachine(count);
            Naming.rebind("rmi://127.0.0.1/" + args[0] + "/RemoteGumballMachine", gumballMachineRemote);
            System.out.println("Service is rebinding.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void setState(State state) {
        this.state = state;
    }


    public void releaseBall(){
        if(count > 0){
            System.out.println("Releasing a ball.");
            count--;
        }else{
            throw new UnsupportedOperationException("No gumball left.");
        }
    }
    public  void insertQuarter(){
        state.insertQuarter();
    };

    public  void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
    }

    @Override
    public int getCount(){
        return count;
    }
    @Override
    public State getState(){
        return state;
    }

    public State getSoldOutState(){
        return soldOutState;
    }
    public State getNoQuarterState(){
        return noQuarterState;
    }
    public State getHasQuarterState(){
        return hasQuarterState;
    }
    public State getSoldState(){
        return soldState;
    }


}
