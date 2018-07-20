import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArrays {
	public static Map<String,Integer> map = new HashMap<String,Integer>();
	
	public static int Occurrence(String [] words){
	for(String str : words){
		if(map.containsKey(str)){
			map.put(str, map.get(str)+1);
		}
		else{
			map.put(str,1);
			
		}
		
	}
		
		return 0;
	}
	public static int printMap(String query){
		int occurrence =0;
	 for(Map.Entry<String, Integer> entry : map.entrySet()){
		 
//         System.out.printf("Key : %s and Value: %s %n", entry.getKey(),entry.getValue());
		 if(map.containsKey(query)){
			 occurrence = map.get(query);
		 }
		 
//		for(String str : query){
//		 if(entry.getKey().equals(str)){
//			 System.out.println(entry.getValue());
//		 }
//		 else{
//			 System.out.println(0);
//		 }
     }
	 return occurrence;
	 }
	static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());
        
            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
}
	static BigInteger factorial(BigInteger n ){
		if(n==BigInteger.ZERO){
			return  BigInteger.ONE;
		}
		if (n == BigInteger.ONE){
			return BigInteger.ONE;
		}
		return n.multiply(factorial((n.subtract(BigInteger.ONE))));
	}
	
	static int trailZ (int n){
	System.out.println(n);
	        int count =0;
	         while(n > 10){
	             if(n % 10 ==0){
	                 count++;    
	             }
	             n = n/10;
	         }
		return count;
	}
	static int rectrailZ(int n){
		return 0;
	}
	 public static void calculateFactorial(int n) {
		         BigInteger result = BigInteger.ONE; 
		         for (int i=1; i<=n; i++) {
		            result = result.multiply(BigInteger.valueOf(i));
			         }
		         System.out.println(n + "! = " + result);
		     }
	 static int factZero(int n){
		 if(n < 0){
			 return -1;
		 }
		 int count =0;
		 
		 for(long i=5; n/i >= 1; i*=5){
			 count += n/i;
		 }
		 return count;
	 }
	 public static int [] arrayrotate(int[] a, int b){
		 int temp = a[0];
		 for(int i=0; i<a.length-1; i++){
			 a[i] = a[i+1];
		 }
		 a[a.length-1]=temp;
		 
	 return a;
	 }
	 public static int egcd(int a, int b) {
		    if (a == 0)
		        return b;

		    while (b != 0) {
		        if (a > b)
		            a = a - b;
		        else
		            b = b - a;
		    }

		    return a;
		}
	
	public static void main(String [] args){
		String [] words ={"abc","abc","abd","aa","cc","cc","tim"};
		String [] query ={"tim","abc","ivy","cc"};
		int [] myarray = {1,2,3,4,5};
		
		int [] narra =arrayrotate(myarray,1);
		
		for(int i=0; i<narra.length;i++){
			//System.out.print(narra[i]+" ");
		}
		Occurrence(words);
		for(int i=0; i<query.length;i++){
		//System.out.println(printMap(query[i]));
		}
		BigInteger b = new BigInteger("101");
		//System.out.println("ans is"+factorial(b));
		
		for(int i =1; i < 12; i++){
		String a = Integer.toString(i);
		//System.out.println("the gcd for"+ a +"is "+egcd(11,i));
		}
		//System.out.println(egcd(16,2));
		int a =13;
		int br =(int)Math.sqrt(2);
		
		System.out.println(br);
		// System.out.println(10 % 10);
		 //System.out.println(trailZ(12000000));
		 //System.out.println("factZero is"+factZero(23));
		 
//		System.out.println(993%32 == 33 %32);
//		System.out.println(993%31 == 32 %31);
		//A : [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]] .
	//		ArrayList<ArrayList<Integer>> A = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	//		performOps(A);
		
	}
}



