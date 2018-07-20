import java.util.*;

public class ArwaShingles {
	
	public static Set<String> shingles(List<String> words, int slength){
		
		Set<String>shingle = new HashSet<String>();
		int i =0;
		while( i+slength-1< words.size()){
			   
			String arwa =words.get(i);
				int k =1;			
				while(k <slength ){
				 if(i+k < words.size()){
					arwa+=words.get(i+k);
					
					}	
				 k++;
				}
				shingle.add(arwa);
				i++;
		}				
		
		return shingle;
	}
	
	
	
	
	public static void  main (String [] args){
		System.out.println("printing");

		List<String> newList = new ArrayList<String>();
//		newList.add("it");
//		newList.add("is");
//		newList.add("very");
//		newList.add("cold");
//		newList.add("outside");
//		newList.add("now");
//		newList.add("arwa");
//		newList.add("farrag");
//		newList.add("egypt");
//		newList.add("ny");
		//System.out.println("printin");

		Set<String>solution = shingles(newList,4);
		//System.out.println("printin");


		
		for(String s :solution){
			
			System.out.println(s.toString());
		}
		
	}

}
