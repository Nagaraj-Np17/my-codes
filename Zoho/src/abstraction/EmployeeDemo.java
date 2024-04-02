package abstraction;

import java.util.Scanner;

abstract class Employee {
	String name;
	int id;
	String empType;
	long salary;
	
	abstract long calculatePay(int dayHours);

	public void getEmployeeDetails(String name, int id, long salary,String empType) {
		System.err.println("|-------Employee Details----|");
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.empType=empType;
		System.out.println("\nName: 	" + name +"\nEmployee Type:"+ empType+ "\nID:  	" + id + "\nsalary 	" + salary);

	}

}

class HourlyEmployee extends Employee {
	Scanner sc = new Scanner(System.in);
	long paymentPerHours = 500;
	long salary;
	int workHour;
	
	@Override
	long calculatePay(int dayHours) {
		this.workHour=dayHours;
		salary = paymentPerHours * workHour;
		return salary;
		
	}

}

class SalariedEmployee extends Employee {
	Scanner sc = new Scanner(System.in);
	long paymentPerDay = 1500;
	long salary;
	int workDays;

	@Override
	long calculatePay(int dayHours) {
		this.workDays=dayHours;
		salary = paymentPerDay * workDays;
		return salary;
	}
	
}

public class EmployeeDemo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true) {
	System.out.println("\nSelect The Employee Type:\n1.Salary Employee..\n2.Hourly Employee\n0.Exit");
	int choice=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter The Employee Name:");
	String name=sc.nextLine();
	System.out.println("Enter The Employee id:");
	int id=sc.nextInt();
		switch(choice) {
		case 1:
		{				
			System.out.println("Enter The Number Of Working Days:");
			int days=sc.nextInt();			
			Employee emp=new SalariedEmployee();
			long salary=emp.calculatePay(days);
			emp.getEmployeeDetails(name, id,salary , "SalariedEmployee");
			break;
		}
		case 2:
		{				
			System.out.println("Enter The Number Of Working Hours:");
			int days=sc.nextInt();			
			Employee emp=new HourlyEmployee();
			long salary=emp.calculatePay(days);
			emp.getEmployeeDetails(name, id,salary ,"HourlyEmployee");
			break;
		}
		case 0:{
				return;
		}
		default :{
			System.out.println("Invalid Choice..");
		}
		
		
		}
	}
		
	}
}
