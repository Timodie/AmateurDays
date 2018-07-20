import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.*;

public class AlgorithmicCrush {
		
	private static PriorityQueue<Long> pq = new PriorityQueue<Long>(Comparator.reverseOrder());
	
	
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        int cpuCount = Runtime.getRuntime().availableProcessors();
		 	ExecutorService executor = Executors.newFixedThreadPool(cpuCount);
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
	        for(int i =0; i<m; i++){
	            String op = scan.nextLine();
	            String [] ops = op.split("\\s+");
	            long indx1 = Long.parseLong(ops[0]);
	            long indx2 = Long.parseLong(ops[1]);
	            long val   = Long.parseLong(ops[2]);
//	           
//	            for(long i=indx1-1; i<=indx2-1; i++){
//	                list[(int) i] +=val;
//	                max = Math.max(max,list[(int) i]);
//	            }
	            Runnable worker = new Faster(indx1,indx2,val,list);
	            
	            executor.execute(worker);
	            }
	        executor.shutdown();
	       // wait until all threads are finished 
	       while(!executor.isTerminated()){
	    	   
	       }
	       scan.close();
	        System.out.println(pq.peek());
	    }
	 
	 private static class Faster implements Runnable {
		 
		 private static long from;
		 private static long to;
		 private static long val;
		 private static long [] list;
		 private static long max;
		 
		 
		 private Faster(long from, long to, long val, long [] list){
			 this.from = from;
			 this.to = to;
			 this.val =val;
			 this.list = list;
			 this.max = list[0];
		 }
		 @Override
		 public void run(){
			 for(long i = from-1; i<=to-1; i++){
				 list[(int)i]+=val;
				 max =Math.max(max, list[(int)i]);
				 synchronized(AlgorithmicCrush.pq){
					 pq.add(max);
					}
				 
			 }
		 }
		 public long getMax(){
			 return max;
		 }
	 }
	 
	 
}
