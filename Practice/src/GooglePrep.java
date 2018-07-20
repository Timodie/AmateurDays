import java.util.*;

public class GooglePrep {

	public static void majorityCharacterMap(String str){
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0; i<str.length(); i++){
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
				
			}
			else{
				map.put(str.charAt(i), 1);
			}
		}
		int max= 0;
		char majorChar =' ';
		for(Character j : map.keySet()){
			if(max < map.get(j)){
				majorChar =j;
				max =map.get(j);
			}
		}
		if(max > str.length()/2){
		System.out.println(max);
		System.out.println(majorChar);
		}
		else{
			System.out.println("NONE");
		}
	}
	
	public static void majorityCharacter(String str){
		//assume the first char you see the majority
		//you have counter set at 0
		//you store your supposes majority
		//if the character you see is not the supposesd majority
		// you decrement count
		//and keep moving
		//if ccount becomes 0,we've run out of majority char so set the curr char to majority
		//since the majority occurs over half the array, there should be enough on both sides
		//at the end of the loop,if count is >0 then we do have majority and we should return it
		char max = ' ';
		int count =0;
		for(int i =0; i< str.length(); i++){
			
			if(count ==0){
				max = str.charAt(i);
				count++;
			}
			if(str.charAt(i) == max){
				count++;
			}
			else{
				count--;
			}
			
		}
		if(count >0){
			System.out.println("majority is :"+max);
			System.out.println("frequency is :"+majorHelper(str,max));
		
		}
		else{
			System.out.println("none");
		}
		
	}
	static int majorHelper(String str, char max){
		int count =0;
		for(int i =0; i<str.length(); i++){
			if(str.charAt(i) == max){
				count++;
			}
		}
		return count;
	}
 static void pairsToTarget(int [] arr,int target){
	 HashSet<Integer>set = new HashSet<Integer>();
	 
	 for(int i =0; i<arr.length; i++){
		 set.add(arr[i]);
	 }
	 for(int j =0; j<arr.length; j++){
		 if(set.contains(target-arr[j])){
			 int pair = target-arr[j];
			 System.out.println("pair found :"+arr[j]+"..."+pair);
		 }
	 }
 }
 	static int smallestDiff(int [] arr1, int [] arr2){
 		//Greedy algorithm sort baby
 		Arrays.sort(arr1); Arrays.sort(arr2);
 		int a =0;
 		int b =0;
 		int diff = Integer.MAX_VALUE;
 		while(a < arr1.length && b < arr2.length){
 			//System.out.println("debug :"+Math.abs(arr1[a] - arr2[b]));
 			if(Math.abs(arr1[a] - arr2[b]) < diff){
 			diff = (Math.abs(arr1[a] - arr2[b]));
 			}
 			if(arr1[a]<arr2[b]){
 				a++ ;
 			}
 			else{
 				b++;
 			}
 		}
 		return diff;
 	}
	
 	public static void permuteString(char [] str, int i, int n){
 		if(i == n){
 			System.out.println(str);
 			}
 		else{
 			for(int j =i; j<n; j++){
 				swap(str, j ,i);
 				permuteString(str,i+1,n);
 				swap(str, j , i);
 			}
 		}
 	}

 	static void swap(char [] str, int i, int j){
 		char temp = str[i];
 		str[i] =str[j];
 		str[j] = temp;
 		
 	}
	
 	static int equIndex(int [] arr){
 		int leftsum =0;
 		int sum =0;
 		for(int i=0; i<arr.length; i++){
 			sum+=arr[i];
 		}
 		for(int j =0; j<arr.length; j++){
 			sum -= arr[j];
 			
 			if(leftsum == sum){
 				return j;
 			}
 			leftsum+=arr[j];
 		}
 		return -1;
 	}
 	
 	public static void constantDup1(int [] arr){
		//element must appear from 0 to n-1
		for(int i=0; i<arr.length; i++){
			if(arr[Math.abs(arr[i])] >= 0){
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			}
			else{
				System.out.println("Duplicate found :"+""+Math.abs(arr[i]));
			}
		}
	}
	
 	public static int thirdLargest(int [] arr){
 		int first =arr[0];
 		int sec =Integer.MIN_VALUE;
 		int third = Integer.MAX_VALUE;
 		for(int i=0; i<arr.length; i++){
 			if(arr[i] > first){
 				third =sec;
 				sec =first;
 				first = arr[i];
 			}
 			else if(arr[i] > sec){
 				third =sec;
 				sec= arr[i];
 			}
 			else if(arr[i] > third){
 				third = arr[i];
 			}
 			
 		}
 		
 		return third;
 	}
 	static void missingTwoElements(int [] arr){
 		int arrSum=0;
 		int n = arr.length+2;
 		for(int i=0; i<arr.length; i++){
 			arrSum+=arr[i];
 		}
 		//sum of missing intergers
 		int sumMissing = n*(n+1)/2 - arrSum;
 		int avg = sumMissing/2;
 		//find sum of elements greater than average
 		//and also find those less than
 		int smaller =0;
 		int greater =0;
 		for(int i =0; i<n-2; i++){
 			if(arr[i] <= avg){
 				smaller+=arr[i];
 			}
 				else{
 					greater+=arr[i];
 				}
 			}
 		int totalSmallerHalf =(avg *(avg+1))/2;
 		System.out.println(totalSmallerHalf -smaller);
 	
 		int right = (n*(n+1)/2)- totalSmallerHalf -greater;
 	System.out.println(right);	
 	}
 	static void missingTwoElementsBool(int [] arr){
 		boolean [] mark = new boolean[arr.length+1];
 		
 		for(int i =0; i<arr.length-2; i++){
 			mark[arr[i]] =true;
 		}
 		for(int j =1; j<=mark.length-1; j++){
 			//if(mark[j]){
 				System.out.println(mark[j]);
 			//}
 		}
 		
  	}
 	//Check if binary is balanced
 	private static class TreeNode{
 		public TreeNode(int i) {
			// TODO Auto-generated constructor stub
		}
		TreeNode left;
 		TreeNode right;
 		int data;
 	}
 	public boolean isBalanced(TreeNode root) {
 		return maxDepth(root) != -1;
 		}
 		private int maxDepth(TreeNode root) {
 		if (root == null) return 0;
 		int L = maxDepth(root.left);
 		if (L == -1) return -1;
 		int R = maxDepth(root.right);
 		if (R == -1) return -1;
 		return (Math.abs(L - R) <= 1) ? (Math.max(L, R) + 1) : -1;
 		}
 	
 		//convert sorted array into BST
 		public TreeNode sortedArrayToBST(int[] num) {
 			return sortedArrayToBST(num, 0, num.length-1);
 			}
 			private TreeNode sortedArrayToBST(int[] arr, int start, int end) {
 			if (start > end) return null;
 			int mid = (start + end) / 2;
 			TreeNode node = new TreeNode(arr[mid]);
 			node.left = sortedArrayToBST(arr, start, mid-1);
 			node.right = sortedArrayToBST(arr, mid+1, end);
 			return node;
 			}
 	
 			private ListNode list;
 			private TreeNode sortedListToBST(int start, int end) {
 			if (start > end) return null;
 			int mid = (start + end) / 2;
 			TreeNode parent = new TreeNode(list.val);
 			 			
 			TreeNode leftChild = sortedListToBST(start, mid-1);
 			parent.left = leftChild;
 			
 			list = list.next;
 			parent.right = sortedListToBST(mid+1, end);
 			return parent;
 			}
 			public TreeNode sortedListToBST(ListNode head) {
 			int n = 0;
 			ListNode p = head;
 			while (p != null) {
 			p = p.next;
 			n++;
 			}
 			list = head;
 			return sortedListToBST(0, n - 1);
 			}
 			//maximum path sum in btree
 			private int maxSum;
 			public int maxPathSum(TreeNode root) {
 			maxSum = Integer.MIN_VALUE;
 			//findMax(root);
 			return maxSum;
 			}
