
public class GoogleAssessment {
	
	
	public static void biggestAverage(int number){
		String str = Integer.toString(number);
		int i =0;
		int min =0;
		int max =0;
		int avg =0;
		while(i < str.length()){
			
			if(i +1 < str.length()){
				String curr ="";
				String mcurr="";
				
				curr+=str.charAt(i);
				mcurr+=str.charAt(i+1);
				min = Integer.parseInt(curr);
				max = Integer.parseInt(mcurr);
				avg =Math.max(avg, (min+max)/2);
								
			}
		}
	System.out.println("biggest average is"+avg);
		
	}
	
	 public static int solution(int X) {
	        // write your code in Java SE 8
	        String str = Integer.toString(X);
	        if(str.length() ==1){
	            return X;
	        }
	        int nStr =X;
	        int i =0;
	        int min =0;
	        int max =0;
			int avg =0;
			while(i < str.length()){
			    if(i +1 < str.length()){
			    String curr =""+str.charAt(i);
			    String mcurr =""+str.charAt(i+1);
			   
			    min = Integer.parseInt(curr);
			    max = Integer.parseInt(mcurr);
			   if(min < max){
			    avg = (int)(min +max)/2;
			    avg = Math.max(avg,(int)Math.ceil(avg));
			}
			 String big = Integer.toString(avg);
			  nStr =Integer.parseInt(str.substring(0,i)+big+str.substring(i,str.length()-1));
			    }
			    	i++;
			  
			}
		  // String nStr =str.substring(0,i)+big+str.substring(i,str.length()-1);

			return nStr;
			
	    }
	
	
	public static void main(String [] args){
		
		
		
		System.out.println(Math.round(5/2));

		//biggestAverage(5467);
		
		System.out.println(5/2);
		
	}

}
