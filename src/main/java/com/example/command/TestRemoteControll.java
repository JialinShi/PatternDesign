package com.example.command;
import com.example.command.commander.*;
import com.example.command.furniture.*;

public class TestRemoteControll {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        remote.setCommands(0, new LightOnCommand(new Light()), new LightOffCommand(new Light()));
        remote.setCommands(1, new LightOnCommand(new CeillingLight()), new LightOffCommand(new CeillingLight()));
        remote.setCommands(2, new LightOnCommand(new KitchenLight()), new LightOffCommand(new KitchenLight()));
        remote.setCommands(3, new GarageDoorOpenCommand(), new GarageDoorCloseCommand());
        remote.setCommands(4, new CeilingFanHighCommand(), new NoCommand());
        remote.setCommands(5, new CeilingFanMediumCommand(), new NoCommand());

        remote.onCommandPressed(1);
        remote.onCommandPressed(2);
        remote.onCommandPressed(3);
        remote.offCommandPressed(2);
        remote.offCommandPressed(3);
        remote.undo();

        remote.onCommandPressed(4);
        remote.undo();
        remote.onCommandPressed(5);
        remote.onCommandPressed(4);
        remote.undo();

        System.out.println("Now let us party!");
        Command[] partyOn = new Command[2];
        partyOn[0] = new LightOnCommand(new CeillingLight());
        partyOn[1] = new CeilingFanHighCommand();
        MacroCommand party = new MacroCommand(partyOn);
        party.execute();
        party.undo();


    }

}