// 			private int findMax(TreeNode p) {
// 			if (p == null) return 0;
// 			int left = findMax(p.left);
// 			int right = findMax(p.right);
// 			maxSum = Math.max(p.val + left + right, maxSum);
// 			int ret = p.val + Math.max(left, right);
// 			return ret > 0 ? ret : 0;
// 			}
 			/*
 			 * Each number appears 3 times excpets one
 			 * ones as a bit mask to represent the ith bit had appeared once.
			2. twos as a bit mask to represent the ith bit had appeared twice.
			3. threes as a bit mask to represent the ith bit had appeared three times.
			When the ith bit had appeared for the third time, clear the ith bit of both ones and twos to 0.
			The final answer will be the value of ones.
 			 */
 			
 			int singleNumber(int A[], int n) {
 				int ones = 0, twos = 0, threes = 0;
 				for (int i = 0; i < n; i++) {
 				twos |= ones & A[i];
 				ones ^= A[i];
 				threes = ones & twos;
 				ones &= ~threes;
 				twos &= ~threes;
 				}
 				return ones;
 				}
 			//find min rotated sorted array
 			public int findMin(int[] A) {
 				int L = 0, R = A.length - 1;
 				while (L < R && A[L] >= A[R]) {
 				int M = (L + R) / 2;
 				if (A[M] > A[R]) {
 				L = M + 1;
 				} else {
 				R = M;
 				}
 				}
 				return A[L];
 				}
 			//sorted two sum question ,find indices
 			public int[] twoSum(int[] numbers, int target) {
 			// Assume input is already sorted.
 			for (int i = 0; i < numbers.length; i++) {
 			int j = bsearch(numbers, target - numbers[i], i + 1);
 			if (j != -1) {
 			return new int[] { i + 1, j + 1 };
 			}
 			}
 			throw new IllegalArgumentException("No two sum solution");
 			}
 			private int bsearch(int[] A, int key, int start) {
 			int L = start, R = A.length - 1;
 			while (L < R) {
 			int M = (L + R) / 2;
 			if (A[M] < key) {
 			L = M + 1;
 			} else {
 			R = M;
 			}
 			}
 			return (L == R && A[L] == key) ? L : -1;
 			}
 			
 			public static int needleHay(String hay, String needle){
 				
 				int comp =0; int start =0;
 				if(needle.length() > hay.length()){
 					return -1;
 				}
 				if(needle.length() ==0 && hay.length() ==0){
 					return -1;
 				}
 				
 				while(start < hay.length()){
 					int  h=start; int n =0;
 					while(n < needle.length() && hay.charAt(h) == needle.charAt(n)){
 						h++;
 						n++;
 					}
 					if(n == needle.length()){
 						return start;
 					}
 					start++;
 				}
 				
 				return -1;
 			}
 			
	public static void main(String [] args){
		
		String test ="334244244";
		
//		majorityCharacterMap(test);
//		System.out.println();
//		majorityCharacter(test);
//		
//		int [] pairs ={5,5,6,7,95,21,93,79};
//		pairsToTarget(pairs,100);
//		
//		int []arr1 ={1,2,11,15};
//		int [] arr2 ={4,12,19,23,127,235};
//		
//		System.out.println(smallestDiff(arr1,arr2));
//		String tim = "tim";
//		
//		permuteString(tim.toCharArray(),0,tim.length());
//	
//		System.out.println(tim.toCharArray());
//		int [] msn = {1,3,5,6};
//		 missingTwoElements(msn);
//		missingTwoElementsBool(msn);
		System.out.println(needleHay("timothy","mot"));
		
		 
	}
	
}
