package Bin.PresenterClass;

import Bin.Class.*;
import Bin.View;
import Bin.Model;

import java.util.List;

public class CreatePack {
    private final static AnimalDataEnter ade = new AnimalDataEnter();
    private final static CheckChoice cc = new CheckChoice();
    private final static View vw = new View();
    private final static Model md = new Model();

    public Animals createPack() {
        int type = 0;
        int flagAnimal = 0;

        while (flagAnimal == 0) {
            try {
                type = vw.packChoice();
                flagAnimal = cc.checkChoice(type, 5);
            } catch (RuntimeException e) {
                vw.info("Invalid input! Use numbers.");
            }
        }

        if (type == 1) {
            return md.createAnimal("Cat", ade.animalName(), ade.animalDateBirthday(), ade.animalCommands());
        } else if (type == 2) {
            return md.createAnimal("Dog", ade.animalName(), ade.animalDateBirthday(), ade.animalCommands());
        } else if (type == 3) {
            return md.createAnimal("Hamster", ade.animalName(), ade.animalDateBirthday(), ade.animalCommands());
        } else if (type == 4) {
            return md.createAnimal("Parrot", ade.animalName(), ade.animalDateBirthday(), ade.animalCommands());
        }
        return null;
    }
}
