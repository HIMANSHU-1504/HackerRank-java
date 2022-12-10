import java.io.*;
import java.util.*;  
public class counting {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int count1=0, count2=0;
        for(int i=0;i<A.length();i++){
            count1++;
        }
        for(int i=0;i<B.length();i++){
            count2++;
        }
        System.out.println(count1+count2);

        int retval = A.compareTo(B);
        if (retval < 0) {
            System.out.println("No");
         } else if (retval == 0) {
            System.out.println("No");
         }
          else {
            System.out.println("Yes");
         }
        

        System.out.print(capitalize(A));     
        System.out.println(" "+capitalize(B));
        
    }
    public static final String capitalize(String str){  
        if (str == null || str.length() == 0) return str;  
        return str.substring(0, 1).toUpperCase() + str.substring(1);  
}  
}



