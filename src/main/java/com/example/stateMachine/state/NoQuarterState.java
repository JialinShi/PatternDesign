package com.example.stateMachine.state;

import com.example.stateMachine.gumballMachine.GumballMachine;

public class NoQuarterState implements State{
    private  static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public  void insertQuarter(){
        gumballMachine.setState(gumballMachine.getHasQuarterState());
        System.out.println("inserted a quarter.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You cannot eject a quarter because you have not inserted one.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Nothing would happened because you have not inserted one.");
    }

    @Override
    public void dispense(GumballMachine gumballMachine) {
        return;
    }





}
