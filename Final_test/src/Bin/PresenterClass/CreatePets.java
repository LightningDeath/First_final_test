package Bin.PresenterClass;

import Bin.Class.*;
import Bin.Model;
import Bin.View;

import java.text.ParseException;

public class CreatePets {
    private final static Model md = new Model();
    private final static View vw = new View();
    private final static CheckChoice cc = new CheckChoice();

    public Animals createPets() throws ParseException {
        int type = 0;
        int flagAnimal = 0;

        while (flagAnimal == 0) {
            try {
                type = vw.petsChoice();
                flagAnimal = cc.checkChoice(type, 5);
            } catch (RuntimeException e) {
                vw.info("Invalid input! Use numbers.");
            }
        }

        if (type == 1) {
            return md.createAnimal("Cat", vw.animalNameEnter(), vw.animalDateEnter(), vw.animalCommandsEnter());
        } else if (type == 2) {
            return md.createAnimal("Dog", vw.animalNameEnter(), vw.animalDateEnter(), vw.animalCommandsEnter());
        } else if (type == 3) {
            return md.createAnimal("Hamster", vw.animalNameEnter(), vw.animalDateEnter(), vw.animalCommandsEnter());
        } else if (type == 4) {
            return md.createAnimal("Parrot", vw.animalNameEnter(), vw.animalDateEnter(), vw.animalCommandsEnter());
        }
        return null;
    }
}
