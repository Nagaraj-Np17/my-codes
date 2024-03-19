package Array1;
import java.util.Arrays;
/*Given 2 int arrays, a and b, of any length, return a new array with 
 * the first element of each array. If either array is length 0, ignore that array.
front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
 * */
public class front11 {
	public static int[] front11(int[] a, int[] b) {
		  if(a.length==0&&b.length==0){
		    return a;
		  }else if(b.length==0){
		    int temp[]={a[0]};
		    return temp;
		  }else if(a.length==0){
		    int temp[]={b[0]};
		    return temp;}
		  else{
		    int temp[]={a[0],b[0]};
		    return temp;
		  }
		    
		}
	public static void main(String[] args) {
		int[] arr1= {1,2,3};int arr2[]= {7,9,8};
		int res[]= front11(arr1,arr2);
		System.out.println(Arrays.toString(res));
		
	}

}
