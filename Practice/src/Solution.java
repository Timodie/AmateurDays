	import java.math.BigInteger;
import java.util.*;
public class Solution {

	//BigInteger big

	/**
	 * @author Arun.G
	 *
	 */
		

	       public static void noOfChocolates(int [] arr) {
	        long given =0;      
			long noOfChocolates = 0;
			long [] output = new long [arr.length];
			for(int i =0; i < arr.length; i++){
	            
				noOfChocolates = (long) (arr[i] / 2) * (arr[i] - (long) (arr[i] / 2));
	            output[i]=noOfChocolates; 
			System.out.println(output[i]);
			}    
	             
	       }
	       
	       static void mystery(String[] letter) {
	    	  for(int i=0; i < letter.length;i++){
	    	   
	    	
	    	   int count =0;
	    	   int m = 0;
	            int n = letter[i].toCharArray().length-1;
	            while(m<n){
	                if(letter[i].toCharArray()[m]!=letter[i].toCharArray()[n]){
	                    int tmp = Math.abs(letter[i].toCharArray()[m]-letter[i].toCharArray()[n]);
	                    count = count+tmp;
	 
	                }
	                m++;
	                n--;
	                
	       }
	            System.out.println(count);
	    	  }
	    	
	          
	       }

	       public static void main(String[] args) {
	              /*
	               * Enter your code here. Read input from STDIN. Print output to STDOUT.
	               * Your class should be named Solution.
	               */
	    	   String choc [] = {"abc","abcba","abcd"};
	    	mystery(choc);
	      
	       }
	}
