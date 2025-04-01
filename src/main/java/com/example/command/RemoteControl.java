package com.example.command;

import com.example.command.commander.Command;
import com.example.command.commander.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    private Command undo;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        NoCommand noCommand = new NoCommand();

        for(int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
    public void setCommands(int slot, Command on, Command off){
        onCommands[slot] = on;
        offCommands[slot] = off;
    }

    public void onCommandPressed(int slot){
        onCommands[slot].execute();
        undo = onCommands[slot];
    }
    public void offCommandPressed(int slot){
        offCommands[slot].execute();
        undo = offCommands[slot];
    }

    public void undo(){
        undo.undo();
    }




}
