package Array3;
import java.util.Arrays;
import java.util.Scanner;
/*Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 * */
public class squareUp {
	public static int[] squareUp(int n) {
		int array[]=new int[n*n];int index=0;
		for(int i=1;i<4;i++) {
			for(int j=3;j>0;j--){
				if(i>=j) {
					array[index++]=j;
				}else {
					array[index++]=0;
				}
			}
		}
		return array;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n=sc.nextInt();
		int res[]=(squareUp(n));
		System.out.print(Arrays.toString(res));
		}

}
