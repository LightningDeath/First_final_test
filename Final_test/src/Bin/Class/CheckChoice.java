package Bin.Class;

import Bin.View;

public class CheckChoice {
    View vw = new View();

    //метод для проверки правильности выбора пользователем пункта меню
    public int checkChoice(int choice, int menuItem) {
        if (choice < 1 || choice > menuItem) {
            vw.info("There is no such menu item, try again.");
            return 0;
        } else {
            return 1;
        }
    }
}
