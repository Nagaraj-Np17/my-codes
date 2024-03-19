package Assignment2;

import java.util.Scanner;

//Write a program to convert time entered in seconds to HH:mm:ss format
public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Seconds : ");
		long sec = sc.nextInt();
		clockFormat(sec);

	}

	private static void clockFormat(long sec) {
		if(sec<0) {
			System.out.print("Invalid \nEnter the Sec In +ve Value");
			
		}else {
		int hour = (int) sec / 3600;
		int min = (int) (sec - (hour * 3600)) / 60;
		int seconds = (int) (sec - (hour * 3600) - (min * 60));
		String totalTime = "";
		totalTime += (hour < 10) ? "0" + hour +":h " : hour + ":h ";

		totalTime += (min < 10) ? "0" + min + ":m " : min + ":m ";
		totalTime += (seconds < 10) ? "0" + seconds +"s" : seconds+"s";

		System.out.println("The (HH:MM:SS) Format For " + sec + " = " + totalTime);
		}
	}

}
