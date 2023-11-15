package Bin;

import Bin.Class.Animals;
import Bin.ModelClass.AddCommands;
import Bin.ModelClass.CounterAnimals;
import Bin.ModelClass.CreateAnimal;

import java.util.List;

public class Model {
    private final static CreateAnimal ca = new CreateAnimal();
    private final static AddCommands ac = new AddCommands();
    private final static CounterAnimals couAn = new CounterAnimals();

    public Animals createAnimal(String type, String name, String birthDate, List<String> commands) {
        return ca.CreateAnimal(type, name, birthDate, commands);
    }

    public void addCommands(Animals animal, List<String> newCommands) {
        ac.addCommands(animal, newCommands);
    }

    public Integer counterAnimal(List<Animals> pets, List<Animals> pack) {
        return couAn.counterAnimals(pets, pack);
    }
}
