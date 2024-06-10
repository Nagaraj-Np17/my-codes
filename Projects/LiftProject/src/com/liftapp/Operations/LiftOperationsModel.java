package com.liftapp.Operations;

import java.util.ArrayList;
import java.util.Scanner;

import com.liftapp.models.Lift;

class LiftOperationsModel {
	private ArrayList<Lift> liftInfo = new ArrayList<>();
	private LiftOperationsView liftOperationsView;

	public LiftOperationsModel(LiftOperationsView liftOperationsView) {
		this.liftOperationsView = liftOperationsView;
	}

	public void createLift(int liftCount) {

		for (int i = 1; i <= liftCount; i++) {
			Lift l = new Lift("L" + i, 0, false);
			liftInfo.add(l);
		}
		liftOperationsView.printInfo("Lift Created SuccessFully");
		System.out.print("Lift :  " + liftInfo.size());
	}

	public ArrayList<Lift> viewLiftModel() {
		return liftInfo;
	}

	public void userAccess(int start, int end) {
		String name = "";
		int min = 11;
		int pos = -1;
		for (Lift l : liftInfo) {
			ArrayList<Integer> floorList = l.getRestriction();
			if (floorList.isEmpty() || floorList.contains(start) && floorList.contains(end)) {
				int current = (int) Math.abs(start - l.getPosition());

				if (current <= min) {
					if (min == current) {
						if (pos == l.getPosition()) {
							continue;
						}
						if ((start < end) && (l.getPosition() < start)) {
							name = l.getLiftName();
							min = current;

						} else if ((start > end) && (l.getPosition() > start)) {
							name = l.getLiftName();
							min = current;
						}

					} else {
						name = l.getLiftName();
						min = current;
						pos = l.getPosition();
					}

				}

			}

		}
		liftOperationsView.printErrInfo(name + " is Arriving");
		setFloorPosition(name, end);
		liftOperationsView.viewLiftView();

	}

	public void setFloorForAllLift() {

	}

	public void setFloorPosition(String liftName, int liftFloor) {
		for (Lift l : liftInfo) {
			if (l.getLiftName().equals(liftName)) {
				l.setPosition(liftFloor);
			}
		}

	}

	public void setRestriction() {
		Scanner sc = new Scanner(System.in);
		for (Lift l : liftInfo) {
			System.out.println("LiftName :" + l.getLiftName());
			System.out.println("Do You Want to Set Lift Restricition(Y/N):");
			ArrayList<Integer> floorList = new ArrayList<>();
			char choice = sc.next().charAt(0);
			if (choice == 'Y') {
				System.out.println("Enter The Total Number Of Floor to Access lift:");
				int floorSize = sc.nextInt();
				for (int i = 0; i < floorSize; i++) {
					System.out.println("Enter The Floor to Access Lift(0-10):");
					floorList.add(sc.nextInt());

				}
				l.setRestriction(floorList);

			}
		}
	}

	public void changeFloorAllLiftInModel() {
		Scanner sc = new Scanner(System.in);
		for (Lift l : liftInfo) {
			System.out.println("LiftName :" + l.getLiftName());
			System.out.println("Do You Want Change Lift Position (Y/N):");
			char choice = sc.next().charAt(0);
			if (choice == 'Y') {
				System.out.println("Enter The Floor To Change:");
				int liftFloor = sc.nextInt();
				l.setPosition(liftFloor);
			}
		}

	}
}
