package Klassen.WrapperClasses;

// Für alle primitiven Datentypen haben wir Klassen namens(Wrapper Klassen).
// int -> Integer, char -> Character ...
// Diese Klassen enthalten wichtige Methoden, wie CompareTo, parseInt, ...

public class WrapperClasses {
    public static void main(String[] args) {

        //----------------------------------

        //Auto/boxing : Von int -> Integer (valueOf(x))
        int l = 10;
        Integer l1 = l;
        //Was der Kompiler macht ist:
        // Integer l1 = Integer.valueOf(l);

        //----------------------------------

        //Unboxing : von Integer -> int (xxxValue())
        Integer i = new Integer(2);
        int i1 = i;
        //Was der Kompiler macht ist:
        //int i = i.intValue();

        //----------------------------------

        //public xxx xxxValue();
        //Z.B : wenn ich einen Double-Typ habe und möchte ihn zu int wächseln.
        double d = 1.9;
        Double d1 = d;
        int i11 = d1.intValue();
        System.out.println(i11); // 1

        //----------------------------------

        //public xxx compareTo(xxx Param);
        //Vergleichen zwischen a und b.
        //Rückgabe ist:   -1 : Wenn a<b.  0 : Wenn a=b. 1 : Wenn a>b.
        Double a = 20.0;
        Double b = 20.0;
        System.out.println(a.compareTo(b));

        //---------------------------------

        //public boolean equals(Object o).
        System.out.println(a.equals(b));

        //---------------------------------

        //public static xxx valueOf(xxx a)
        double h = 1.1;
        Double j = Double.valueOf(h);
        System.out.println(j);
        System.out.println(j instanceof Double);
        // Alternative:
        int q = 3;
        Integer q1 = 3;
        System.out.println(q1 instanceof Integer);

        //---------------------------------

        //public static xxx valueOf(String a)
        String s = "2";
        Integer p = Integer.valueOf(s);
        System.out.println(p);

        //---------------------------------

        //public static xxx valueOf(xxx a) (Unboxing)
        Integer w11 = new Integer(2);
        int w1 = w11.intValue();
        System.out.println(w1);

        //---------------------------------

        //public static int parseInt(String s)
        //public static double parseDouble(String s)
        // ..... usw.
        String st = "10" ;
        int w = Integer.parseInt(st);
        double d2 = Double.parseDouble(st);
        System.out.println(w + ", " +d2);

        //---------------------------------
        // public String toString()

        int k = 1000;
        Integer k1 = k;
        System.out.println(k1.toString());
        
    }
}
