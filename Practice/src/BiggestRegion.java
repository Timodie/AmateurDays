import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BiggestRegion {

	 public static int getBiggestRegion(int[][] matrix) {
		 int biggest =0;	
		 for(int row =0; row<matrix.length; row++){
			 for(int col =0; col < matrix[row].length; col++){
				 
				 if(matrix[row][col] == 1){
					 biggest = Math.max(biggest,biggestHelper(matrix,row,col,0)) ;
				System.out.println(Arrays.deepToString(matrix));	 
				}
			 }
		 }
		 
		 return biggest;
	 }		 
	 
	static int biggestHelper(int [][] mat, int row,int col,int id){
		 
		if(mat[row][col] == 0) return 0;
		
			mat[row][col] =id;
			int result=1;
			
		if(row-1 >= 0 && col-1 >=0 ){
		 result+=biggestHelper(mat,row-1,col-1,id);
		 }
		if(row-1 >=0 && col<mat[0].length){
			result+=biggestHelper(mat,row-1,col,id);
		 }
		if(row-1 >= 0 && col+1 < mat[0].length){
	
		result+=biggestHelper(mat,row-1,col+1,id);
			}
		if( col-1 >=0 ){
			result+=biggestHelper(mat,row,col-1,id);
		}
		if( col+1 < mat[0].length){
			result+=biggestHelper(mat,row,col+1,id);
		}
		if(row+1 < mat.length && col+1 < mat[0].length){
			 result+=biggestHelper(mat,row+1,col+1,id);
		
		 }
		if(row +1 < mat.length && col-1 >=0){
			result+=biggestHelper(mat,row+1,col-1,id);
		}
		if(row+1 < mat.length ){
			result+=biggestHelper(mat,row+1,col,id);
		}		
		 return result;
	 }
	
	 static int highestId(int [][] matrix, int id){
		 int max =0;
		 HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		 for(int row =1; row<matrix.length; row++){
			 for(int col =1; col < matrix[row].length; col++){
				 if(map.containsKey(matrix[row][col])){
					 map.put(matrix[row][col], map.get(matrix[row][col])+1);
					 
				 }
				 else{
					 map.put(matrix[row][col], 0);
				 }
			 }
		 }
		 for(Integer key : map.keySet()){
			 System.out.println(key +"..."+map.get(key));
		 }
		 
		 
		 
		 return max;
	 }
	    
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int grid[][] = new int[n][m];
	        for(int grid_i=0; grid_i < n; grid_i++){
	            for(int grid_j=0; grid_j < m; grid_j++){
	                grid[grid_i][grid_j] = in.nextInt();
	            }
	        }
	        System.out.println(getBiggestRegion(grid));
	    	
	    	
	    	
	    }

}
