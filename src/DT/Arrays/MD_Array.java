package DT.Arrays;

public class MD_Array {
    public static void main(String[] args){
        int [][] a1 = {{1,2,3},{4,5,6,7}};

        // Zugriff auf Elemente:
        System.out.println(a1[1][2]); // 6

        //Länge:
        System.out.println(a1.length); // 2
        System.out.println(a1[0].length); // 3

        int z = 0;
        for(int i = 0; i<a1.length;i++){
            for(int j = 0; j<a1[i].length;j++){
                z++;
            }
        }
        System.out.println(z);

        //----------

        // print:
        for(int i = 0; i<a1.length;i++){
            for(int j = 0; j<a1[i].length;j++){
                System.out.print(a1[i][j]);
            }
        }
        System.out.println();
    }
}