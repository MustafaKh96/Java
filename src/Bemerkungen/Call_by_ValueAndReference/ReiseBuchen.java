package Bemerkungen.Call_by_ValueAndReference;

public class ReiseBuchen {

    // Call_by_Reference:
    // Variablen von Referenztypen (z.B. Kunde, Reise) werden als Referenz (call-by- reference) übergeben.
    // Änderungen sind im aufrufendem Kontext sichtbar.

    public void checkKunde(Kunde kunde2, int type2){
        kunde2.setName( "Maier" );
        type2= 3;
    }

    public static void main(String[] args){

        Kunde kunde1 = new Kunde();

        kunde1.setName("Schmidt"); //Call_by_Reference und der Wert ändert sich.
        int type1 = 22;

        ReiseBuchen buchen = new ReiseBuchen();
        buchen.checkKunde( kunde1 , type1 );
        
        // für Typ ist es Call_by_Value. D.h der Wert wird übergeben und nicht der Reference.
        // Im Speicher type1 -> 22 und type2 ->22.

        // Für Kunde ist es Call_by_Reference. D.h. Der Reference wird übergeben.
        // Weil der Kunde kein prim. Datentyp.

        // Im Speicher (1): kunde1 -> "Schmidt"
        // Im Speicher (2): Kunde2 ->
        // Im Speicher (3): Kunde2 -> kunde1 -> "Schmidt".
        // Im Speicher (4): Kunde2 -> kunde1 -> "Maier".

        System.out.println(" Name des Kunden: " + kunde1.getName() );
        System.out.println(" Typ: " + type1 );
        System.out.println(kunde1.getName());
    }
}