package Task2;

import java.util.Scanner;

public class Demo {	

public static void main(String []args) {
	Scanner sc=new Scanner (System.in);
	int num=sc.nextInt();int sum=0;
	for(int i=3;i<num;i++) {
		if(i%3==0) {
			if(i%5==0) {
				sum+=i;
				
			}else {
				sum+=i;
			}
		}
		else if(i%5==0) {
			sum+=i;
		}
	
	}
	
	System.out.print(sum);
	
	
	
	}

			
}



