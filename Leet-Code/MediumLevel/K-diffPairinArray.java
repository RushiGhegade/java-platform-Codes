/*
K-diff Pairs in an Array

Company : Uber, Amazon, Flipkart, OYO Room, Sharechat, Samsum
Platform: leetcode-532.
Fraz’s DSA sheet
Description:
Given an array of integers nums and an integer k, return the number of unique
k-diff pairs in the array.
A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:
0 <= i, j < nums.length
i != j
|nums[i] - nums[j]| == k
Notice that |val| denotes the absolute value of val.
Example 1:
Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique
pairs.
Example 2:
Input: nums = [1,2,3,4,5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4,
5).

Example 3:
Input: nums = [1,3,1,5,4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).

Constraints:
1 <= nums.length <= 104
-107 <= nums[i] <= 107
0 <= k <= 107
*/
import java.util.*;
class Demo{
	
	public static void main(String args[]) {
		int count=0;
		//int arr[]=new int[]{6,2,9,3,9,6,7,7,6,4};
		int arr[]=new int[]{3,1,4,1,5};
		int k=2;
		
		
		Map<Integer,Integer> map=new HashMap<>();

		for(int i=0;i<arr.length;i++){
		
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i]+1));
			}else{
				map.put(arr[i],1);
			}
		}
		//Integer m=map.keySet(); only use for each then apply
		if(k==0){
			
			for(int i=0;i<arr.length;i++){
				
				if(map.get(arr[i])>1){
					count++;
				}
			}
		}else{
			
			for(Integer x: map.keySet() ){
				
				int ans=x+k;
			//	if(ans<0){
				//	ans=-ans;
				//}

				if(map.containsKey(ans)){
					count++;
				}

			}
		}

		System.out.println(count);
	
		
	}
}
