package com.example.command.commander;

import com.example.command.furniture.GarageDoor;

public class GarageDoorCloseCommand implements Command{
    GarageDoor door ;

    public GarageDoorCloseCommand(){
        door = new GarageDoor();
    }

    @Override
    public void execute() {
        door.close();
    }

    @Override
    public void undo() {
        door.open();

    }

}
