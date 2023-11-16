package Bin.ModelClass;

import Bin.Class.Animals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile {
    public List<Animals> readFile(String fileName) throws RuntimeException {
        List<Animals> animalsList = new ArrayList<>();
        Animals animals;
        String[] parsFile;
        String[] parsCommands;
        String str;
        String path = new File("").getAbsolutePath() + "\\src\\Data\\" + fileName;
        try (BufferedReader fr = new BufferedReader(new FileReader(path))) {
            str = fr.readLine();
            while (str != null) {
                parsFile = str.split(" ");
                parsCommands = parsFile[3].split(",");
                List<String> commandsList = new ArrayList<>(Arrays.asList(parsCommands));
                animals = new Animals(parsFile[0], parsFile[1], parsFile[2], commandsList);
                animalsList.add(animals);
                str = fr.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return animalsList;
    }
}
