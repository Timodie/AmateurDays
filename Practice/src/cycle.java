import java.util.*;
public class cycle {

	 
	
	     Map<ListNode,Integer> map = new HashMap<ListNode,Integer>();
	 	public ListNode detectCycle(ListNode a) {
	 	    ListNode fast =a;
	 	    ListNode slow =a ;
	 	    slow.next =a;
	 	    fast.next = a.next;
	 	   
	 	    while(slow!=fast && fast.next!=null){
	 	       
	 	        if(map.containsKey(slow)){
	 	            map.put(slow,map.get(slow)+1);
	 	        }
	 	        else{
	 	            map.put(slow,0);
	 	        }
	 	         slow = slow.next;
	 	    }
	 	    Set<ListNode>visit = map.keySet();
	 	    for(ListNode i : visit){
	 	        if(map.get(i)>1){
	 	           // System.out.println(map.get(i));
	 	           // return null;
	 	        }
	 	    }
	 	  
	 	    
	 	    return null;
	 	    
	 	}
	 }


