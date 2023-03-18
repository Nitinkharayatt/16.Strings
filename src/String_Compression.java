import java.util.*;
import java.util.Scanner;

public class String_Compression {
//    public static StringBuilder compression(String str) {
//        StringBuilder newstr = new StringBuilder("");
//
//        for (int i=0; i<str.length(); i++) {
//            Integer count = 1;
//            while ( i<str.length()-1 && str.charAt(i) == str.charAt(i + 1) ) {
//                count++;
//                i++;
//            }
//            newstr.append(str.charAt(i));
//            if (count > 1) {
//            newstr.append(count.toString());
//            }
//        }
//        return newstr;
//    }
//
//    public static void main(String[] args) {
//        String str = "aaabbcccdd";
//        System.out.println(compression(str));
//    }
//}

    public static String compress(String str) {
        String newstr="";
        for(int i=0;i<str.length();i++){

             Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr=newstr+str.charAt(i);
            if(count>1){
                newstr=newstr+count;
            }
        }
        return newstr;
    }

    public static void main(String[] args){
        String str="aaabbbccdd";
        System.out.println(compress(str));

    }

}
