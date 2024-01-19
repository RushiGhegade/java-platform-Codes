/*
Given an array A of n positive numbers. The task is to find the first index in the array such that the sum of elements before it is equal to the sum of elements after it.

Note:  Array is 1-based indexed.

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
Explanation: For second test case 
at position 3 elements before it 
(1+3) = elements after it (2+2). 
 

Example 2:

Input:
n = 1
A[] = {1}
Output: 1
Explanation:
Since its the only element hence
it is the only point.
Your Task:
The task is to complete the function equalSum() which takes the array and n as input parameters and returns the point. Return -1 if no such point exists.

Expected Time Complexily: O(N)
Expected Space Complexily: O(1)
*/


class EqualSum{
	
	static int equalsum(int arr[]){
		
		int index=-1;

		if(arr.length==1){
			return 1;
		}

		for(int i=1;i<arr.length;i++){
			
			arr[i]=arr[i-1]+arr[i];
		}

		for(int i=0;i<arr.length;i++){
			
			int left=0;
			int right=0;

			if(i==0){

				right=arr[arr.length-1]-arr[i];
			}else{
				left=arr[i-1];
				right=arr[arr.length-1]-arr[i];
			}

			if(right==left){
				index=i+1;
			}
		}

		return index;
	}

	public static void main(String args[]){
		
		int arr[]=new int[]{1,2,3,4,5};

		int ans=equalsum(arr);
		System.out.println(ans);
	}
}













