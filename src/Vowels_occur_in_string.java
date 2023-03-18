import java.util.*;

public class Vowels_occur_in_string {

    //It counts each vowel occurs how many times seperately
  public static void vowels(String str){

      int a=0,e=0,i=0,o=0,u=0;

      for (int x=0;x<str.length();x++){
          if (str.charAt(x)=='a'){
              a++;
          } else if (str.charAt(x)=='e'){
              e++;
          } else if (str.charAt(x)=='o') {
              o++;
          }  else if (str.charAt(x)=='i') {
              i++;
          } else if (str.charAt(x)=='u'){
              u++;
          }
      }
      System.out.println("a ="+a+"\te ="+e+"\ti ="+i+"\to ="+o+"\tu ="+u);
  }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        vowels(str);
    }
}


    // It counts total vowels present in string

//    public static void main(String[] args) {
//    String str=new Scanner(System.in).next();
//
//        int count=0;
//
//        for (int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if (ch=='a' || ch=='e'||ch=='i'||ch=='o'|| ch=='u'){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }





