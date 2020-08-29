
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Assignment {

    
	static long cost(int[] v, int n) 
	 { 
	   
	     // Sort the inputed  array 
	     Arrays.sort(v); 
	       
	     long totalCost = 0; 
	   
	     // Calcualte minimum price 
	     for (int i = n - 1; i > 1; i -= 2) 
	     { 
	         if (i == 2) 
	         { 
	             totalCost += v[2] + v[0]; 
	         } 
	         else
	         { 
	   
	            
	             long price_first = v[i] + v[0] + 2 * v[1]; 
	             long price_second = v[i] + v[i - 1] + 2 * v[0]; 
	             totalCost += Math.min(price_first, price_second); 
	         } 
	     } 
	   
	     // Calculate the minimum price 
	     // of the two cheapest person 
	     if (n == 1) 
	     { 
	         totalCost += v[0]; 
	     } 
	     else
	     { 
	         totalCost += v[1]; 
	     } 
	   
	     return totalCost; 
	 }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       

        

        System.out.println("Please enter how many test cases do you to enter");
        int t = Integer.parseInt(scanner.nextLine().trim());
        
       

        String[] vItems = null;

        for (int vItr = 0; vItr < t; vItr++) {
        	System.out.println("Enter no. of persons");
            int vItem =Integer.parseInt(scanner.nextLine().trim());
            System.out.println("Please enter "+ vItem + "of each person sepearated by space");
            	vItems = scanner.nextLine().split(" ");
            	int[] v = new int[vItem];
            	int i=0;
            	
            	for (String ele:vItems) {
            		v[i]=Integer.parseInt(ele);
            		i++;
            	}
            	System.out.println("final output"+cost(v, i));
        }
        
    }
}
