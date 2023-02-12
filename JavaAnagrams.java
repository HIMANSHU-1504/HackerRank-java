import java.util.Scanner;

public class Solution {
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length()!=b.length()){
            return false;
        }
        int arr[] = new int[26];
        for(int i=0;i<a.length();i++){
            int idx = a.charAt(i) - 'a';
            arr[idx]++;
        }
        for(int i=0;i<b.length();i++){
            int idx = b.charAt(i) - 'a';
            arr[idx]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}