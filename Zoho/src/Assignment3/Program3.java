package Assignment3;

import java.util.Scanner;

//3. Create a program that takes a student's score as input and outputs their corresponding grade.

public class Program3 {
	public static void gradeCheck(short mark) {
		if(mark>=90 && mark>=100) {
			System.out.print("O");
		}else if(mark>=80 && mark<90) {
			System.out.print("A");
		}else if(mark>=70 && mark<80)  {
			System.out.print("B");
		}else if(mark>=60 && mark<70) {
			System.out.print("C");
		}else if(mark>=40 && mark<60) {
			System.out.print("E");
		}else if(mark<40 && mark >=0) {
			System.out.print("Fail");
		}else {
			System.out.print("Invalid mark");
		}
		
	}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Student Mark:(0-100)");
		 byte score=sc.nextByte();
		 gradeCheck(score);

	}

}
