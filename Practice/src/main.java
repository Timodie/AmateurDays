import java.util.Map;
import java.util.Set;
import java.awt.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class main {
	
	
	public static void checkDup(int [] word){
		//char [] wordArray = word.toCharArray();
		
		Map<Integer,Integer>map = new HashMap<Integer,Integer>();
		for(int ch: word){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}
			else{
				map.put(ch, 1);
			}
		}
		Set<Integer>dup = map.keySet();
		
	for(int ch : dup){
	if(map.get(ch)==1){
			System.out.println(ch+"....."+map.get(ch));
		//}
	}
	}
	
		
	}
	public static int printRange(int n, int m){
	int count =0;
		for(int i =n; i <= m; i++){
		count++;
			System.out.println("i is :"+i);
	}	
		return count;
	}
	
	public static long fact1(long n){
		if(n==0){
			return n;
		}
		if (n==1){
			return n;
		}
		return n*(fact1(n-1));
	}
	
//	public int singleNumber(final List <Integer> a) {
//	    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//	    for(int i =0; i < a.size(); i++){
//	        if(map.containsKey(a.get(i))) {
//	           
//	        	map.put(a.get(i),map.get(a.get(i))+1);
//	        }
//	        else{
//	        	map.put(a.get(i));
//	        }
//	    }
//	    Set<Integer> set = map.keySet();
//	    for(int i : set){
//	        if(i==1){
//	            return(map.get(i));
//	        }
//	    }
//	}
	public static boolean isUniqueChars(String str) {
	    if (str.length() > 256) { // NOTE: Are you sure this isn't 26?
	        return false;
	    }
	    int checker = 0;
	    for (int i = 0; i < str.length(); i++) {
	        int val = str.charAt(i) - 'a';
	        if ((checker & (1 << val)) > 0) return false;
	        checker |= (1 << val);
	    }
	    return true;
	}
	@SuppressWarnings("unchecked")
	public static void removeDup(String word){
	 String [] str = word.split("");
	 Set mySet = new HashSet();
	 Collections.addAll(mySet, str);
	 System.out.println(mySet);
	 
	}
	public static int gcd(int a, int b){
		int temp =1;
		while(b!=0){
			temp =a;
			b = a%b;
			a =b;
		}
		return temp;
	}
	
	public static void main(String [] args){
		int [] arr = {723, 256, 668, 723, 140, 360, 597, 233, 128, 845, 737, 804, 986, 701, 906, 512, 845, 510, 510, 227, 430, 701, 366, 946, 464, 619, 946, 627, 209, 771, 424, 555, 959, 711, 530, 937, 716, 261, 505, 658, 706, 140, 511, 277, 396, 233, 819, 196, 475, 906, 583, 261, 147, 658, 517, 197, 196, 702, 944, 711, 128, 555, 149, 483, 530, 291, 716, 258, 430, 464, 601, 749, 149, 415, 802, 573, 627, 771, 660, 601, 360, 986, 291, 51, 415, 51, 227, 258, 937, 366, 923, 669, 33, 517, 417, 702, 475, 706, 110, 417, 275, 804, 500, 473, 746, 973, 669, 275, 973, 147, 817, 657, 277, 923, 144, 660, 197, 511, 793, 893, 944, 505, 322, 817, 586, 512, 322, 668, 33, 424, 962, 597, 144, 746, 345, 753, 345, 269, 819, 483, 368, 802, 573, 962, 583, 615, 208, 209, 269, 749, 256, 657, 619, 893, 959, 473, 753, 299, 396, 299, 500, 368, 586, 110, 793, 737, 615};
		int num =0;
		for(int i =0; i<arr.length; i++){
			num ^=arr[i];
		}
		long n = fact1(101);
		System.out.println("fact is:"+n);
//		int m = fact1(11+1)+ (11+1);
//		int count =printRange(n,m);
//		System.out.println("count is"+count);
		//System.out.println("num is"+num);
		//System.out.println(fact1(5));
		
		checkDup(arr);
		//removeDup("timothy");

}
}