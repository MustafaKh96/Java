package Characters;

public class Characters {

    public static void main(String[] args) {

        //-------------------------------

        char a = 'A';
        char unicode = '\u03A9'; // Ω
        Character b = new Character('B');
        System.out.println( a + " " + b + " " + unicode );

        //-------------------------------


        char [] c = {'H', 'A', 'L', 'L', 'O'};
        System.out.println(c.length);
        for(int i = 0; c.length >= i ; i++ ){
            if(i != c.length){
                char d = c[i];
                System.out.print(d);
            }
            else{
                System.out.println("");
            }
        }

        //-------------------------------

        //الكلاس Character هو كلاس جاهز في جافا, يحتوي على دوال للتعامل مع الأحرف, ذكرنا لك بعضها في هذا الجدول.

        // public static boolean isLetter(char ch) (Buchstabe?)
        // public static boolean isDigit(char ch) (Zahl?)
        // public static boolean isWhitespace(char ch) (' ' ?)
        // public static boolean isUpperCase(char ch) (A?)
        // public static boolean isLowerCase(char ch) (a?)
        // public static char toUpperCase(char ch) (a -> A)
        // public static char toLowerCase(char ch) (a -> A)
        // public static String toString(char c)

        char d = 'A' ;
        char e = '1' ;
        char f = 'f' ;

        System.out.println(Character.isLetter(d));  // true
        System.out.println(Character.isDigit(e)); // false
        System.out.println(Character.isWhitespace(e)); // false
        System.out.println(Character.isUpperCase(d)); // true
        System.out.println(Character.isLowerCase(f)); // true
        System.out.println(Character.toLowerCase(d)); // a
        System.out.println(Character.toUpperCase(f)); // F
        System.out.println(Character.toString(f)); // f, aber als String
        
    }
}