package Operatoren;

//Nur für Zahlen.
public class ArithmetikOperatoren {
    public static void main(String[] args) {
        //+-*/%:
        int a = 10;
        int b = 20;
        int erg;
        erg = a + b; // 30
        erg = a - b; //-10
        erg = a * b; //200
        erg = a / b; //0
        double d1 = 10.0;
        double d2 = 20.0;
        System.out.println(d1/d2); //0.5
        erg = a % b;
        System.out.println(10%9); //1
        // Inkrement:
        a++; // 11
        // Dekrement:
        a--; // 10
    }
}