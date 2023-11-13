package Bin.ViewClass;

import java.util.Scanner;

public class Menu {
    public Integer menu() throws RuntimeException {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("""
                Select the desired action:
                1 - Add animal;
                2 - List commands;
                3 - Learn new commands;
                4 - List of animal by date birthday;
                5 - Show how many animals there are;
                6 - Exit.
                """);
        System.out.print("Enter your selection--> ");
        return in.nextInt();
    }
}
