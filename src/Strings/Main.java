package Strings;

public class Main {
    public static void main(String [] args){

        //Eine Zeichenkette ist im Prinzip nichts anderes als ein Array von einzelnen Zeichen (char).
        //Deswegen ist zu beachten, dass auch hier, ebenso wie bei Arrays, das erste Zeichen den Index 0 hat.
        //Daher entspricht der Index des letzten Elementes nicht der Länge der Zeichenkette,
        //sondern der Länge-1.

        String s1 = "Hallo World" ;
        String s2 = "World" ;

        // Finden :
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

        //Ersetzen:
        //public String replace(String old, String new)
        System.out.println(s1.replace("World","Welt"));
        String s3 = "Musti KH 10 11 12";
        System.out.println(s3.replaceFirst(" ","-")); // => "Musti-KH 10 11 12"

        //Vergleichen:
        //public boolean startsWith(String prefix), ist präfix
        //public boolean startsWith(String prefix, int pos), ist präfix ab Position ..
        System.out.println(s1.startsWith("Hallo")); // => true
        System.out.println(s1.startsWith("World",6)); // => true
        //public boolean endsWith(String suffix), ist suffix
        System.out.println(s1.endsWith("World")); // => true
        //public boolean equals(Object anObject)
        System.out.println(s1.equals(s2)); // => false
        //public boolean equalsIgnoreCase(String str)
        // => klein und groß Buchstaben werden ignoriert.
        String s = "welcome";
        String ss = new String("welcome");
        System.out.println(s == ss); // (überprüft die Eigenschaft bzw. Objekt) => false
        System.out.println(s.equals(ss)); // (überprüft die Zeichenkette) => true

        //Verarbeiten:
        //public String concat(String s) .. zusammenfügen (wie +)
        String s4 = s1.concat(s2);
        System.out.println(s4);
        //public String valueOf(XYZ b)
        char r1 []={'1', ' ', '2'};
        String strr1 = "";
        strr1 = String.valueOf(r1);
        System.out.println(strr1);
        //public char[] toCharArray() (Von String zu Array von Char's)
        char r2 [];
        String strr2= "Hallo";
        r2 = strr2.toCharArray();
        System.out.println(r2[1]);
        //length(); Die Länge der Zeichenkette
        System.out.println(s1.length());
        //public String toLowerCase() => Die großbuchstaben werden kleinbuchstaben
        //public String toUpperCase() => Die kleinbuchstaben werden großbuchstaben
        //trim
        //Die Methode trim schneidet bei einer Zeichenkette sowohl führende als auch abschließende Leerzeichen ab.
        //s.trim();
    }
}