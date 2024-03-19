
package March5;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
	System.out.println("Enter num of row:");
	Scanner  sc=new Scanner(System.in);
	int  n=sc.nextInt();
	int shift=0; int  st=1;
		int res[][]=new int[n][n];int i=-1,j=-2;
		int down=n,right=n;int up=-1;int left=0;
		while(shift<n) {
			i+=1;j+=2;
			while(i<down  && j<right) {
				res[i++][j++]=st++;
			}
			i-=2;j--;down--;right--;
			//shift++;
			while(i>up) {
				res[i--][j]=st++;
			}
			up++;
			i++;j--;
			//shift++;
			while(j>left) {
				res[i][j--]=st++;
			}
			shift+=3;
			left+=2;
		}
		for(int r=0;r<n;r++) {
			for(int col=0;col<n;col++) {
				if(res[r][col]!=0) {
					System.out.print(res[r][col]+"  ");
				}else {
					System.out.print("   ");
				}
				
			}System.out.println();
		}
	}

}
