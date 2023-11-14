package Bin;

import Bin.Class.Animals;
import Bin.ViewClass.*;

import java.text.ParseException;
import java.util.List;

public class View {
    private final static AnimalTypeChoice atp = new AnimalTypeChoice();
    private final static Menu m = new Menu();
    private final static Info i = new Info();
    private final static PetsChoice ac = new PetsChoice();
    private final static AnimalNameEnter an = new AnimalNameEnter();
    private final static AnimalDateEnter ad = new AnimalDateEnter();
    private final static AnimalCommandsEnter ace = new AnimalCommandsEnter();
    private final static PackChoice pc = new PackChoice();
    private final static HowViewCommands hwc = new HowViewCommands();
    private final static ViewPetsCommands vpec = new ViewPetsCommands();
    private final static ViewPackCommands vpac = new ViewPackCommands();

    public void viewPackCommands(List<Animals> pack) {
        vpac.viewPackCommands(pack);
    }

    public void viewPetsCommands(List<Animals> pets) {
        vpec.viewPetsCommands(pets);
    }

    public Integer animalTypeChoice() {
        return atp.animalTypeChoice();
    }

    public Integer menu() throws RuntimeException {
        return m.menu();
    }

    public void info(String message) {
        i.info(message);
    }

    public int petsChoice() throws RuntimeException {
        return ac.petsChoice();
    }

    public int packChoice() throws RuntimeException {
        return pc.packChoice();
    }

    public String animalNameEnter() {
        return an.animalNameEnter();
    }

    public String animalDateEnter() throws ParseException {
        return ad.animalDateEnter();
    }

    public List<String> animalCommandsEnter() throws RuntimeException {
        return ace.animalCommandsEnter();
    }

    public Integer howViewCommands() {
        return hwc.howViewCommands();
    }

}
