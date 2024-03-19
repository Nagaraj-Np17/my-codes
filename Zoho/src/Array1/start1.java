package Array1;
/*Start with 2 int arrays, a and b, of any length. 
 * Return how many of the arrays have 1 as their first element.
start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1

 * */
public class start1 {
	public static int start1(int[] a, int[] b) {
		 int ones=0;
		  if(a.length==0&&b.length==0)return 0;
		   if(a.length>0) ones+=(a[0]==1)?1:0;
		   if(b.length>0)ones+=(b[0]==1)?1:0;
		  return ones;
		}

	public static void main(String[] args) {
		int  arr1[]= {1,2,3};
		int  arr2[]= {1,3};
		System.out.println(start1(arr1,arr2));
		
	}

}
