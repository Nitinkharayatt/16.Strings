 import java.util.*;

public class Strings {

    public static void main(String[] args) {
        String str="Shradha";
        String str1="apna";
        String str2="Shradha";
        System.out.println(str.equals(str1)+" \n"+str.equals(str2));
    }

}
//    public static String compress(String str){
//        String newstr="";
//
//        for (int i=0;i<str.length();i++){
//            Integer count=1;
//            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
//                count++;
//                i++;
//            }
//            newstr+=str.charAt(i);
//            if (count>1){
//                newstr+=count.toString();
//            }
//        }
//        return newstr;
//    }
//
//    public static void main(String[] args) {
//        String str="aabbbccdd";
//        System.out.println(compress(str));
//    }
//}