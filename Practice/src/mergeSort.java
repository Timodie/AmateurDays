
public class mergeSort {
     
    private int[] array;
    private int[] tempMerg;
    private int length;
 
    public static void main(String a[]){
         
        int[] inputArr = {89,45,23,11,89,999,89,-90};
        mergeSort mms = new mergeSort();
        mms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
     
    public void sort(int inputArr[]) {
    	this.array = inputArr;
    	this.length = inputArr.length;
    	tempMerg = new int[length];
    	doMergeSort(0,length-1);
    }
 
    private void doMergeSort(int low, int high) {
         if(low < high){
        	 int mid = low + (high - low)/2;
        	 
        	 doMergeSort(low,mid);
        	 
        	 doMergeSort(mid+1,high);
//        	 System.out.println(high);
//        	 System.out.println(mid);
//        	 System.out.println(low);
        	 mergeParts(low,mid,high);
         }
        
    }
 
    private void mergeParts(int low, int mid, int high) {
    	for(int i = low; i<= high; i++){
    		tempMerg[i] = array[i];
    	}
    	int i =low;
    	 int j =mid+1;
    	 int k = low;
    	 while( i <= mid && j <= high){
    		 if(tempMerg[i] <= tempMerg[j]){
    			 array[k] =tempMerg[i];
    			 i++;
    		 }
    		 else{
    			 array[k] = tempMerg[j];
    			 j++;
    		 }
    		 k++;
    	 }
    	 int rem = mid -i;
//    	 while(i < mid){
//    		 array[k] = tempMerg[i];
//    		 k++;
//    		 i++;
//    	 }
    	 for(int x=0; x< rem; x++){
    		 array[i+x] =tempMerg[i+x];
    	 }
    	}
    
    
}
