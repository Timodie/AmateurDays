import java.util.*;
public class ArwaRotate {

	public static <T> Set<List<T>> rotate(List<T> arr){
		Set<List<T>> rotated = new HashSet<List<T>>();
		
		
		int i =1;
		rotated.add(arr);
		while(true){
			List<T> rot = (List<T>) Rotation(arr.toArray(),i);
		
		if(rotated.add(rot)==false){
			break;
		}
		i++;
		}
		return rotated;
	}
	
	 public static <T> List<T> Rotation(T[] objects,  int k) {
			// no.s rotated
		 	List<T> roted = new ArrayList<T>();
			  int i =0; int j =0; T z;
			  while( j <k){
			  //main rotation
			  z = objects[0];
			  while(i +1 < objects.length){
				  objects[i] = objects[i+1];
				  i++;
			  }
		      objects[objects.length-1] = z;
			  j++;
			  i=0;
			  }
			 
			  for(int x =0; x<objects.length;x++){
					roted.add(x, objects[x]);
				}
		    return roted;
		  }   
	
	public static void main(String [] args){
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(0, 1);
		arr.add(1,2);
		arr.add(2,1);
		arr.add(3,2);
	
		System.out.println(rotate(arr).size());
		System.out.println();
		int j =0;
		for(List<Integer> lists: rotate(arr)){
			System.out.println("list "+j+" has:");
			for(int i =0; i<lists.size();i++){
				
				System.out.println(lists.get(i));
				
			}
			j++;
		}
		
	}
}
