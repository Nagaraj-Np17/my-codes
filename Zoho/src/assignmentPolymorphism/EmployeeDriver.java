package assignmentPolymorphism;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee s = new HourlyEmployee("Nagaraj", 1);
		s.getEmployeeDetails(2);

		System.out.println();

		s = new SalariedEmployee("sandy", 2);
		s.getEmployeeDetails(250.00);
	}
}

class Employee {
	String name;
	int employeeId;
	double salary;
	short hoursWorked;

	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public void getEmployeeDetails() {
		System.out.println("Name: " + name + ", Employee ID: " + employeeId);
	}

	public void getEmployeeDetails(double salary) {
		System.out.println("Name: " + name + "\nEmployee ID: " + employeeId + "\nSalary : " + salary);
	}

	public void getEmployeeDetails(int hoursWorked) {
		System.out.println("Name: " + name + "\nEmployee ID: " + employeeId + " \nHours Worked : " + hoursWorked);
	}
}

class HourlyEmployee extends Employee {
	public HourlyEmployee(String name, int employeeId) {
		super(name, employeeId);
	}
}

class SalariedEmployee extends Employee {
	public SalariedEmployee(String name, int employeeId) {
		super(name, employeeId);
	}
}