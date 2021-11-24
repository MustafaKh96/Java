package DT.Type_Casting;

public class Main {
    public static void main(String [] args){
        // In Java gibt es zwei Arten von Casting:
        // (automatisch): byte-> short-> int-> long-> float-> double.
        int a = 10;
        float a1 = a;
        System.out.println(a1); // 10.0
        // (manuell): double-> float-> long-> int-> short-> byte.
        float b = 10f;
        int b1 = (int) b;
        System.out.println(b1); // 10
        double c = 10.9;
        int c1 = (int) c;
        System.out.println(c1); // 10
    }
}