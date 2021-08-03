package Strings;

public class Main {
    public static void main(String [] args){

        // Finden :

        String s1 = "Hallo World" ;
        String s2 = "World" ;

        // charAt(..) :
        System.out.println(s1.charAt(1)); // -> a
        // indexOf(..) :
        System.out.println(s1.indexOf('a')); // -> 1
        System.out.println(s1.indexOf('l', 2)); // -> an Position 2 => 2
        System.out.println(s1.indexOf(s2)); // -> Ab welcher Position fängt s2 an => 6
        // lastIndexOf(..) :
        System.out.println(s1.lastIndexOf('l')); // -> 9
        System.out.println(s1.lastIndexOf('l', 5)); // bis zu Position 5 => 3
        System.out.println(s1.lastIndexOf(s2)); // -> Ab welcher Position wurde s2 gesehen => 6
        // contains(..) :
        System.out.println(s1.contains(s2)); // true
        System.out.println(s1.contains("ABC")); // false

        //Zerlegen:

        //public String substring(int startIndex)
        //public String substring(int startIndex, int endIndex)
        System.out.println(s1.substring(6));
        System.out.println(s1.substring(6,7));

        //public CharSequence subSequence(int startIndex, int endIndex)
        //ist wie substring, aber sie hat zwei Param.

        //public String[] split(String regex)

        //public String[] split(String regex, int limit)
        //Wo der Parameter limit ist, übergeben wir eine reguläre Zahl,
        //die wir setzen, falls wir die Anzahl der Elemente des Arrays begrenzen möchten,
        //die die Funktion zurückgibt.
        String[] str = s1.split(" ");
        System.out.println(str[0]);




    }
}
