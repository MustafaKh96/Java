package DT.Datentypen;

public class Main {
    public static void main(String[] args){

        // primitive DT: (8)
        // Die Werte werden direkt aufs Stak angelegt.

        // Für ganze Zahlen: (4)
        byte a1 = 1; // 1 Byte
        short a2 = 1; // 2 Byte
        int a3 = 1; // 4 Byte
        long a4 = 1; // 8 Byte
        // Für kommazahl: (2)
        float b1 =  3; //=> 3.0  (4Byte)
        float b2 =  3f; //=> 3.0 (4Byte)
        //float b3 = 3.0; wäre falsch!
        double d = 1.1; // 8 Byte
        char c1 = 'a'; // 2 Byte
        char c2 = 65; //=> A ; ASCII-Wrte
        boolean e = true; // 2 Byte

        // Referenz,Objekt DT: (3)
        // => Referenz auf Stak und verweisen auf die Objekte im Heap.

        // Klassen.Math.Strings:
        String s = "Hallo" ;
        // DT.Arrays:
        int [] arr = {1,2,3};
        // Objekte:
        String []a = new String[2];
    }
}