package Bin.ViewClass;

import Bin.Class.Animals;

import java.util.List;

public class ViewPackCommands {
    public void viewPackCommands(List<Animals> pack) {
        System.out.println("Pack animal:");
        if (pack.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Animals a : pack) {
                System.out.println("Type: " + a.getType() + " Name: " + a.getName() +
                        " Commands: " + a.getCommands());
            }
        }
    }
}
