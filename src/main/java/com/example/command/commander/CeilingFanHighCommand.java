package com.example.command.commander;

import com.example.command.furniture.CeilingFan;
import com.example.command.furniture.CeilingFan.Speed;

public class CeilingFanHighCommand implements Command{
    private CeilingFan fan;
    private Speed prevSpeed;

    public CeilingFanHighCommand(){
        fan = new CeilingFan();
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.high();
    }

    @Override
    public void undo() {
        if(prevSpeed == Speed.MEDIUM){
            fan.medium();
        }else if(prevSpeed == Speed.LOW){
            fan.low();
        } else if (prevSpeed == Speed.OFF) {
            fan.off();
        }else fan.high();
    }
}
