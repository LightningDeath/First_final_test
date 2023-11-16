package Bin.ModelClass;

import Bin.Class.*;

import java.util.List;

public class CreateAnimal {
    public Animals createAnimal(String type, String name, String birthDate, List<String> commands) {
        return new Animals(type, name, birthDate, commands);
    }
}
