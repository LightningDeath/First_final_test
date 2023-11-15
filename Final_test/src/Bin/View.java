package Bin;

import Bin.Class.Animals;
import Bin.ViewClass.*;

import java.util.List;

public class View {
    private final static AnimalTypeChoice atp = new AnimalTypeChoice();
    private final static Menu m = new Menu();
    private final static Info i = new Info();
    private final static PetsChoice pec = new PetsChoice();
    private final static AnimalNameEnter an = new AnimalNameEnter();
    private final static AnimalDateEnter ad = new AnimalDateEnter();
    private final static AnimalCommandsEnter ace = new AnimalCommandsEnter();
    private final static PackChoice pac = new PackChoice();
    private final static HowViewCommands hwc = new HowViewCommands();
    private final static ViewPetsCommands vpec = new ViewPetsCommands();
    private final static ViewPackCommands vpac = new ViewPackCommands();
    private final static AnimalChoice ac = new AnimalChoice();
    private final static ShowAnimalsByDate sabd = new ShowAnimalsByDate();

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
        return pec.petsChoice();
    }

    public int packChoice() throws RuntimeException {
        return pac.packChoice();
    }

    public String animalNameEnter() {
        return an.animalNameEnter();
    }

    public String animalDateEnter(){
        return ad.animalDateEnter();
    }

    public List<String> animalCommandsEnter() throws RuntimeException {
        return ace.animalCommandsEnter();
    }

    public Integer howViewCommands() {
        return hwc.howViewCommands();
    }
    public Integer animalChoice(Integer size){return ac.animalChoice(size);}
    public Integer showAnimalsByDate(List<Animals> animalList, String date){
        return sabd.showAnimalsByDate(animalList,date);
    }

}
