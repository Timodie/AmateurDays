import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class RunningMedian {
	
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("executing....");
		Scanner in = new Scanner(System.in);
		System.out.println("please enter initial heap size then data  :");
        int n = in.nextInt();
        int a[] = new int[n];
        PriorityQueue<Integer> ascend = new PriorityQueue<Integer>();
        PriorityQueue<Integer> descend = new PriorityQueue<Integer>(Comparator.reverseOrder());
       double median;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
      
            if(!descend.isEmpty() && a[a_i] <= descend.peek()){
            	descend.add(a[a_i]);
                }
            else{
            	ascend.add(a[a_i]);
            	}
         
            while(descend.size() > ascend.size())
            {
            	ascend.add(descend.remove());
            }
            while(ascend.size() - descend.size() > 1){
            	descend.add(ascend.remove());
            }
            if(descend.size() == ascend.size()){
            	median =(double)(descend.peek()+ascend.peek())/2;
            }
            else{
            	median =ascend.peek();
            }
            
            System.out.println("median"+median);


        }
     
      
        
	

	}

}
