package interfacepackages.playable;

import java.util.Scanner;

public class MusicMain {
public static void main(String[] args) {
	Playables remote;	
	Scanner sc=new Scanner(System.in);	
	
	while(true) {
	System.out.println("1.MP3.Player\n2.CD.Player\n3.Streamed Player\n4.Exit..\nEnter The Choice:");
	
	int button=sc.nextInt();
	switch(button)
	{
	case 1:
		remote=new MP3Player();
		break;
	case 2:
		
		remote=new CDPlayer();
		break;
	case 3:
		
		remote=new StreamingPlayer();
		break;
	case 4:
		System.out.println("ThankYou!!!\nExiting.....");
		System.exit(button);
		break;
	default:
		System.out.println("Invalid Choice");
		break;
	
	}
	}
}
}
