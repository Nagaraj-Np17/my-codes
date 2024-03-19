package Array1;
/*Given an int array length 2, return true if it contains a 2 or a 3.

has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false*/
public class has23 {
	public static boolean has23(int[] nums) {
		  return (nums[0]==2||nums[0]==3||nums[0]==2||nums[1]==3);
		  
		}
	public static void main(String[] args) {
		int  arr1[]= {2,5};
		int  arr2[]= {4, 3};
		int  arr3[]= {4, 5};
		System.out.println(has23(arr1));
		System.out.println(has23(arr2));
		System.out.println(has23(arr3));

	}

}
