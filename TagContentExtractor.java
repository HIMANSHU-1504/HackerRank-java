import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
        
        String expression = "<([^<>]+)>([^<>]+)</\\1>";  
        Pattern pattern = Pattern.compile(expression); 
        
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
            Matcher matcher = pattern.matcher(line);  
      
            int count = 0;  
        
            while (matcher.find() == true){  
                System.out.println(matcher.group(2));  
                count++;  
            }  
              
            if (count == 0) {  
                System.out.println("None");  
            }  
			
			testCases--;
		}
	}
}


