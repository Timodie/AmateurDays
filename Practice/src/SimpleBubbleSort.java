import java.util.Scanner;

public class SimpleBubbleSort {
	
	public static void bubbleSort(int [] arr)
    {
        int numOfSwaps =0;
    for(int i =0; i < arr.length;i++)
    {
        for(int j =0; j<arr.length-1 ; j++){
            
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
               
                arr[j]= arr[j+1];
                arr[j+1] =temp;
                numOfSwaps++;
            }
        }
        if(numOfSwaps == 0){
            break;
        }
    }
    
        System.out.println("Array is sorted in "+numOfSwaps+" "+"swaps.");
        System.out.println("First Element: "+ ""+arr[0]);
        System.out.println("Last Element:"+" "+arr[arr.length-1]);
        
    }

    public static void main(String[] args) {
        System.out.println("execting ...");
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        bubbleSort(a);
    }
	

}
