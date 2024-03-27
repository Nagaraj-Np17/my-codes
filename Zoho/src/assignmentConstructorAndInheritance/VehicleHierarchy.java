package assignmentConstructorAndInheritance;

class Hierarchy {

	private String vehicleName;
	private String color;
	private int noOfWheels;
	private int releasedYear;
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public int getReleasedYear() {
		return releasedYear;
	}
	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}
	public Hierarchy(String vehicleName, String color, int noOfWheels, int releasedYear) {
		this.vehicleName = vehicleName;
		this.color = color;
		this.noOfWheels = noOfWheels;
		this.releasedYear = releasedYear;
	}
	void display() {
		System.out.println("Vehicle Name:"+vehicleName+" NoOfWheels"+noOfWheels+" color"+color+" releasedYear"+releasedYear);
	}
}	
class Car extends Hierarchy{
	public Car(String vehicleName, String color, int noOfWheels,  int releasedYear) {
		super(vehicleName, color, noOfWheels, releasedYear);
		}

}
class Bike extends Hierarchy{
	public Bike(String vehicleName, String color, int noOfWheels, int releasedYear) {
		super(vehicleName, color, noOfWheels, releasedYear);
		
	}
	
	}
public class VehicleHierarchy{
	public static void main(String[] args) {
		Hierarchy vehicle=new Car("Car","White",4,2007);
		vehicle.display();
		vehicle=new Bike("Bike","Blue",2,2011);
		vehicle.display();
	}
}







