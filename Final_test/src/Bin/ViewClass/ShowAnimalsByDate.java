package Bin.ViewClass;

import Bin.Class.Animals;

import java.util.List;

public class ShowAnimalsByDate {
    public Integer showAnimalsByDate(List<Animals> animalList, String date) {
        int counter = 0;
        for (Animals a : animalList) {
            if (a.getDb().equals(date)) {
                System.out.printf("""
                        \nType: %s
                        Name: %s
                        Date birthday: %s
                        Commands: %s
                        """, a.getType(), a.getName(), a.getDb(), a.getCommands());
                counter += 1;
            }
        }
        return counter;
    }
}
