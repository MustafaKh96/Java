package Klassen.Random;

import java.util.Random;

public class Main {

    int erzeugeZufallZahl(int untereGrenze, int obereGrenze){
        Random r = new Random();
        int erg = r.nextInt(obereGrenze);
        while (erg < untereGrenze){
            erg = r.nextInt(obereGrenze);
        }
        return erg;
    }

    public static void main(String[] args) {

        Main m = new Main();
        Random random = new Random();

        // Generation einer zufälliger Zahl vom Typ int!
        int a = random.nextInt();
        System.out.println(a);

        // Generation einer zufälliger Zahl vom Typ double!
        double b = random.nextDouble();
        System.out.println(b);

        // Generation einer zufälliger Wahrheitswert!
        boolean c = random.nextBoolean();
        System.out.println(c);

        int e = random.nextInt(10); // [0,9] bzw. [0,10[
        System.out.println(e);

        int d = random.nextInt(10) + 1 ; // [1,10] Die 0 ist nicht mehr zubetrachten.
        System.out.println(d);

        int e1 = m.erzeugeZufallZahl(20,30);
        System.out.println(e1);
    }
}