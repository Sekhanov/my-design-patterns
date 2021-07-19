package com.sekhanov.desingpatterns.creationalpatterns.prototipe;

import lombok.Setter;

@Setter
public class Command {

    private int size;
    private String name;
    private String script;

    public Command() {}

    private Command(Command command) {
        size = command.size;
        name = command.name;
        script = command.script;
    }

    public Command clone() {
        return new Command(this);
    }

    @Override public String toString() {
        return "Command{" +
            "size=" + size +
            ", name='" + name + '\'' +
            ", script='" + script + '\'' +
            '}';
    }
}
