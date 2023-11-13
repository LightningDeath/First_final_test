package Bin.ViewClass;

import java.util.Scanner;

public class AnimalNameEnter {
    public String animalNameEnter(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter animal name: ");
        return in.nextLine();
    }
}
