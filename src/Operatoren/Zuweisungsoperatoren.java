package Operatoren;

public class Zuweisungsoperatoren {
    public static void main(String[] args) {
        //=:
        int a = 10;
        //+=,-=,...:
        a+=3; // a = a + 3 => a = 13
        //&=,|=,...:
        a|=1; // a = a | 1 => 1101 | 0001 =  1101 => a = 13
        System.out.println(a); // 13
        //>>=,<<=:
        a>>=1; // 1101 -> 0110 => a = 6
        System.out.println(a); // 6
    }
}