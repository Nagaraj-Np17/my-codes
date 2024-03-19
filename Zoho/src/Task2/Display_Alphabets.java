package Task2;
import java.util.Scanner;
public class Display_Alphabets {
	public static void main(String[] args) {
		System.out.println("Enter The Character");
		Scanner  sc=new Scanner(System.in);
		String str=sc.next();
		displayChar(str);
	}
public static void displayChar(String str) {
		int  val=0;char ch=' ';
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))) {
				ch=str.charAt(i);
			}else {
				val=(val*10)+str.charAt(i)-48;
			}
			if(i+1<str.length() && Character.isLetter(str.charAt(i+1))) {
				printLetters(ch,val);
				val=0;
			}
			
		}
		printLetters(ch,val);
	}
private static void printLetters(char ch, int val) {
	for(int  i=1;i<=val;i++) {
		System.out.print(ch);
		}
	}
	}