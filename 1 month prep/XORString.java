import java.io.*;
import java.util.*;

 class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);

    String message1 = scanner.next();
    String message2 = scanner.next();

    String output = new String() ;
    for(int i=0;i<message1.length();i++){
        if(message1.charAt(i) == message2.charAt(i)){
            output = output+"0" ;
        }else{
            output = output+"1" ;
        }
    }
    System.out.println(output);
    }
}
