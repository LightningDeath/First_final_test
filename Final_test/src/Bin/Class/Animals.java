package Bin.Class;

import java.util.*;

public class Animals {
    private final String name;
    private final String type;
    private final String db;

    private final List<String> commands;


    public Animals(String type, String name, String dateBirth, List<String> commands) {
        this.type = type;
        this.name = name;
        this.db = dateBirth;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public String getDb() {
        return db;
    }

    public String getCommands() {
        return String.join(",", this.commands);
    }

    public String getType() {
        return type;
    }


    public void addCommands(String com) {
        this.commands.add(com);
    }

}
