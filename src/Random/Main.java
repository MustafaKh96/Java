package Random;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

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

        // Generation einer zufälliger Zahl vom Typ int zwischen 1 , 10.
        // random.nextInt(10) : [0,10[ -> 10 wird nicht betrachtet.
        // Wenn wir die 10 betrachten möchten, dann schreiben wir dies +1.

        int d = random.nextInt(10) + 1 ; // ]1,10]
        System.out.println(d);

        int e = random.nextInt(11); // [0,10]
        System.out.println(e);

    }
}