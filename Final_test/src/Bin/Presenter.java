package Bin;

import Bin.Class.Animals;
import Bin.PresenterClass.*;

import Bin.Class.CheckChoice;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class Presenter {
    private final static View vw = new View();
    private final static Model md = new Model();
    private final static CheckChoice cc = new CheckChoice();
    private final static CreatePets createPets = new CreatePets();
    private final static CreatePack createPack = new CreatePack();


    public static void Run() throws ParseException {
        int flagType, menuFlag, flagTypeMenu, choiceType, choiceHowView;
        int choice = 0;
        int flag = 0;
        List<Animals> pets = new ArrayList<>();
        List<Animals> pack = new ArrayList<>();

        while (flag == 0) {
            menuFlag = 0;
            while (menuFlag == 0) {
                try {
                    choice = vw.menu();
                    menuFlag = cc.checkChoice(choice, 6);
                } catch (RuntimeException e) {
                    vw.info("Invalid input! Use numbers.");
                }
            }

            if (choice == 1) {
                flagTypeMenu = 0;
                while (flagTypeMenu == 0) {
                    //выбор типа животного
                    choiceType = vw.animalTypeChoice();

                    //продолжение работы программы в зависимости от выбора типа животного
                    if (choiceType == 1) {
                        Animals animals = createPets.createPets();
                        if (animals != null) {
                            pets.add(animals);
                            flagTypeMenu = 1;
                        }
                    } else if (choiceType == 2) {
                        Animals animals = createPack.createPack();
                        if (animals != null) {
                            pack.add(animals);
                            flagTypeMenu = 1;
                        }
                    } else if (choiceType == 3) {
                        flagTypeMenu = 1;
                    }
                }
            } else if (choice == 2) {
                flagTypeMenu = 0;
                while (flagTypeMenu == 0) {
                    if (pets.isEmpty() & pack.isEmpty()) {
                        vw.info("\nDatabase is empty! Add animals!");
                        break;
                    }
                    //выбор способа вывода списка комманд
                    choiceHowView = vw.howViewCommands();
                    if (choiceHowView == 1) {
                        vw.viewPetsCommands(pets);
                        vw.viewPackCommands(pack);
                        break;
                    } else if (choiceHowView == 2) {
                        flagType = 0;
                        while (flagType == 0) {
                            //выбор типа животного
                            choiceType = vw.animalTypeChoice();

                            //продолжение работы программы в зависимости от выбора типа животного
                            if (choiceType == 1) {
                                vw.viewPetsCommands(pets);
                                flagTypeMenu = 1;
                                break;
                            } else if (choiceType == 2) {
                                vw.viewPackCommands(pack);
                                flagTypeMenu = 1;
                                break;
                            } else if (choiceType == 3) {
                                flagType = 1;
                            }
                        }
                    } else {
                        flagTypeMenu = 1;
                    }
                }
            } else if (choice == 3) {
                choiceType = vw.animalTypeChoice();
                if (choiceType == 1){
                    
                } else if (choiceType == 2) {

                }
            } else if (choice == 4) {

            } else if (choice == 5) {

            } else if (choice == 6) {
                flag = 1;
            }
        }
        exit(0);
    }
}
