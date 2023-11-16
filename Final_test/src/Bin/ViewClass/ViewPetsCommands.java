package Bin.ViewClass;

import Bin.Class.Animals;

import java.util.List;

public class ViewPetsCommands {
    public void viewPetsCommands(List<Animals> pets) {
        int counter = 1;
        System.out.println("\nPets animal:");
        if (pets.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Animals a : pets) {
                System.out.println(counter + ". Type: " + a.getType() + "\n   Name: " + a.getName() +
                        "\n   Commands: " + a.getCommands());
                counter += 1;
            }
        }
    }
}
