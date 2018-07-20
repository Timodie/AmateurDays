import java.util.*;
public class MergeSorter {

	/*
	 * create a temp array that we'll use all the time
	 * 
	 */
	static long inversions=0;
	public static void mergeSort(int [] arr){
		System.out.println("answer: "+mergeHelper(arr, new int[arr.length], 0, arr.length-1));;
	
	}
	public static long mergeHelper(int [] arr,int [] temp, int leftStart,int rightEnd){
		long count =0;
		if(leftStart >= rightEnd){
			return count;
		}
	

		int middle = (leftStart + rightEnd)/2;
		long a =0;
		long b=0;
		long c=0;
		a+=mergeHelper(arr,temp,leftStart,middle);
	
		b+=mergeHelper(arr,temp,middle+1,rightEnd);
	
		c +=mergeHalves(arr,temp,leftStart,rightEnd,count);
		//System.out.println("current count is:"+count);
		return a +b +c;
	}
	
	
	public static long mergeHalves(int [] arr,int [] temp, int leftStart,int rightEnd,long count){
	
		int leftEnd =(rightEnd+leftStart)/2;
		int rightStart = leftEnd+1;
		//for temp array
		int size = rightEnd - leftStart +1;
	
		int left =leftStart;
		int right = rightStart;
		int index =leftStart;
		
		//walk over two halves and copy over the two elements
		while(left <= leftEnd && right <= rightEnd){
//			 if(arr[left] == arr[right]){
//				inversions--;
//				//inversions
//				}
			if(arr[left] <= arr[right]){
				temp[index] = arr[left];
				left++;
			}
			else{
				temp[index] = arr[right];
				right++;;
				count += leftEnd -left+1;
			}
			index++;
			
			
		}
		
		while(left <= leftEnd){
			temp[index]= arr[left];
			index++;
			left++;
		}
		while(right <= rightEnd){
			temp[index] = arr[right];
			index++;
			right++;
		}
		
		
		System.out.println("count is "+count);
		System.arraycopy(temp, leftStart, arr, leftStart, size);
		return count;
	}
	
	public static void main(String [] args){
		int [] myarr ={2,1,3,1,2};
		//int [] myarr ={1,1,1,2,2};
		mergeSort(myarr);
		
		for(int i=0; i<myarr.length; i++){
			System.out.println(myarr[i]);
		}
		System.out.println("swaps:"+inversions);
	}

}
