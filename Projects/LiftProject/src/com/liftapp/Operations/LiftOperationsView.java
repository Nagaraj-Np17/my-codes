package com.liftapp.Operations;

import java.util.List;
import java.util.Scanner;

import com.liftapp.models.Lift;

public class LiftOperationsView {
	Scanner sc = new Scanner(System.in);
	private LiftOperationsModel liftOperationsModel;

	public LiftOperationsView() {
		liftOperationsModel = new LiftOperationsModel(this);
	}

	public void liftSetup() {

		System.err.println("|----------- Welcome ------------|");
		System.out.println();
		System.out.println("Enter The Total Number Of Lift:");
		int liftCount = sc.nextInt();
		liftOperationsModel.createLift(liftCount);
	}

	public void printInfo(Object string) {
		System.out.println(string);
	}

	public void viewLiftView() {
		List<Lift> lift = liftOperationsModel.viewLiftModel();
		System.out.println("----------------------------------------------------");
		System.out.println("Lift Name	|   Floor	|  Restriction");
		System.out.println("----------------------------------------------------");
		for (Lift l : lift) {
			System.out.println(l.getLiftName() + "		| " + "	" + l.getPosition() + "	|" + "	" + l.getRestriction());
		}
		System.out.println("----------------------------------------------------");
	}

	public void accessLift() {
		System.out.println("Enter The Current Floor:");
		int start = sc.nextInt();
		System.out.println("Enter The Destination Floor:");
		int end = sc.nextInt();
		liftOperationsModel.userAccess(start, end);
	}

	public void printErrInfo(Object string) {
		System.out.println("****************************************");
		System.err.println(string);
		System.out.println();
		System.out.println("****************************************");

	}

	public void changeFloorAllLift() {
		liftOperationsModel.changeFloorAllLiftInModel();

	}

	public void changeFloor() {
		System.out.println("Enter The Name:");
		String liftName = sc.next();
		System.out.println("Enter The Floor To set Lifts:");
		int liftFloor = sc.nextInt();
		liftOperationsModel.setFloorPosition(liftName, liftFloor);

	}

	public void addRestriction() {
		liftOperationsModel.setRestriction();
	}

	public void viewRestriction() {
		List<Lift> lift = liftOperationsModel.viewLiftModel();
		// List<Lift> lift = liftOperationsModel.viewLiftModel();
		System.out.println("Lift Name	|  Restriction");
		for (Lift l : lift) {
			System.out.println(l.getLiftName() + "		| " + l.getRestriction());
		}

	}

}
