/*
 *2:Rotate a 2D array without using extra space

Company:Microsoft, Google,adobe, zomato, snapdeal, RedBus
Platform: GFG
Description:
Given a N x N 2D matrix Arr representing an image. Rotate the image by 90 degrees
(anti-clockwise). You need to do this in place. Note that if you end up using an additional
array, you will only receive partial score.
Example 1:
Input:
N = 3
Arr[][] = {{1, 2, 3}
{4, 5, 6}
{7, 8, 9}}
Output:
3 6 9
2 5 8
1 4 7
Explanation: The given matrix is rotated
by 90 degree in anti-clockwise direction.
Example 2:
Input:
N = 4
Arr[][] = {{1, 2, 3, 4}
{5, 6, 7, 8}
{9, 10, 11, 12}
{13, 14, 15, 16}}
Output:
4 8 12 16
3 7 11 15
2 6 10 14
1 5 9 13
Explanation: The given matrix is rotated
by 90 degree in anti-clockwise direction.
Your Task:

You don't need to read input or print anything. Your task is to complete the function
rotate() which takes the 2D array of integers arr and n as parameters and returns void.
You need to change the array itself.
Expected Time Complexity: O(N*N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 1000
1 ≤ Arr[i][j] ≤ 1000
 * */




class Demo{
	
	public static void main(String args[]) {
		
		int arr[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		// first find the transpose matrix
		for(int i=0;i<arr.length;i++){

			for(int j=i;j<arr[i].length;j++){
				
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;	

			}
		}

		// now swap the row
		int i=0;
		int j=arr.length-1;

		while(i<j){
			
			int temp[]=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		
		}

		// print the output
		for(int a=0;a<arr.length;a++) {
    			
			for(int b=0;b<arr[a].length; b++)  {
				
				System.out.print(arr[a][b]+"    ");
			}System.out.println();
		}
	}
}


























