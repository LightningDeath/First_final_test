
//import java.lang.reflect.Array;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;

import Bin.Class.Animals;
import Bin.ModelClass.CreateAnimal;
import Bin.View;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public final static View vw = new View();

    public static void main(String[] args) throws IOException {
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

        String[] com = new String[2];
        List<Animals> pets = new ArrayList<>();
        com[0] = "aaaa";
        com[1] = "bbb";
        List<String> comss = new ArrayList<>(Arrays.asList(com));
        CreateAnimal ca = new CreateAnimal();
        pets.add(ca.CreateAnimal("cat", "Bars", "11.12.2020", comss));
        pets.add(ca.CreateAnimal("dog", "Move", "11.12.2020", comss));
        for (Animals a : pets) {
            System.out.println(a.getType() + " " + a.getName() + " " + a.getDb() + " " + a.getCommands());
        }
        System.out.println(pets.size());
        String[] newC = new String[2];
        newC[0] = "ccc";
        newC[1] = "gg";
        List<String> newCom = new ArrayList<>(Arrays.asList(newC));
        for (String n : newCom) {
            pets.get(0).addCommands(n);
        }
        //pets.get(0).addCommands(newCom.toString());

//        for (String s:newC
//             ) {
//            pets.get(0).addCommands(s);
//        }
        //comss.addAll(Arrays.asList(newC));
        //coms.add(Arrays.toString(newC));
        //pets.get(0).addCommands(Arrays.toString(newC));
        //pets.get(0).addCommands(newC);
//        for (Animals a: pets) {
//            System.out.println(a.getType()+" "+a.getName()+" "+a.getDb()+" "+a.getCommands());
//        }
//        String date = vw.animalDateEnter();
//        int counter = 0;
//        for (Animals a : pets) {
//            if (a.getDb().equals(date)) {
//                System.out.println(a.getType() + " " + a.getName() + " " + a.getDb() + " " + a.getCommands());
//                counter += 1;
//            }
//        }
//        if (counter == 0) {
//            System.out.println("Fuck");
//        }
        System.out.println(pets.size());
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject_1 = new JSONObject();
        for (Animals n: pets) {
            jsonObject.put("type", n.getType());
            jsonObject.put("name", n.getName());
            jsonObject.put("DateBirthday", n.getDb());
            jsonObject.put("Commands", n.getCommands());
        }
        jsonObject_1.put("pets", jsonObject);
        System.out.println(jsonObject.get("name"));
        String path = new File("").getAbsolutePath() + "\\src\\Data\\Pets.txt";
        try (FileWriter fw = new FileWriter(path)){
        fw.write(pets.get(0).getType()+" "+pets.get(0).getName()+" "+pets.get(0).getDb()+" "+pets.get(0).getCommands());
        }
        String[] str_1;
        String str;
        try (BufferedReader fr = new BufferedReader(new FileReader(path))){
            str = fr.readLine();
        }

        str_1 = str.split(" ");
        Animals pets_1 = new Animals(str_1[0],str_1[1],str_1[2],Arrays.asList(str_1[3].split(",")));
        System.out.printf("\n%s %s %s %s", pets_1.getType(), pets_1.getName(), pets_1.getDb(), pets_1.getCommands());
    }
}
