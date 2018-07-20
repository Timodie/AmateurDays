import java.util.Stack;

public class stackPractice {

	public static boolean isInteger(String s){
		   try { 
		        Integer.parseInt(s); 
		    } catch(NumberFormatException e) { 
		        return false; 
		    } catch(NullPointerException e) {
		        return false;
		    }
		    // only got here if we didn't return false
		    return true;
	}
	public static boolean isOperator(String s){
		if(s=="+"||s=="-"||s=="*"||s=="/"){
			return true;
		}
		return false;
	}
	
	public static int reversePolish(String [] tokens){
	
		Stack<Integer> operand = new Stack<Integer>();
		//String  [] operators = {"+","-","*","/"};
	int x=0;
	int y=0;
	int result =0;
		for(String t : tokens){
			
			if(isOperator(t) && operand.size()>=2){
				
				x =operand.pop();
				 y=operand.pop();
				 result =eval(t,x,y);
				 operand.push(result);
			}
			
//			else if(operand.size()==1){
//				
//			    result=operand.pop();
//			}
		
			
			else{
				operand.push(Integer.parseInt(t));	
			}
			if(tokens.length==1 ){
				if(isInteger(tokens[0])){
					result =Integer.parseInt(tokens[0]);
				}
			}
		//System.out.println(operand.size());
		}
		
		return result;
	}
	public static int eval(String t,int x,int y){
	int result =0;	
	switch(t){
	case "+": 
		result=x+y;
		break;
	case "-":
		result=y-x;
		break;
	case "/":
		result=y/x;
		break;
	case "*":
		result=x*y;
		break;
	}
		return result;
	}
	public static void PrintPrimeFactors(int num) { 
		if(isPrime(num)) { 
			System.out.print(num + " "); 
		}else{ 
		for(int i=2; i < Math.sqrt(num); i++) { 
		if(num%i ==0) { 
		PrintPrimeFactors(i); 
		PrintPrimeFactors(num/i); 
					}
			} 
			} 
			} 
		public static boolean isPrime(int n) { 
		if (n < 2) {
		return false;
		} 
		if(n % 2 == 0){ 
			return (n == 2);
			} 
		for(int i=3; i*i<=n; i+=2){
		if(n % i == 0){ 
			return false;
			}
		
		}
		 return true;
		}
		static void primeFactors(int n)
		{
		    // Print the number of 2s that divide n
		    while (n%2 == 0)
		    {
		        System.out.println(2);
		        n = n/2;
		    }
		 
		    // n must be odd at this point.  So we can skip one element (Note i = i +2)
		    for (int i = 3; i <= Math.sqrt(n); i = i+2)
		    {
		        // While i divides n, print i and divide n
		        while (n%i == 0)
		        {
		            System.out.println( i);
		            n = n/i;
		        }
		    }
		 
		    // This condition is to handle the case whien n is a prime number
		    // greater than 2
		    if (n > 2)
		        System.out.println(n);
		}
	static void prime(int n){
		if( n <= 1) return;
		int d =2;
		while(n %d !=0){
			d++;
			if(d *d > n) d =n;
			}
		System.out.println(d);
		prime(n/d);
	return;	
	}
	static char charAt(String w , int i) throws Exception{
		if(w.length() == 0){
			throw new Exception("Empty string");
		}
		else if(i == w.length()-1){
			return w.charAt(w.length()-1);
		}
		return 0;
	}
		
		
		


	
	
	
	public static void main(String [] args){
		String [] numbers ={"2","3","-","4","-"};
		//System.out.println(reversePolish(numbers));
		//primeFactors(27);
		prime(27);
	}

}
