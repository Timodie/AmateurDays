import java.util.*;

public class HashMapQuestions {
	
	 public static void leastChar(String str){
		 
		 Map<Character,Integer> least = new HashMap<Character,Integer>();
		 
		 for(int i =0; i< str.length();i++){
			 
			 if(least.containsKey(str.charAt(i))){
				 least.put(str.charAt(i), least.get(str.charAt(i)+1));
			 }
			 else{
				 least.put(str.charAt(i),0);

			 }
		 }
		Set<Character>keySet = least.keySet();
			 for(Character c : keySet){
				 if(least.get(c)!=null){
				 if(least.get(c)==0){
					System.out.println("Single characters are "+c);
 
				 }
			 }
			 }
		
	 }
	
	
	
	
	
	
	
	
	public static void main(String [] args){
	String str1= "timothy";	
	leastChar(str1);
	}

}
