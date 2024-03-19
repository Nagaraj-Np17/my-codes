package Array1;
/*Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
 * */
public class no23 {
	public static boolean no23(int[] nums) {
		   return (nums[0]==2||nums[1]==3|| nums[0]==3||nums[1]==2)?false:true;
		}

	public static void main(String[] args) {
		int  arr1[]= {2,5};
		int  arr2[]= {4, 2};
		int  arr3[]= {5, 5};
		System.out.println(no23(arr1));
		System.out.println(no23(arr2));
		System.out.println(no23(arr3));

	}

}
