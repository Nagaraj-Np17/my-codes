package Array1;

import java.util.Arrays;

/*Given 2 int arrays, each length 2, return a 
 * new array length 4 containing all their elements.

plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 * */
public class plusTwo {
	public static int[] plusTwo(int[] a, int[] b) {
		  int [] merge=new int[4];
		  merge[0]=a[0];
		  merge[1]=a[1];
		  merge[2]=b[0];
		  merge[3]=b[1];
		  return  merge;
		}
	public static void main(String[] args) {
		int  arr1[]= {1,2};
		int  arr2[]= {3,4};
		int res[]=(plusTwo(arr1,arr2));
		System.out.println(Arrays.toString(res));
	}

}
