package Arrays;

import java.util.Arrays;

public class Mian {

    // Arrays werden verwendet, um mehrere Werte in einer einzigen Variablen zu
    // speichern, anstatt für jeden Wert separate Variablen zu deklarieren.

    public static void main(String[] args){

        // Array erstellen:

        // Keine Länge angeben; Aber Elemente angeben.
        //=> Die Länge des Array wird in Laufzeit bestimmt.
        // D.h: in Kompilerzeit muss sie nicht bekannt sein.
        // Nicht wie in c, c++; wo sie in Kompilerzeit bekannt sein muss.
        // D.h. Die Länge des Arrays ist NICHT Teil des Types.

        int [] i_arr = {1,2,3,4,5} ;
        String [] s_arr = {"Hallo" , "Welt", "!"};

        // Länge Angeben; Elemente später angeben.
        //=> Die Länge des Array ist in Kompilerzeit bekannt und somit ist die
        // Teil des Types.

        int [] i2_arr = new int[5];
        // i2_arr = {1,2}; FEHLER
        i2_arr[0] =2;



        //--------

        // Array printen:
        // For-schleife:
        for(int i=0; i < i_arr.length; i++){
            System.out.print(i_arr[i]);
        }
        System.out.println();
        // For-Each Schleife:
        for(int i: i_arr){
            System.out.print(i);
        }
        System.out.println();

        //--------

        // Auf die Elemente eines Arrays zugreifen:
        System.out.println(i_arr[2]);

        //--------

        // Ändern eines Array-Elements:
        i_arr[1]=10;
        System.out.println(i_arr[1]);

        //--------

        // Array-Länge: ( Wie viel Elemente hat das Array)

        // Problem: Größe bzw. Länge des Array ist fest,
        // dh wenn man ein Array definiert und die Elemente angibt,
        // kann man die Länge später nicht ändern,
        // dh man kann kein Element löschen oder hinzufügen.
        System.out.println(i_arr.length);

        //--------

        // Methoden:

        // Equals(x,y): Vergleicht Arrays gleicher Type.
        int [] a1 = {1,2,3,4,5};
        int [] a2 = {1,2,3,4,5};
        System.out.println(Arrays.equals(a1,a2));

        //sort(x): sortiert das Array
        int [] a3 = {4,3,2,6,1};
        Arrays.sort(a3);
        for(int i: a3){
            System.out.print(i);
        }
        System.out.println();

        // fill([]x, y) füge y in x hinzu.
        int [] a4 = new int[4];
        Arrays.fill(a4, 19);

        for(int i: a4){
            System.out.print(i);
        }
        System.out.println();
    }
}