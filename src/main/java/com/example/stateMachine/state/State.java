package com.example.stateMachine.state;

import com.example.stateMachine.gumballMachine.GumballMachine;
import java.io.Serializable;

public interface State extends Serializable {

    public void insertQuarter();

    public  void ejectQuarter();

    public void turnCrank();

    public void dispense(GumballMachine gumballMachine);



}
