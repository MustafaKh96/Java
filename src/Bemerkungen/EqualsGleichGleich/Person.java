package Bemerkungen.EqualsGleichGleich;

import java.util.Objects;

public class Person {
    private String name;
    int id;
    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o){
        // Zuerst wird per this == o überprüft,
        // ob es sich um die selbe Referenz handelt.
        if(this == o){
            return true;
        }
        // Danach wird mit o instanceof Person überprüft,
        // ob das andere Objekt vom selben Type oder einer Unterklasse ist.
        if(!(o instanceof Person)){
            return false;
        }
        // Hier wird den Vergleich definiert:

        Person person = (Person) o;
        return this.name.equals(person.name) && this.id == person.id ;
    }
    // Es ist wichtig, die hashCode() Methode zu überschreiben,
    // da sonst manche Datenstrukturen wie z.B. Maps gar nicht oder
    // nicht korrekt mit der Klasse funktionieren.
    // (Damit jedes Objekt einen richtugen Hash-Wert bekommt)
    // Es ist einfach so:
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}