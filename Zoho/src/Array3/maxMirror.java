package Array3;
/*We'll say that a "mirror" section in an array is a group 
 * of contiguous elements such that somewhere in the array, 
 * the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
 * */
public class maxMirror {
	public static int maxMirror(int[] nums) {
		  int n = nums.length;
		        int maxLength = 0;
		        for (int i = 0; i < n; i++) {
		            for (int j = n - 1; j >= 0; j--) {
		                int length = 0;
		                int start = i;
		                int end= j;
		                while (start < n && end >= 0 && nums[start] == nums[end]) {
		                    length++;
		                    start++;
		                    end--;
		                }
		                maxLength = Math.max(maxLength, length);
		            }
		          
		        }
		  return maxLength;
		}

	public static void main(String[] args) {
		int arr1[]= {1, 2, 3, 8, 9, 3, 2, 1};
		int arr2[]= {1, 2, 1, 4};
		int arr3[]= {7, 1, 2, 9, 7, 2, 1};
		System.out.println(maxMirror(arr1));
		System.out.println(maxMirror(arr2));
		System.out.println(maxMirror(arr3));

	}

}
