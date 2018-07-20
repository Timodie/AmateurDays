import java.util.*;
import java.math.*;
public class KadaneAlgorithm {

	public static int maxSubSequence(int [] arr){
		int max = arr[0];
		
		int curr = arr[0];
		
		for(int i=1; i <arr.length; i++){
			System.out.println(arr[i]);
			curr =Math.max(arr[i],curr+arr[i]);
			
			max =Math.max(curr, max);
		}
		
		return max;
		
	}
	
	public static int recMaxSubSum(int [] arr,int i,int curr,int max){
		if(i <0){
			return max;
		}
		curr = Math.max(arr[i], curr+arr[i]);
		max = Math.max(curr, max);
		return recMaxSubSum(arr,i-1 ,curr,max);
		
	}
	
	public static void main(String [] args){
		//System.out.println("printing ...");
	
		int [] arr ={ 1, -3, 2, 5, -5, 5, 1};
		//
		Arrays.sort(arr);
		System.out.println(maxSubSequence(arr));
		
		//System.out.println(recMaxSubSum(arr,arr.length-2,arr[arr.length-1],arr[arr.length-1]));
	}

}
