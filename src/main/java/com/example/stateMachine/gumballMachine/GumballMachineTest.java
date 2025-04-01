package com.example.stateMachine.gumballMachine;

import java.rmi.Naming;

public class GumballMachineTest {

    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;

        if (args.length < 2)
            System.exit(1);
        try {
            int count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(count);
            Naming.rebind("//" + args[0] + "/RemoteGumballMachine", gumballMachine);
            System.out.println("Service is rebinding.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        gumballMachine.insertQuarter();
//        gumballMachine.ejectQuarter();
//        //gumballMachine.turnCrank();
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
////        gumballMachine.turnCrank();
////        gumballMachine.ejectQuarter();
////
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();;
//
//        gumballMachine.insertQuarter();
//

    }

}
