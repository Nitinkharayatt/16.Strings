import java.util.Arrays;

public class check_if_two_strings_anagrams {

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "crae";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {

            char[] str1ch = str1.toCharArray();  // toCharArray is used to convert string into character array
            char[] str2ch = str2.toCharArray();

            Arrays.sort(str1ch);
            Arrays.sort(str2ch);

            //System.out.println(str1ch);
            //System.out.println(str2ch);

            if (Arrays.equals(str1ch, str2ch)) {
                System.out.println("arrays are anagrams");
            } else System.out.println("not");
        }
        else System.out.println("NOT");
     }
}



//    public static void main(String[] args) {
//        String str1 = "apple";
//        String str2 = "alppe";
//
//        str1 = str1.toLowerCase();
//        str2 = str2.toLowerCase();
//
//        if (str1.length()==str2.length()){
//        char [] str1ch=str1.toCharArray();
//        char [] str2ch=str2.toCharArray();
//
//            Arrays.sort(str1ch);
//            Arrays.sort(str2ch);
//
//            if (Arrays.equals(str1ch,str2ch)){
//                System.out.println("true");
//            } else {
//            System.out.println("false");
//            }
//        }
//        else {
//            System.out.println("falsee");
//        }
//    }
//}
//
//
//
