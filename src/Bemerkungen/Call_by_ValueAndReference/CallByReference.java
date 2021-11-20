package Bemerkungen.Call_by_ValueAndReference;

public class CallByReference {

    // Call_by_Reference:

    // Variablen von Referenztypen (z.B. Kunde, Reise, Person..) werden als Referenz (call-by- reference)
    // in einer Methode übergeben.

    public void namenGeben(Kunde kunde33, Kunde kunde44){
        kunde33.setName("Messi");
        kunde44.setName("Ronaldo");
    }
    public void tauscheKunden(Kunde kunde11, Kunde kunde22) {
        Kunde temp = null;
        temp = kunde11;
        kunde11 = kunde22;
        kunde22 = temp;
    }
    public static void main(String[] args) {

        CallByReference obj = new CallByReference();

        //-----------------------------------------------------------------------

        Kunde kunde1 = new Kunde();
        kunde1.setName("Müller");

        Kunde kunde2 = new Kunde();
        kunde2.setName("Schmidt");

        obj.tauscheKunden(kunde1, kunde2);
        // Call by Reference.

        // Im Speicher (1) : Kunder1 -> Müller
        // Im Speicher (2) : Kunder2 -> Schmidt
        // Im Speicher (3) : Kunde11 -> Kunde1 -> Müller
        // Im Speicher (3) : Kunde22 -> Kunde2 -> Schmidt.
        // Beim Tauschen habe ich tatsächlich Kunde11 und Kunde22 getauscht und nicht Kunde 1 und Kunde 2.
        // D.h. Kunde11 zeigt auf Kunde2 & Kunde22 zeigt auf Kunde1.

        System.out.println(" Name des Kunden1: " + kunde1.getName());
        System.out.println(" Name des Kunden2: " + kunde2.getName());
        System.out.println("----------------");

        //---------------------------------------------------------------------

        Kunde kunde3 = new Kunde();
        kunde1.setName("Mbappe");

        Kunde kunde4 = new Kunde();
        kunde2.setName("Haaland");

        obj.namenGeben(kunde3 , kunde4);
        // Call by Reference.

        // Im Speicher (1) : Kunder3 -> Mbappe
        // Im Speicher (2) : Kunder4 -> Haaland
        // Im Speicher (3) : Kunde33 -> Kunde3 -> Mbappe
        // Im Speicher (4) : Kunde44 -> Kunde4 -> Haaland.

        // D.h, wenn Kunde33 einen namen ändert, dann ändert sich der Name Mbappe

        // Im Speicher (4) : Kunde33 -> Kunde3 -> Messi.
        // Im Speicher (5) : Kunde44 -> Kunde4 -> Ronaldo.

        System.out.println(" Name des Kunden3: " + kunde3.getName());
        System.out.println(" Name des Kunden4: " + kunde4.getName());

    }
}
