import java.util.*;
public class StringPermutation {

	public static void permutation(String prefix,String str){
		System.out.println(prefix);
		
		int n = str.length();
		if(n ==0){
			//System.out.println(prefix);
		}
		else{
			System.out.println(prefix);

			for(int i=0; i<n; i++){
				
				permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1, n));
				//System.out.println(prefix+str.charAt(i));
				//System.out.println(str.substring(0,i)+str.substring(i+1, n));
				//System.out.println(prefix);

			}
		}
	}
	
	
	public static void main(String [] args){
		
		
		//permutation("timothy","");
		int [] myarr = {3,3,5,5,5,5,7,7,8,9};
		int result =0;
		for(int i =0; i<myarr.length;i++){
			result =result^myarr[i];
		}
	System.out.println(result);
	}
}
