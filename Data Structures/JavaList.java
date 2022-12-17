import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        { 
            list.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            String s = sc.next();
            if(s.compareTo("Insert") == 0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x, y);
            }
            else{
                int x = sc.nextInt();
                list.remove(x);
            }
        }
        
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        
    }
}
