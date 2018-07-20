import java.util.*;

public class MaxSubSum {

	public static int maxSubSum(int [] arr){
		
		//arr of length 1
		if(arr.length == 1){
			return Math.max(arr[0], 0);
		}
		if(arr.length == 0){
			return 0;
		}
		int mid = arr.length/2;
		//Divide and conquer
		//int [] leftSub  = subArray(0,mid,arr);
		//int [] rightSub =subArray(mid+1,arr.length-1,arr);
		int leftMaxSum  = maxSubSum(Arrays.copyOfRange(arr, 0, mid));
		int rightMaxSum =maxSubSum(Arrays.copyOfRange(arr, mid, arr.length-1));
		int sum =0;
		int leftPrime =0;
		int rightPrime =0;
		for(int i=mid-1;i >0; i-- ){
			sum+= arr[i];
			leftPrime = Math.max(sum, leftPrime);
		}
		sum =0;
		for(int i=mid; i < arr.length; i++){
			sum+=arr[i];
			rightPrime =Math.max(sum, rightPrime);
		}
		int leftRightMax = Math.max(leftMaxSum, rightMaxSum);
		int LeftRightPrimeMax =leftPrime+rightPrime;
		
		return Math.max(Math.max(leftMaxSum,rightMaxSum),LeftRightPrimeMax);
		
	}
	//to create a subArray
	public static int [] subArray(int i, int j,int [] arr ){
		int [] subArray = new int[j-i+1];
		int sub =0;
		for(int start =i; start<=j; start++){
				subArray[sub]=arr[start];
				sub++;
			}
		
		return subArray;
	}
	
	public static void main(String []args){
		int [] myarr ={1,2,3,4,5,7,9};
		//int[] subd =subArray(0,myarr.length/2,myarr);
		int [] arr =subArray(0,myarr.length/2,myarr);
		
		for(int i=0; i<arr.length;i++){
		//	System.out.println(arr[i]);
		}
		//System.out.println(subd.length);
	   maxSubSum(myarr);
	//	System.out.println(Math.max(Math.max(3,4), 0));
	}
}
