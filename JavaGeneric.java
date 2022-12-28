import java.io.*;
import java.util.*;

public class CodingClub {
    
    public static <E> void printArray(E[] inputArray) {
    // display array elements
    for (E element : inputArray)
      System.out.printf("%s \n", element);

    // System.out.println();
  }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] integrArray = new Integer[n];
        String[] stringArray = new String[m];

        for(int i = 0; i < integrArray.length; i++){
            integrArray[i] = sc.nextInt();
        }
        for(int i = 0; i < stringArray.length; i++){
            stringArray[i] = sc.next();
        }

        printArray(integrArray);
        printArray(stringArray);
    }
}