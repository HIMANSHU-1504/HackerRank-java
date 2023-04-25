import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    
    long max = 0;
    for(int i= 1;i<arr.size();i++){
        max += arr.get(i);
    }
    long min = 0;
    for(int i=0;i<arr.size()-1;i++){
        min += arr.get(i);
    }
    
    List<Long> ans = new ArrayList<>();
    ans.add(min);
    ans.add(max);
    
    Object[] obj = ans.toArray();
    for(Object i : obj){
        System.out.print(i+" ");
    }
    
    }

}
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

