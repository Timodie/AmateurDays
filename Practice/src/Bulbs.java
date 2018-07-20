import java.math.*;
import java.util.*;
public class Bulbs {
	 public static int bulbs(int [] a) {
	        //solveHalf(a);
	        
	        return solveHalf(a);
	    }
	    
	    public static int solveHalf(int[] a){
	        int i =0;
	        int count =0;
	        while( i < a.length){
	            if(a[i]==0){
	                a[i]=i;
	                count++;
	            }
	            i++;
	        }
	        return count;
	    }
	    public static void main(String [] args){
	    int a []  = {1, 0, 1, 0, 1, 0, 0, 0};
	    
	    System.out.println(bulbs(a));
	    }

}
//A : [ 1, 0, 1, 0, 1, 0, 0, 0 ]