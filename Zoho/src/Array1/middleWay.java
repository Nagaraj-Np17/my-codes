package Array1;

import java.util.Arrays;

/*Given 2 int arrays, a and b, each length 3, return a new array length 
 * 2 containing their middle elements.
middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 * */
public class middleWay {
	public static int[] middleWay(int[] a, int[] b) {
		 int result[]={a[a.length/2],b[b.length/2]};
		  return result;
	}

	public static void main(String[] args) {
		int[] arr1= {1, 2, 3};int arr2[]= {4, 5, 6};
		int res[]= middleWay(arr1,arr2);
		System.out.println(Arrays.toString(res));
	}

}
