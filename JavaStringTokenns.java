import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        int count = 0;
        s = s.trim();
        if(s.length() == 0){
            System.out.println(0);
            return;
        }
        String[] str = s.split("[^a-zA-Z]+");
        for(String w: str){
            count++;
        }
        System.out.println(count);
        for(String w: str){
            
            System.out.println(w);
        }
        
        scan.close();
    }
}
