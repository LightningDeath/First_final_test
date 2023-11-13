package Bin.ViewClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AnimalDateEnter {
    public String animalDateEnter() throws ParseException {
        String date;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter date birthday: ");
        date = in.nextLine();
        SimpleDateFormat dateForm = new SimpleDateFormat("dd.MM.yyyy");
        dateForm.setLenient(false);
        dateForm.parse(date);
        return date;
    }

}
