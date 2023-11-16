package Bin.ModelClass;

import Bin.Class.Animals;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public void writeFile(List<Animals> animalsList, String fileName) throws RuntimeException{
        String path = new File("").getAbsolutePath() + "\\src\\Data\\" + fileName;
        try (FileWriter fw = new FileWriter(path)) {
            for (Animals a : animalsList) {
                fw.write(a.getType() + " " + a.getName() + " " + a.getDb() + " "
                        + a.getCommands()+"\n");
            }
        }catch (IOException e){
            throw new RuntimeException();
        }
    }
}
