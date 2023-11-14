package Bin.ViewClass;
import Bin.Class.CheckChoice;

import java.util.Scanner;

public class AnimalTypeChoice {
    private final static CheckChoice cc = new CheckChoice();
    public Integer animalTypeChoice() {
        Scanner in = new Scanner(System.in);
        int flagType = 0;
        int choiceType = 0;
        while (flagType == 0) {
            System.out.println("""
                \nChoose type animal:
                1 - Pets;
                2 - Pack animals;
                3 - Cancel.
                """);
            System.out.print("--> ");
            try {
                choiceType = in.nextInt();
                flagType = cc.checkChoice(choiceType, 3);
            } catch (RuntimeException e) {
                System.out.println("Invalid input! Use numbers.");
            }
        }
        return choiceType;
    }
}
