import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String currSubstring = s.substring(0,k);
        String smallest = currSubstring;
        String largest = currSubstring;
        
        for(int i=0;i<=s.length()-k;i++){
            currSubstring = s.substring(i,i+k);
            if(currSubstring.compareTo(largest)>0){
                largest = currSubstring;
            }
            if(currSubstring.compareTo(smallest)<0){
                smallest = currSubstring;
            }
        }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

