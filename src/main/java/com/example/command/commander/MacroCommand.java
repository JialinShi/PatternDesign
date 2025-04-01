package com.example.command.commander;

public class MacroCommand implements Command{
    Command[] partyOn;

    public MacroCommand(Command[] commands){
        partyOn = commands;
    }

    @Override
    public void execute() {
        for(int i = 0; i < partyOn.length; i++){
            partyOn[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i = 0; i < partyOn.length; i++){
            partyOn[i].undo();
        }

    }
}
