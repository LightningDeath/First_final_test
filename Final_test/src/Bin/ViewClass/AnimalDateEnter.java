package Bin.ViewClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AnimalDateEnter {
    public String animalDateEnter() {
        Scanner in = new Scanner(System.in);
        String date = "";
        int flag = 0;
        while (flag == 0) {
            System.out.print("\nEnter date birthday(dd.MM.yyyy): ");
            date = in.nextLine();
            SimpleDateFormat dateForm = new SimpleDateFormat("dd.MM.yyyy");
            dateForm.setLenient(false);
            try {
                dateForm.parse(date);
                flag = 1;
            } catch (ParseException e) {
                System.out.println("Incorrect date format! Correct format dd.MM.yyyy.");
            }
        }
        return date;
    }

}
