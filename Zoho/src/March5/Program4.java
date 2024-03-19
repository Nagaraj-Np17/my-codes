package March5;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		System.out.println("Enter the Value to Split Row:");
		int n=sc.nextInt();
		zigZag(s,n);
	}
	public static void zigZag(String s ,int n){
		int st=0;
		int i=0;int j=0;
		char[][]ch=new char[n][s.length()-1];
		while(st<s.length()) {	
			while(st<s.length() && i<n)
			{
				//System.out.println(i+""+j);
				ch[i++][j]=s.charAt(st++);
			}
			i-=2;
			j+=1;
			while(st<s.length()&&j>-1 && i>-1)
			{ //System.out.println(i+""+j);
				ch[i--][j++]=s.charAt(st++);
			}
			i+=2;j--;			
		}
	for(int r=0;r<n;r++) {
		for(int col=0;col<ch[0].length;col++) {
			if(ch[r][col]!=0) {
				System.out.print(ch[r][col]+" ");
			}else {
				System.out.print("  ");
			}
			
		}System.out.println();
	}
	}
		
	
	
	
	
	
	}
	
	
	
		


