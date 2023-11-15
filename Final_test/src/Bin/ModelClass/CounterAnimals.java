package Bin.ModelClass;

import Bin.Class.Animals;

import java.util.List;

public class CounterAnimals {
    public Integer counterAnimals(List<Animals> pets, List<Animals> pack) {
        return pets.size() + pack.size();
    }
}
