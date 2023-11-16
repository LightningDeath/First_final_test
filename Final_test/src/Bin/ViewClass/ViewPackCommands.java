package Bin.ViewClass;

import Bin.Class.Animals;

import java.util.List;

public class ViewPackCommands {
    public void viewPackCommands(List<Animals> pack) {
        int counter = 1;
        System.out.println("\nPack animal:");
        if (pack.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Animals a : pack) {
                System.out.println(counter + ". Type: " + a.getType() + "\n   Name: " + a.getName() +
                        "\n   Commands: " + a.getCommands());
                counter += 1;
            }
        }
    }
}
