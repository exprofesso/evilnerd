package futurama;

import java.util.Random;
import java.util.Scanner;

public class Bender {
    public static void main(String[] args) {
        Fry PhillipFry = new Fry ("Futurama");
        Fry PFry = new Fry("Terminator");


        System.out.println(cool());
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();
        System.out.println(enter);



        PhillipFry.FrySay();
        PhillipFry.FrySay1(enter);
        PhillipFry.testint(43554);


        PhillipFry.output();
        PFry.output();





        String heroes [] = {"Барт", "Бендер", "Рик", "Гомер", "Морти"};

        for (int i = 0; i <heroes.length; i++){
            System.out.println(heroes[i]);
        }
        title(heroes);

        for (int i = 0; i < heroes.length; i++){
            System.out.println(heroes[i]);
        }

        for (String i: heroes){
            System.out.println(i);
        }


        Random random = new Random();
        int num[] = new int[33];

        for (int i = 0; i <= 1000; i++){
            ++num[random.nextInt(33)];

        }
        for (int i = 0; i < num.length; i++){
            System.out.println(i + "\t" + num[i]);

        }


    }

    public  static String cool (){
        return  "я крут";
    }

    public static void title(String t[]) {
        for (int i = 0; i < t.length; i++) {
            t[i] += " отличный парень!";
        }
    }
}
