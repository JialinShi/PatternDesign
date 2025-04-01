package com.example.stateMachine.gumballMachine;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMachineMonitor { // client


    public GumballMachineMonitor(){

    }

    public static void main(String[] args)
        throws MalformedURLException, NotBoundException, RemoteException {
        if(args.length < 1) System.exit(1);
        String sub = "rmi://127.0.0.1/" + args[0] + "/RemoteGumballMachine";
        GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(sub);
        GumballMachineMonitor monitor = new GumballMachineMonitor();
        monitor.report(machine);
    }
    public void report(GumballMachineRemote machine){
        try{
            System.out.println("current inventory: " + machine.getCount());
            System.out.println("current state: "+ machine.getState());
        }catch (Exception e){
            e.printStackTrace();

        }
    }

}
