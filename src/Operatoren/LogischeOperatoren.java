package Operatoren;

//Nur für Boolean.

public class LogischeOperatoren {
    public static void main(String[] args) {
        //&,|,^,!:
        boolean a = true;
        boolean b = false;
        System.out.println(a&b);
        //&&,||: (Lasy-Operatoren)
        // a && b:
        // a wird überprüft nud wenn a false ist, dann wird b NICHT mehr überprüft.
        // und kommt ein false raus.
        // a || b:
        // a wird überprüft nud wenn a true ist, dann wird b NICHT mehr überprüft.
        // und kommt ein true raus.

        if((1 != 1) && (1/0==1/0)) {
            System.out.println("1/0 wurde schon überprüft :(");
        }
        else{
            System.out.println("1/0 wurde NICHT überprüft :)"); // 1/0 wurde NICHT überprüft :)
        }
    }
}