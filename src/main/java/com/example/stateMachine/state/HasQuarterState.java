package com.example.stateMachine.state;

import com.example.stateMachine.gumballMachine.GumballMachine;

public class HasQuarterState implements State{
    public static  final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        return;
    }

    @Override
    public  void ejectQuarter(){
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank(){
        System.out.println("releasing a ball");
        dispense(gumballMachine);
    }

    @Override
    public void dispense(GumballMachine gumballMachine) {
        return;
    }


}

