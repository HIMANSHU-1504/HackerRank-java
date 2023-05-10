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
     * Complete the 'contacts' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_STRING_ARRAY queries as parameter.
     */
     
    static class Node{
          Node[] childern;
          int count;
          
          public Node(){
                childern = new Node[26]; //a to z
                for(int i=0;i<26;i++){
                      childern[i] = null;
                }
                count = 0;
          }
    }

    
    static Node root = new Node();
    public static void insert(Node root, String word){
          Node curr = root;
          
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            
            if(curr.childern[idx] == null){
                curr.childern[idx] = new Node();
            }
            curr = curr.childern[idx];
            curr.count++;
        }
    }
    
    public static int search(Node root,String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.childern[idx] == null){
                return 0;
            }
            curr = curr.childern[idx];
        }
        return curr.count;
    }
         

    public static List<Integer> contacts(List<List<String>> queries) {
    // Write your code here
    List<Integer> result = new ArrayList<>();
    root = new Node();
    
    for(List<String> q:queries){
        if(q.get(0).charAt(0) == 'a'){
            insert(root, q.get(1));
            
        }else{
            result.add(search(root, q.get(1)));
        }
    }
    return result;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int queriesRows = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> queries = new ArrayList<>();

        IntStream.range(0, queriesRows).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.contacts(queries);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

