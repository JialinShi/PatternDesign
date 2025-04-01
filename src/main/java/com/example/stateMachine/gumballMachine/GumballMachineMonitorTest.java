package com.example.stateMachine.gumballMachine;

import java.rmi.Naming;

public class GumballMachineMonitorTest {

    public static void main(String[] args) {
        try{
            GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup("Aviva//RemoteGumballMachine") ;
            GumballMachineMonitor gumballMachineMonitor = new GumballMachineMonitor();
            gumballMachineMonitor.report(machine);
        }catch (Exception ex){
            ex.printStackTrace();
        }


    }

}
