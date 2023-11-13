package Bin.ViewClass;

import java.util.Scanner;
import Bin.Class.CheckChoice;

public class HowViewCommands {
    private final static CheckChoice cc = new CheckChoice();
    public Integer howViewCommands() throws RuntimeException{
        int flagType = 0;
        int choiceType = 0;
        Scanner in = new Scanner(System.in);
        while (flagType == 0) {
            System.out.println();
            System.out.println("""
                Choose type animal:
                1 - All commands of all animals;
                2 - Commands for a specific animal;
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
