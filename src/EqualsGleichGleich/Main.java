package EqualsGleichGleich;

import Call_by_ValueAndReference.Kunde;

public class Main {
    public static void main(String[] args) {

        // == vergleicht die primitiven Datentypen
        // == vergleicht, ob zwei Referenzen aufs selbe Objekt zeigen bzw. ob die
        // beiden Objekte den selben Speicherplatz haben.
        // == vergleicht NICHT den Inhalt der Objekte.

        int i1 = 2;
        int i2 = 3;
        System.out.println(i1 == i2); // false

        String c1 = "Abo";
        String c2 = "Abo";
        System.out.println(c1 == c2); // true
        System.out.println(c1.equals(c2)); // true


        String s1 = new String("ABC");
        String s2 = new String("ABC");
        String s3 = s1;
        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // true

        //-----------------------------------

        // Equals():
        // Equals() ist nicht ÜBERALL definiert.
        // In den WrapperKlassen und der Klasse String ist diese Methode definiert. (Vergleicht den Inhalt).
        // ABER, z.B. in der Klasse Person ist sie nicht definiert, sondern mann muss es selber definieren.
        // Und wenn man sie bei Objekten (kunde), bei denen sie nicht definiert ist, benutzt,
        // dann arbeitet sie wie == Operator.


        String st1 = new String("A");
        String st2 = new String("A");
        System.out.println(st1.equals(st2)); // true
        System.out.println(st1 == st2); // false

        // In der Klasse Kunde ist equals NICHT definiert: (arbeitet wie == Operator)
        kunde k1 = new kunde("ANAS");
        kunde k2 = new kunde("ANAS");
        kunde k3 = k1;
        System.out.println(k1.equals(k2)); // false
        System.out.println(k1.equals(k3)); // true

        // Java ist eine objektorientierte Sprache.
        // Jedes Objekt kann selbst entscheiden ob es gleich einem anderen ist,
        // deswegen hat jedes Objekt eine equals(Object o) Methode.
        // Wenn man eine Klasse erstellt erbt diese die Funktionalität von equals von der Oberklasse bzw. Object.
        // Diese vergleicht allerdings per default nur auf Identität, was of nicht gewünscht ist.
        // Deshalb muss die equals Methode in vielen Fällen überschrieben werden.

        // Wichtig: wenn eine Klasse die Methode equals() überschreibt,
        // muss die Methode hashCode() ebenfalls überschrieben werden
        // (was aber kein großes Problem ist, siehe unten).

        Person a = new Person("Musti",1);
        Person b = new Person("Musti",1);
        System.out.println(a.equals(b));
    }
}