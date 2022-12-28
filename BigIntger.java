import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn = new Scanner(System.in);
        String input1 = scn.next();
        String input2 = scn.next();

        BigInteger sum, multipcation;

        BigInteger a = new BigInteger(input1);
        BigInteger b = new BigInteger(input2);

        sum = a.add(b);

        multipcation = a.multiply(b);

        System.out.println(sum);
        System.out.println(multipcation);

        
    }
}