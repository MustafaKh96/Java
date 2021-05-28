package Math;

public class Main {

    // Sie werden feststellen, dass alle genannten Funktionen double Zahlen behandeln und zurückgeben.
    // Der Grund dafür ist, dass Sie mit dem double-Typ eine beliebige Zahl übergeben können,
    // sei es int, long oder float.

    public static void main(String[] args) {

        //----------------------------------

        //public static xxx abs(xxx d) ترجع القيمة المطلقة

        int a = -30;
        System.out.println(Math.abs(a)); // 30

        //----------------------------------

        //public static double ceil(double d)  ترجع العدد الصحيح الأكبر أو الذي يساوي العدد الذي نمرره

        double c = 1.1;
        System.out.println(Math.ceil(c)); // 2.0

        //----------------------------------

        //public static double floor(double d) ترجع العدد الصحيح الأصغر أو الذي يساوي العدد الذي نمرره
        System.out.println(Math.floor(c)); // 1.0

        //----------------------------------

        //public static double rint(double d) ترجع أقرب عدد صحيح للعدد الذي نمرره لها مكان الباراميتر
        // (Rückgabe ost double)

        // {1.1 , 1.2 , 1.3, 1.4} -> 1.0
        // {1.5 .... } -> 2.0

        double d = 1.5;
        System.out.println(Math.rint(c)); // 1.0
        System.out.println(Math.rint(d)); // 2.0

        //----------------------------------

        // public static long round(double d) ترجع أقرب عدد صحيح للعدد الذي نمرره لها مكان الباراميتر
        // (Rückgabe ist long)
        System.out.println(Math.round(d)); // 2

        //----------------------------------

        //public static xxx max(xxx a, xxx b)
        //public static xxx min(xxx a, xxx b)
        int e = 1;
        int f = 3;
        System.out.println(Math.max(e,f)); // 3
        System.out.println(Math.min(e,f)); // 1

        //----------------------------------

        // public static double pow(double/int a, double/int b) berechnet : a hoch b.

        System.out.println(Math.pow(e,f)); // 1.0

        //----------------------------------

        //public static double random()   ترجع عدد عشوائي بين 0 و 1

        System.out.println(Math.random());
        System.out.println(Math.random() + 9 ); // ترجع عدد عشوائي بين 9 و 10

        //----------------------------------

        // PI & E
        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E);

        //Mathe:
        //public static double exp(double d)
        //public static double log(double d)
        //public static double sqrt(double d)
        //public static double sin(double d)
        //public static double cos(double d)
        //public static double tan(double d)
        //public static double asin(double d)
        //public static double acos(double d)
        //public static double atan(double d)

    }
}