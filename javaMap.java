import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine(); // clearing the buffer so that we can get our string

        HashMap<String ,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            String name = sc.nextLine();
            int Contacts = sc.nextInt();
            sc.nextLine(); // clearing the buffer so that we can get our string
            
            //adding name & contact to map
            map.put(name, Contacts);
        }

        while(sc.hasNext()) {
            String existing = sc.nextLine();

            try{
                int contact = map.get(existing);
                System.out.println(existing+"="+contact);
            }
            catch(Exception e){
                System.out.println("Not found");
            }
            

        }
        
    }
}