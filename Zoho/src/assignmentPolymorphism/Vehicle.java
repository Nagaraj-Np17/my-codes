package assignmentPolymorphism;

public class Vehicle{
	public static void main(String[] args) {
		Vehicles v = new Bike();
		v.start();
		v.stop();

		System.out.println();

		v = new Car();
		v.start();
		v.stop();
	}
}

class Vehicles {

	public void start() {
		System.out.println("Vehicle Starts");
	}

	public void stop() {
		System.out.println("Vehicle Stops");
	}
}

class Car extends Vehicles {
	public void start() {
		System.out.println("Car Starts");
	}

	public void stop() {
		System.out.println("Car Stops");
	}
}

class Bike extends Vehicles {
	public void start() {
		System.out.println("Bike Starts");
	}

	public void stop() {
		System.out.println("Bike Stops");
	}
}

