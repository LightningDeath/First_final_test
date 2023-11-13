package Bin.Class;

import Bin.ViewClass.Info;

import java.util.*;

public class Animals {
    private final String name;
    private final String type;
    private final String db;
    //private final int flag;
    private final List<String> commands;


    public Animals(String type, String name, String dateBirth, List<String> commands) {
        this.type = type;
        this.name = name;
        this.db = dateBirth;
        this.commands = commands;
        //this.flag = flag;
    }

//    public int getFlag() {
//        return this.flag;
//    }

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

    public List<String> getListCommands() {
        return this.commands;
    }

    public void addCommands(String com) {
        this.commands.add(com);
    }

}
