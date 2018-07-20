	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
public class AnagramMinimumDeletions {
	

	
	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	    public static int solution(int X) {
	        // write your code in Java SE 8
	        String str = Integer.toString(X);
	        if(str.length() ==1){
	            return X;
	        }
	        int nStr =X;
	        int i =0;
	        int min =0;
	        int max =0;
			int avg =0;
			while(i < str.length()){
			    if(i +1 < str.length()){
			    String curr =""+str.charAt(i);
			    String mcurr =""+str.charAt(i+1);
			   
			    min = Integer.parseInt(curr);
			    max = Integer.parseInt(mcurr);
			   if(min < max){
			    avg = (int)(min +max)/2;
			    avg = Math.max(avg,(int)Math.ceil(avg));
			}
			 String big = Integer.toString(avg);
			  nStr =Integer.parseInt(str.substring(0,i)+big);
			    }
			    	i++;
			  
			}
		  // String nStr =str.substring(0,i)+big+str.substring(i,str.length()-1);

			return nStr;
			
	    }
	   
	    public static void main(String[] args) {
	        System.out.println(solution(623715));
	        
	        
	        Queue<Integer> q =new LinkedList<Integer>();
	       
	    }
	}

