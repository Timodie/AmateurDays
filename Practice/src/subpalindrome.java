import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public class subpalindrome {
	
	String [] pal = new String[100];
	


	
	public static int  subPalindrome (String str){
		str=str.toLowerCase();
		Map<String,Integer>map = new HashMap<String,Integer>();
		int length = str.length();
		int count = 0;
		
		for(int i = 0; i < str.length(); i++){
			if(!Character.isLetter(str.charAt(i))){
				str = str.replace(str.charAt(i)+"", "");
			}
		}
		
		for(int i=0; i<(str.length()-1); i++){
			
			for(int j=i; j<str.length(); j++){
				String tmp = str.substring(i,j);
				
				if(tmp!=" "){
					
					if(isPalindrone(tmp)){
						if(!map.containsKey(tmp)){
							map.put(tmp, 1);
							count++;
						}
						
					}
					
				}
			}
			
		}
			
		return count;
	
	}
	
	
	
	public static boolean isPalindrone(String str){
		int n =str.length();
		for(int i=0; i <n/2; i++){
			
			if(str.charAt(i)!= str.charAt(n -i -1)){
				return false;
			}
		}
		return true;
	}
	public static boolean recisPalindrone(String str,int i,int n){
		
		if(n==0){
			return false;
		}
		if(str.charAt(n)!=str.charAt(n-i-1)){
			return false;
		}
		return true;
	}


    public static void main(String[] args){
    		//System.out.println(subPalindrome("A but tuba."));
  		
    		String pal ="aabbb";
    		String pal2 ="race car";
    		String nospace = pal2.split(" ").toString();
    		System.out.println(nospace);
    		System.out.println(isPalindrone(pal2));
    		System.out.println(recisPalindrone(pal,0,pal.length()-1));
  		System.out.println(isPalindrone(pal));
 }

}
