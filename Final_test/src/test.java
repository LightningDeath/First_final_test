
//import java.lang.reflect.Array;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.*;

import Bin.Class.*;
import Bin.ModelClass.CreateAnimal;

public class test {
    public static void main(String[] args) {
//        int f = 0;
//        int i = 0;
//        while (f == 0){
//            Scanner in = new Scanner(System.in);
//        try{
//            i = in.nextInt();
//            if (i < 1 || i > 6){
//                System.out.println("There is no such menu item, try again.");
//            } else {
//                f = 1;
//            }
//        }catch (RuntimeException e){
//            System.out.println("123");
//        }
//        }
//        System.out.println(i);

//        String date;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter date birthday: ");
//        date = in.nextLine();
//        SimpleDateFormat dateForm = new SimpleDateFormat("dd.MM.yyyy");
//        dateForm.setLenient(false);
//        try {
//            dateForm.parse(date);
//        }catch (ParseException e){
//            System.out.println("Fuck");
//        }

//        String commands;
//        String[] parsCommands;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter commands separated by commas or spaces: ");
//        commands = in.nextLine();
//        parsCommands = commands.split(",|\\s");
//        commands = commands.toLowerCase();
//        if (commands.matches("[a-z,\\s]+")){
//            System.out.println(Arrays.toString(parsCommands));
//            System.out.println(parsCommands.getClass());
//        }else {
//            System.out.println("Fuck");
//        }

//        String[] com = new String[2];
//        List<Animals> pets = new ArrayList<>();
//        com[0] = "aaaa";
//        com[1] = "bbb";
//        List<String> comss = new ArrayList<>(Arrays.asList(com));
//        CreateAnimal ca = new CreateAnimal();
//        pets.add(ca.CreateAnimal("cat", "Bars","11.12.12", comss));
//        pets.add(ca.CreateAnimal("dog","Move", "12.11.20", comss));
//        for (Animals a: pets) {
//            System.out.println(a.getType()+" "+a.getName()+" "+a.getDb()+" "+a.getCommands());
//        }
//        System.out.println(pets.size());
//        String[] newC = new String[2];
//        newC[0] = "ccc";
//        newC[1] = "gg";
//        comss = pets.get(0).getListCommands();
//        for (String s:newC
//             ) {
//            pets.get(0).addCommands(s);
//        }
//        //comss.addAll(Arrays.asList(newC));
//        //coms.add(Arrays.toString(newC));
//        //pets.get(0).addCommands(Arrays.toString(newC));
//        //pets.get(0).addCommands(newC);
//        for (Animals a: pets) {
//            System.out.println(a.getType()+" "+a.getName()+" "+a.getDb()+" "+a.getCommands());
//        }
        List<Animals> pets = new ArrayList<>();
        System.out.println("fuck");

    }

}
