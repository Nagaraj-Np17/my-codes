package March5;

import java.io.InputStream;
import java.util.Scanner;

public class Question4 {
	public static void printPatttern(String str,int num) {
		int down=num;int up=-1;int st=0;
		char[][] arr=new char[num][str.length()];
		int i=0;int j=0;
		while(st<str.length()) {
			while(i<down) {
				arr[i][j]=str.charAt(st++);
				i++;
				
			}
			 i-=2 ;j+=1;
			while(j>up) {
				System.out.println(j+"-"+i);
				arr[i--][j--]=str.charAt(st++);
				
			}
			j+=2;i+=2;
			
		}
		for(int k=0;k<arr.length;k++) {
			for(int l=0;l<arr[0].length;l++) {
				if(arr[k][l]!=0) {
					System.out.print(arr[k][j]);
				}
				
			}System.out.println();
		}
		
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();		
		System.out.println("Enter the Value:");
		int num=sc.nextInt();
		printPatttern(str,num);
		
	}

	
}
