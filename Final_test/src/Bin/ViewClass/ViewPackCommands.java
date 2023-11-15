package Bin.ViewClass;

import Bin.Class.Animals;

import java.util.List;

public class ViewPackCommands {
    public void viewPackCommands(List<Animals> pack) {
        int counter = 1;
        System.out.println("Pack animal:");
        if (pack.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Animals a : pack) {
                System.out.println(counter + ". Type: " + a.getType() + " Name: " + a.getName() +
                        " Commands: " + a.getCommands());
                counter += 1;
            }
        }
    }
}
