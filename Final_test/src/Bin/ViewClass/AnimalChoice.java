package Bin.ViewClass;

import java.util.Scanner;

public class AnimalChoice {
    public Integer animalChoice(int size) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int flag = 0;
        while (flag == 0) {
            System.out.print("\nEnter the animal number: ");
            try {
                choice = in.nextInt();
                if (choice < 1 || choice > size + 1) {
                    System.out.println("Incorrect animal number! Please, try again.");
                } else {
                    flag = 1;
                }
            } catch (RuntimeException e) {
                System.out.println("Invalid input! Use numbers.");
            }
        }
        return choice - 1;
    }
}
