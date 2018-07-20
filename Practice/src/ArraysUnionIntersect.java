import java.util.*;

public class ArraysUnionIntersect {
	
	public void intersectSorted(int [] arr1,int [] arr2 ){
		System.out.println("executing ...");
		
		
		
		int j =0;
		for(int i=0; i<arr1.length; i++){
			
			if(arr1[i]==arr2[j]){
				System.out.println("dup found"+arr1[i]);
				if(j+1<arr2.length){
					j++;
				}
			}
			else if(arr2[j] < arr1[i]){
				if(j+1 < arr2.length){
					//j++;
				}
			}
		}				
	}
	  public static int[] arrayLeftRotation(int[] arr, int n, int k) {
		// no.s rotated
		  int i =0; int j =0; int z=0;
		  while( j <k){
		  //main rotation
		  z = arr[0];
		  while(i +1 < arr.length){
			  arr[i] = arr[i+1];
			  i++;
		  }
	      arr[arr.length-1] = z;
		  j++;
		  i=0;
		  }
	    return arr;
	  }   
		    
		  
			
	
	public static void main(String [] args){
		ArraysUnionIntersect sort = new ArraysUnionIntersect();
		
		int [] arr1 ={1,2,3,4,4,5,6,7,9,12,15,19,21};
		int [] arr2 ={-1,0,1,12,15,19};
		
		//sort.intersectSorted(arr1, arr2);
	
		int [] rot ={1,2,3,4,5,6,7,8,9};
		
		int [] result =arrayLeftRotation( rot, 5, 5 );
		for(int i=0; i< result.length; i++){
			System.out.println(result[i]);
		}
	}

}
