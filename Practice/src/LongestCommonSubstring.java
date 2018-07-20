import java.util.*;


public class LongestCommonSubstring {

	int maxlength;
	String longestSub;
	
	public LongestCommonSubstring (String str1,int length){
		this.maxlength =length;
		this.longestSub =str1;
		
	}
	public String getString(){
		return longestSub;
	}
	public int getLength(){
		return maxlength;
	}
	public static LongestCommonSubstring findLCS(String str1, String str2){
		
		int max=0;
		StringBuilder answer = new StringBuilder();
		
		int [][] matrix = new int[str1.length()+1][str2.length()+1]; 
		
		for(int i =1; i<=str1.length();i++){
			for(int j =1; j<= str2.length();j++){
				
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					answer.append(str1.charAt(i-1));
					matrix[i][j]= matrix[i-1][j-1]+1;
					
					max = Math.max(max, matrix[i][j]);
					//last =i;
					//last-max, last
				}
				
			}
		}		
		return new LongestCommonSubstring(answer.toString(),max);
	}
	
	  public static int longestCommonSubstring(char str1[], char str2[]){
	        int T[][] = new int[str1.length+1][str2.length+1];
	    	StringBuilder answer = new StringBuilder();
	        int max = 0;
	        for(int i=1; i <= str1.length; i++){
	            for(int j=1; j <= str2.length; j++){
	                if(str1[i-1] == str2[j-1]){
	                    T[i][j] = T[i-1][j-1] +1;
	                   answer.append(str1[i-1]);
	                    if(max < T[i][j]){
	                        max = T[i][j];
	                    }
	                }
	            }
	        }
	        System.out.println(answer);
	        return max;
	    }
	
	
	public static void main(String  []  args){
		
		String str1 ="timohhhhhhhhhy";
		String str2 = "zzzzzzzzzzzzzzzzztimkkkk";
		
		//longestCommonSubstring(str1.toCharArray(),str2.toCharArray());
		
		
		System.out.println(findLCS(str1,str2).getLength());
		System.out.println(findLCS(str1,str2).getString());
	}
}
