package Bin.ViewClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnimalCommandsEnter {
    public List<String> animalCommandsEnter() {
        Scanner in = new Scanner(System.in);
        int flag = 0;
        String commands;
        String[] parsCommands = null;
        while (flag == 0) {
            System.out.print("\nEnter commands separated by commas or spaces: ");
            commands = in.nextLine();
            parsCommands = commands.split(", | \\s");
            commands = commands.toLowerCase();
            if (commands.matches("[a-z,\\s]+")) {
                flag = 1;
            }else {
                System.out.println("""
                        \nInvalid input! Correct input format:
                        commands, commands, commands;
                        commands,commands,commands;
                        commands commands commands.
                        Please, try again.
                        """);
            }
        }
        return new ArrayList<>(Arrays.asList(parsCommands));
    }
}
