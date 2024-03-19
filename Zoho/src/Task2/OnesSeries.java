package Task2;

import java.util.Scanner;

public class OnesSeries {
	public static void onesSeries(int num) {
		int ones=1;String str="";int sum=0;
		for(int i=1;i<=num;i++) {
			str+=""+ones;
			if(i<num){
				str+='+';
			}
			ones=ones*10+1;
			sum=sum*10+i;
		}
		System.out.println(str);
		System.out.println(sum);
	}

	
		public static void main(String[] args) {
			System.out.println("Enter the Number Of Terms:");
			Scanner  sc=new Scanner(System.in);
			int num=sc.nextInt();
			onesSeries(num);

		
		
	}

}
