package Bemerkungen.Call_by_ValueAndReference;

public class CallbyValue {

    // Call_by_Value:
    // Nur bei den primitiven Datentypen.
    // Variablen von primitiven Typen (int, double, boolean..) werden (call-by-value) in einer Methode
    // übergeben.
    // Im Speicher im Beispiel unten : x -> 1 , y -> 2.
    // obj.zahlenAustausch(x,y); hier habe ich im Speicher : a -> 1 (Der Wert von X) , b -> 2 (Der Wert von Y)
    // und wenn es sich etwas in der Methode ändert, dann ändert sich bei den Werten a & b und nicht bei x & y.

    public void zahlenAustausch(int a, int b){
        int temp = 0;
        temp = a;
        a = b ;
        b = temp;
    }
    public static void main(String[] args) {
        CallbyValue obj = new CallbyValue();
        int x = 1;
        int y = 2;
        obj.zahlenAustausch(x,y);
        System.out.println("x : " + x);
        System.out.println("Y : " + y);
    }
}