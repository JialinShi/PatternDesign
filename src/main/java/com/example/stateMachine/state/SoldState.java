package com.example.stateMachine.state;

import com.example.stateMachine.gumballMachine.GumballMachine;

public class SoldState implements State{
    private  static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;


    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public  void insertQuarter(){
        gumballMachine.setState(gumballMachine.getHasQuarterState());
        System.out.println("Receiving a quarter.");
    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense(GumballMachine gumballMachine) {

    }

    ;




}
