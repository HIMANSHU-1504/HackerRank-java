import java.io.*;
import java.util.*;

public class palindrome {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        // char[] str = A.toCharArray();
        String newStr = "";
        for(int i =A.length()-1; i>=0;i--) {
            newStr+=A.charAt(i);
        }if(A.equals(newStr)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}



