import java.awt.List;
import java.util.*;;

/**
 * 
 */

/**
 * @author Tim
 *	Declaring private variables
 */ 
public class MinHeap {	
	private int capacity;
	private int size ;
	private int [] heapArray ;
	 ArrayList<Integer> heapList = new ArrayList<Integer>();
	
	private int getLeftChildIndex(int parentIndex){
			return 2* parentIndex+1;
	}
	private int getRightChildIndex(int parentIndex){
		return 2* parentIndex+2;
	}
	private int getParentIndex(int childIndex){
		return (childIndex-1)/2;
	}
	private boolean hasLeftChild(int index){
		return (getLeftChildIndex(index) < size);
	}
	private boolean hasRightChild(int index){
		return (getRightChildIndex(index) < size);
	}
	private boolean hasParent(int index){
		return (getParentIndex(index) >= 0);
	}
	private int leftChild(int index){
		return heapList.get(getLeftChildIndex(index));
	}
	private int rightChild(int index){
		return heapList.get(getRightChildIndex(index));
	}
	private int parent(int index){
		return heapList.get(getParentIndex(index));
	}
	private void swap(int indexOne, int indexTwo){
		
		int temp =heapList.get(indexOne);
		heapList.set(indexOne, heapList.get(indexTwo));;
		heapList.set(indexTwo, temp);
	}
	private void ensureCapacity(){
		if(size == capacity){
			heapArray = Arrays.copyOf(heapArray, capacity*2);
			capacity*=2;
		}
	
	}
	/**
	 * 
	 */
	public MinHeap() {
		
		this. capacity = 10;
		size = 0;
		heapArray = new int [capacity];
		heapList = new ArrayList<Integer>();
	}
	public int peek() throws IllegalStateException{
		if(size == 0) throw new IllegalStateException();
	
	return heapArray[0];
	}
	public int poll() throws IllegalStateException{
		if(size ==0){
			throw new IllegalStateException();
		}
		int item  = heapList.remove(0);
		heapList.set(0,heapList.get(size-1));;
		size--;
		heapifyDown();
		return item;
	}
	public void add(int item){
		//ensureCapacity();
		heapList.add(size, item);;
		size++;
		heapifyUp();
	}
	public void heapifyUp(){
		int index = size-1;
		while(hasParent(heapList.get(index)) && parent(index) > heapList.get(index)){
			swap(getParentIndex(index),index);
			index = getParentIndex(index);	
		}
	}
	public void heapifyDown(){
		int index = 0;
		// only checking for left cuz if there's no left then there's no right child
		while(hasLeftChild(index)){
		int smallerChildIndex = getLeftChildIndex(index);
		if(hasRightChild(index)){
			//smaller child should be smaller of the two
			smallerChildIndex = Math.min(getRightChildIndex(index),getLeftChildIndex(index));
		}
		//we are back in order
		if(heapList.get(index) < heapList.get(smallerChildIndex)){
			break;
		}
		else{
			swap(index, smallerChildIndex);
		}
		index = smallerChildIndex;
		}
		
	}
	public double median() throws Exception{
		//check for emptiness
		int [] sorted = new int [size];
		for(int i =0; i < size; i++){
			sorted[i] = heapList.get(i);
		}
		
		Arrays.sort(sorted);
		if(size ==0){
			throw new Exception();
		}
		if(size ==1){
			
			//System.out.println((double)sorted[0]);

			return (double)sorted[0];
		}
		if(size%2 != 0){
			//System.out.println("size uneven conditon");

			return (double)sorted[(size-1)/2];
		}if(size ==2){
			return (double) (sorted[0]+sorted[1])/2;
		}
		//System.out.println("even cond"+(sorted[(size-2)/2]+" "+ sorted[((size-1)/2)]));
		double evenMedian =  (double)(sorted[(size-2)/2] +sorted[size/2])/2;
		//System.out.println("size even conditon");

		
		return evenMedian;
	}
	public void printHeap(){
		String heap ="";
		for(int i =0; i<size; i++){
			heap+=heapList.get(i);
		}
		System.out.println("heap is"+heap);
	}
	/**
	 * @param args
	 */
	
}
