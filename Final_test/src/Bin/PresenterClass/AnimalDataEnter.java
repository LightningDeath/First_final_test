package Bin.PresenterClass;
import Bin.View;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class AnimalDataEnter {
    private final static View vw = new View();

    public String animalName(){
        return vw.animalNameEnter();
    }
    public String animalDateBirthday(){
        String dateBirthday = null;
        int flagData = 0;
        while (flagData == 0) {
            try {
                dateBirthday = vw.animalDateEnter();
                flagData = 1;
            } catch (ParseException e) {
                vw.info("Invalid date format! Please, try again.");
            }
        }
        return dateBirthday;
    }
    public List<String> animalCommands(){
        List<String> commands = new ArrayList<>();
        int commandsFlag = 0;
        while (commandsFlag == 0) {
            try {
                commands = vw.animalCommandsEnter();
                commandsFlag = 1;
            } catch (RuntimeException e) {
                System.out.println("Invalid command input format! Please, try again.");
            }
        }
        return commands;
    }
}
