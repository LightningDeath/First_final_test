package Bin.ModelClass;

import Bin.Class.Animals;

import java.util.List;

public class AddCommands {
    public void addCommands(Animals animals, List<String> newCommands){
        for (String n : newCommands){
            animals.addCommands(n);
        }
    }
}
