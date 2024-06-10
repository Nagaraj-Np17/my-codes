package com.liftapp.models;

import java.util.ArrayList;

public class Lift {
	private String liftName;
	private int position;
	private boolean underMAintanance;
	private int capacity;

	private ArrayList<Integer> restriction;

	public Lift(String liftName, int position, boolean underMAintanance) {
		super();
		this.liftName = liftName;
		this.position = position;
		this.underMAintanance = underMAintanance;
		this.restriction = new ArrayList<Integer>();
	}

	public Lift() {

	}

	public String getLiftName() {
		return liftName;
	}

	public void setLiftName(String liftName) {
		this.liftName = liftName;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public boolean isUnderMAintanance() {
		return underMAintanance;
	}

	public void setUnderMAintanance(boolean underMAintanance) {
		this.underMAintanance = underMAintanance;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public ArrayList<Integer> getRestriction() {
		return restriction;
	}

	public void setRestriction(ArrayList<Integer> restriction) {
		this.restriction = restriction;
	}

	@Override
	public String toString() {
		return "Lift [liftName=" + liftName + ", position=" + position + ", underMAintanance=" + underMAintanance + "]";
	}

}
