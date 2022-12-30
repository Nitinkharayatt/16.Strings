import javax.xml.namespace.QName;
import java.util.*;

public class check_if_a_String_is_Palindrome {
    public static boolean print( String name) {
        int n=name.length();

        for (int i=0;i<n/2;i++){
            if (name.charAt(i)!=name.charAt(n-1-i)){
                System.out.println("not palindrome");
                return false;
            }
        }
        System.out.println("palindrome");
        return true;
    }

    public static void main(String[] args){

        String first="nntnn";
     System.out.println(print(first));
    }
}
