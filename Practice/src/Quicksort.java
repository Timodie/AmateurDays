
public class Quicksort {

	 private int[] array;
	    private int[] tempMerg;
	    private int length;
	 
	    public static void main(String a[]){
	         
	        int[] inputArr = {89,45,23,11,89,999,1,0};
	        Quicksort mms = new Quicksort();
	        mms.sort(inputArr);
	        for(int i:inputArr){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	    }
	    public void sort(int inputArr[]) {
	    	this.array = inputArr;
	    	this.length = inputArr.length;
	    
	    	doQuickSort(0,length-1);
	    }
	    
	    public void doQuickSort(int low, int high){
	    	int i =low;
	    	int j = high;
	    	int pivot =array[low+(high-low)/2];
	    	while( i <= j){
	    		while(array[i] < pivot){
	    			i++;
	    		}
	    		while(array[j] > pivot){
	    			j--;
	    			
	    		}
	    		if(i <= j){
	    			swap(i,j);
	    			i++;
	    			j--;
	    		}
	    		if(low < j){
	    			doQuickSort(low,j);
	    			
	    		}
	    		if(i < high){
	    			doQuickSort(i,high);
	    		}
	    	}
	    }
	    public void swap(int i , int j){
	    	int temp = array[i];
	    	array[i] = array[j];
	    	array[j] =temp;
	    }
}
