
public class UniqueChars {

	
	public static void main(String [] args){
		String word = "abcded";
		uniqueChar(word);
		longestSubStringUnique(word);
	}
	static void uniqueChar(String words){
		boolean [] asci = new boolean[256];
		System.out.println(asci[0]);
		for(int i =0; i < words.length(); i++){
			if(asci[words.charAt(i)] ==true){
				
				System.out.println("Dup found: "+words.charAt(i));
			}
			asci[words.charAt(i)]=true;
		}
	}
	
	static void longestSubStringUnique (String words){
		boolean [] asci = new boolean [256];
	int i =0; int max =0;
	for(int j =0; j< words.length(); j++){
		int k =0;
		while(asci[words.charAt(i)]==true & k <2){
			//we only enter this while loop if we notice dups
			//mark them as false so we can begin counting again
			asci[words.charAt(i)]=false;
			k++;
			i++;
		}
		//we've either broken outta while and we're counting a new seq
		//or we're marking chars fresh
		asci[words.charAt(j)]=true;
		max = Math.max(j-1+1, max);
		
	}
	System.out.println("Longest sub :"+max);
	
	}
	
}
