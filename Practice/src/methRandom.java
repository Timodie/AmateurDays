/**
 * 
 */

/**
 * @author Tim
 *
 */
public class methRandom {

	/**
	 * @param args
	 */
	
	public static int [] merge(int [] a,int [] b){
	int [] merged = new int[a.length+b.length];	
	int i =0; int j=0; int k=0;
	
	while(i <a.length && j < b.length){
		if(a[i] < b[j]){
			merged[k]=a[i];
			i++;
		}
		else{
			merged[k] = b[j];
			j++;
		}
		//i++;	
		k++;	

	}
		while(i < a.length){
			merged[k] = a[i];
			k++;
			i++;
		}
	
	
			while(j < b.length){
				merged[k] = b[j];
				k++; 
				j++;
		}
	
	
	return merged;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,3,5,7,7,7,9,11,12};
		int [] b = {2,4,6,8,10,12,13,14};
		int []m = merge(a,b);
		for(int i =0; i < m.length; i++ ){
			System.out.print(m[i]+ " ");
		}

	}

}
