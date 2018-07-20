import java.util.*;

public class KnapSnack {
	
	/*
	 * We given M[w,j] = max(M[w,j-1], wj+M[w-wj,j-1]
	 * 
	 * --include defined below corresponds to wj +M[w-wj,j-1] 
	 * --dinclude defined below corresponds to M[w,j-1]
	 * 
	 * w - values to target i.e 0-12 since we are trying to 
	 * find the values in the sack that add up closest to the target(12)
	 * 
	 * j - corresponds to values from the sack i.e 2,3,5,6 in 
	 * discussion question 1
	 * 
	 * pointers are the values that led to the number closest to target
	 */

	public static List<Integer>  solved(int [] sack,int target ){
		//matrix for computation of values
		int [][]  matrix = new int[sack.length+1][target+1];
		
		
		int [][] pointers = new int[sack.length+1][target+1];
		
		// the values that add up closest to target 
		//will be stored and returned here, we don't know how many so array list is best
		List<Integer>answers = new ArrayList<Integer>();
		//we skip first row(j=0) because it's all zeroes anyways
		//outer loop for rows i.e. 2 3 5 6 in discussion question 1
		for(int j =1; j<matrix.length;j++){
		
		//inner loop for 0 -> target i.e 0 -12
		for(int w =0; w<matrix[j].length; w++ ){
			//include corresponds
			//if we have to look out of bounds in calculating a cell value 
			//then include will just remain -1
			int include  = -1;
			 
			int dinclude = matrix[j-1][w];
			
			int wj       = sack[j-1];
			
			if(( w - wj) > 0 ){
				include  = wj +matrix[j-1][w-wj];
			}
			
			int maxVal = Math.max(dinclude,include);
			matrix[j][w] =maxVal;
			// now we populate pointers array, 
		
			if( maxVal == dinclude){
				pointers[j][w] = w;
			}
			else{
				pointers[j][w] =w-wj;
			}
		}
		}
		//This is 11 in our case
		System.out.println("answer is"+matrix[sack.length][target]);
		
		//now we use our pointers to find which numbers led to
		// the answer
		int w =target;
		
	
		for(int j =sack.length; j>=1; j--){
			
			int wj = sack[j-1];
			if(pointers[j][w] == w){
				System.out.println("dont incldue:"+ wj);
			}
			else{
				System.out.println("include:"+wj);
				answers.add(wj);
				w = pointers[j][w];
			}
			
		}
		
		return answers;
	}
		public static void main(String [] args){
			
			int[] myarr = {2,3,5,6};
			int target =12;
			List<Integer>solution = solved(myarr,target);
			//feel free to print solution to check
			
		}
	
}
