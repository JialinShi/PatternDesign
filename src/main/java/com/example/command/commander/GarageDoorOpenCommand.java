package com.example.command.commander;

import com.example.command.furniture.GarageDoor;

public class GarageDoorOpenCommand implements Command{
    GarageDoor door ;

    public GarageDoorOpenCommand(){
        door = new GarageDoor();
    }

    @Override
    public void execute() {
        door.open();

    }

    @Override
    public void undo() {
        door.close();
    }
}
