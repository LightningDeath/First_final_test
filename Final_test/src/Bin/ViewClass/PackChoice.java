package Bin.ViewClass;

import java.util.Scanner;

public class PackChoice {
    public int packChoice() throws RuntimeException{
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("""
                Choose animal:
                1 - Horse;
                2 - Camel;
                3 - Donkey;
                4 - Cow;
                5 - Cancel.
                """);
        System.out.print("Enter your selection--> ");
        return in.nextInt();
    }
}
