package Bin;

import Bin.Class.Animals;
import Bin.ModelClass.*;

import java.util.List;

public class Model {
    private final static CreateAnimal ca = new CreateAnimal();
    private final static AddCommands ac = new AddCommands();
    private final static CounterAnimals couAn = new CounterAnimals();
    private final static WriteFile wf = new WriteFile();
    private final static ReadFile rf = new ReadFile();

    public Animals createAnimal(String type, String name, String birthDate, List<String> commands) {
        return ca.createAnimal(type, name, birthDate, commands);
    }

    public void addCommands(Animals animal, List<String> newCommands) {
        ac.addCommands(animal, newCommands);
    }

    public Integer counterAnimal(List<Animals> pets, List<Animals> pack) {
        return couAn.counterAnimals(pets, pack);
    }
    public void writeFile(List<Animals> animalsList, String fileName) throws RuntimeException{
        wf.writeFile(animalsList, fileName);
    }
    public List<Animals> readFile(String fileName) throws RuntimeException{
        return rf.readFile(fileName);
    }
}
