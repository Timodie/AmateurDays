import java.util.*;

public class MinHeapDriver {

	
	public static void main(String[] args) {
		// provide input stream where we will compute 
		//median on the fly
		System.out.println("executing....");
		Scanner in = new Scanner(System.in);
		System.out.println("please enter initial heap size then data  :");
        int n = in.nextInt();
        int a[] = new int[n];
        MinHeap heap = new MinHeap();
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            
            heap.add(a[a_i]);
            try {
            	//heap.printHeap();
				System.out.println( heap.median());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        heap.printHeap();
      
        
	}

}
