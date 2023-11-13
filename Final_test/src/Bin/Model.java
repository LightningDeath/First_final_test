package Bin;

import Bin.Class.Animals;
import Bin.ModelClass.CreateAnimal;

import java.util.Date;
import java.util.List;

public class Model {
    private final static CreateAnimal ca = new CreateAnimal();
    public Animals createAnimal(String type, String name, String birthDate, List<String> commands){
        return ca.CreateAnimal(type, name, birthDate, commands);
    }
}
