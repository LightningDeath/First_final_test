package Bin.ViewClass;

import java.util.Scanner;

public class AnimalNameEnter {
    public String animalNameEnter(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter animal name: ");
        return in.nextLine();
    }
}
