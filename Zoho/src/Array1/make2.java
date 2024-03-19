package Array1;

import java.util.Arrays;

/*Given 2 int arrays, a and b, return a new array length 2 containing, 
 * as much as will fit, the elements from a followed by the elements
 *  from b. The arrays may be any length, including 0, 
 *  but there will be 2 or more elements available between the 2 arrays.

make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
 * */
public class make2 {
	public static int[] make2(int[] a, int[] b) {
		  if(a.length==2)return a;
		  else if(a.length==1) {
		    int  temp[]={a[0],b[0]};
		    return temp;
		  }
		  else if(a.length==0){
		     int  temp[]={b[0],b[1]};
		     return temp;
		  }else{
		     int  temp[]={a[0],a[1]};
		  return temp;
		    
		  }
	}
	public static void main(String[] args) {
		int[] arr1= {4, 5};int arr2[]= {1, 2, 3};
		int res[]= make2(arr1,arr2);
		System.out.println(Arrays.toString(res));

	}

}
