package Bin.ViewClass;

import java.util.Scanner;

public class PetsChoice {
    public int petsChoice() throws RuntimeException{
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("""
                Choose animal:
                1 - Cat;
                2 - Dog;
                3 - Hamster;
                4 - Parrot;
                5 - Cancel.
                """);
        System.out.print("Enter your selection--> ");
        return in.nextInt();
    }
}
