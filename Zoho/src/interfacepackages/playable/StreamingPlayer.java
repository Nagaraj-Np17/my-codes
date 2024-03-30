package interfacepackages.playable;

import java.util.Scanner;

public class StreamingPlayer implements Playables{
	int choice;
	Scanner sc = new Scanner(System.in);

	public StreamingPlayer() {
		musicInit();

	}

	public void musicInit() {
		System.out.println("Welcome To StreamingPlayer...");
		boolean play = true;
		boolean pause = true;
		boolean stop = true;
		while (true) {

			System.out.println("1.Play\n2.Pause/n3.Stop\n4.Other Players\nEnter The Choice:");
			int button = sc.nextInt();
			switch (button) {
			case 1: {
				if (play) {
					play();
					play = false;
				} else {
					System.out.println("StreamingPlayer Already Plays");
				}
				break;
			}
			case 2: {
				if (!play && pause) {
					pause();
					play=true;
				} else {
					System.out.println("StreamingPlayer Doesn't Plays");
				}
				break;
			}
			case 3: {
				if (stop) {
					stop();
					stop = false;
				} else {
					System.out.println("StreamingPlayer Doesn't Plays");
				}
				break;
			}
			case 4: {
				System.out.println("Players Menu");
				return;
			}
			default: {
				System.out.println("Invalid Choice...");
			}

			}
		}

	}

	@Override
	public void play() {
		System.out.println("StreamingPlayer Playing");
	}

	@Override
	public void pause() {
		System.out.println("Music Paused");
	}

	@Override
	public void stop() {
		System.out.println("StreamingPlayer Stops");

	}
}