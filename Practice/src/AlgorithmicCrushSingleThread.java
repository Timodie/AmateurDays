import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlgorithmicCrushSingleThread {
	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	        String line = scan.nextLine();
	        
	        String [] lines = line.split("\\s+");
	        String N = lines[0] ;
	        String M = lines[1];
	        long n = Long.parseLong(N);
	        long m = Long.parseLong(M);
	        long [] list = new long[(int)n];
	        long max   = list[0]; 
	        int count = 0;
	        long x =0;
	        if(n >=1 && n <= 10000000 && m >= 1 && m <= 1000000)

			{
	        while(count < m){
	            String op = scan.nextLine();
	            String [] ops = op.split("\\s+");
	            long indx1 = Long.parseLong(ops[0]);
	            long indx2 = Long.parseLong(ops[1]);
	            long val   = Long.parseLong(ops[2]);
	            if(indx1 >= 1 && indx1 <= n && indx2 >= 1 && indx2 <= n && val >=1 && val <= 1000000000){
//	            for(long i=indx1-1; i<=indx2-1; i++){
//	                list[(int) i] +=val;
//	                max = Math.max(max,list[(int) i]);
//	            }
	            	list[(int)indx1]+=val;
	            	if(indx2 +1 < n){
	            		list[(int)indx2+1]-=val;
	            	}
	            }
	            count++;
	        }
	        for(int i=0; i< list.length; i++){
	        	x+=list[i];
	        	max =Math.max(x, max);
	        }
			}
	        System.out.println(max);
	    }
}
