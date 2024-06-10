package com.liftapp.homepage;

import java.util.Scanner;

import com.liftapp.Operations.LiftOperationsView;

public class HomePage {
	private LiftOperationsView liftOperationsView = new LiftOperationsView();

	public void init() {
		liftOperationsView.liftSetup();
		mainMenu();
	}

	public void mainMenu() {
		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("\n******************************************");
			System.out.println("*	1.View Lift Data                 :");
			System.out.println("*	2.Access Lift                    :");
			System.out.println("*	3.To Change Lift Floor           :");
			System.out.println("*	4.To Change Specific Lift Floor  :");
			System.out.println("*	5.Add Restriction                :");
			System.out.println("*	6.View Restriction               :");
			System.out.println("*	0.Exit                           :");
			System.out.println("*******************************************");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				liftOperationsView.viewLiftView();
				break;
			}
			case 2: {
				liftOperationsView.accessLift();
				break;
			}
			case 3: {
				liftOperationsView.changeFloorAllLift();
				break;
			}
			case 4: {
				liftOperationsView.changeFloor();
				break;
			}
			case 5: {
				liftOperationsView.addRestriction();
				break;
			}
			case 6: {
				liftOperationsView.viewRestriction();
				break;
			}
			case 0: {
				return;

			}

			default:
				System.err.println("|-----Invalid Choice----|");
			}
		}
	}

}
