package Array1;
/*Given an array of ints, return true if the array is length 1 or more, 
 * and the first element and the last element are equal.
sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true

 * */
public class sameFirstLast {
	public static boolean sameFirstLast(int[] nums) {
		  if(nums.length==0)return false;
		  return (nums[0]==nums[nums.length-1])?true:false;
		}
	public  static void main(String[] args) {
		int  arr1[]= {1,2,3};
		int  arr2[]= {1, 2, 3,1};
		int  arr3[]= {1, 2, 1};
		System.out.println(sameFirstLast(arr1));
		System.out.println(sameFirstLast(arr2));
		System.out.println(sameFirstLast(arr3));
	}

}
