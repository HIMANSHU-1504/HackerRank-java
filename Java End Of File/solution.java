import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        
    int i=1;
    while(sc.hasNext())
    {   
        System.out.println(i + " " + sc.nextLine());
        i++;
    }

    sc.close();
    }
}