import java.util.*;

public class MinimumWindow {
	
	public static String minWindow(String bigger, String small){
		//check edge case empty string
		if(small.length() > bigger.length()){
			return "none";
		}
		String result="none";
		//build counter for small
		HashMap<Character,Integer>smap = new HashMap<Character,Integer>();
		for(int i =0; i< small.length(); i++){
			char curr = small.charAt(i);
			if(smap.containsKey(curr)){
				smap.put(curr,smap.get(curr)+1);
			}
			else
			{
			smap.put(curr,1);
		}
		}
		
		//build a counter for bigger(mainly common chars)
		HashMap<Character,Integer>bmap = new HashMap<Character,Integer>();
		int left =0;
		int minLen = bigger.length()+1;
		int count =0; // total mapped chars
		
		for(int i=0; i< bigger.length(); i++){
			char curr = bigger.charAt(i);
			if(smap.containsKey(curr)){
				if(bmap.containsKey(curr)){
					if(bmap.get(curr) < smap.get(curr)){
						count++;
					}
					bmap.put(curr, bmap.get(curr)+1);
				}
				else{
					bmap.put(curr,1);
					count++;
				}
			}
			
			if(count == small.length()){
				char c =bigger.charAt(left);
				while(!bmap.containsKey(c) || bmap.get(c) > smap.get(c)){
					if(bmap.containsKey(c) && bmap.get(c) > smap.get(c)){
						bmap.put(c,bmap.get(c)-1);
						left++;
						c =bigger.charAt(left);
					}
					if(i -left +1 < minLen){
						result= bigger.substring(left, i);
						minLen = i -left+1;
					}
				}
			}
		}
		
		return result;
	}
	
	
	
	public static void main(String [] args){
		System.out.println("executing ...");
		System.out.println(minWindow("this is a test string","tist"));
	}

}
