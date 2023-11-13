package Bin.ViewClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnimalCommandsEnter {
    public List<String> animalCommandsEnter() throws RuntimeException{
        String commands;
        String[] parsCommands;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter commands separated by commas or spaces: ");
        commands = in.nextLine();
        parsCommands = commands.split(", | \\s");
        commands = commands.toLowerCase();
        if (!commands.matches("[a-z,\\s]+")){
            throw new RuntimeException();
        }
        List<String> returnCommands = new ArrayList<>(Arrays.asList(parsCommands));
        return returnCommands;
    }
}
