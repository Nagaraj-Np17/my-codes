package assignmentConstructorAndInheritance;


class Student{
	  private String name;
	  private int age;
	  private String email;
	  private String phoneNo;
	 
public Student(String name, int age,String email,String phoneNo) {
	        this.name = name;
	        this.age = age;
	        this.email=email;
		}
		public void displayInfo() {
	    	System.out.println("Name: " + name + ", Age: " + age+ ", email: " + email+" ,phoneNo"+phoneNo);
	    }
	}

	
class ZSGSStudent extends  Student{
	 private String college;
	    private double percentage;

	    public ZSGSStudent(String name, int age,String email,String phoneNo, String college,double percentage) {
	        super(name, age,email,phoneNo); 
	        this.college = college;
	        this.percentage = percentage;
	       
	    }

	    public void displayInfo() {
	        super.displayInfo(); 
	        System.out.println("College: " + college + ", percentage: " + percentage);
	    }
}

public class Main {

	public static void main(String[] args) {
		 ZSGSStudent student1 = new ZSGSStudent("Nagaraj", 23,"npr@gamil.com","9876543210", "VVCollge", 85.4);
		 student1.displayInfo();
		 Student par=new ZSGSStudent("Nagaraj", 23,"npr@gamil.com","9876543210", "VVCollge", 85.4);
		 par.displayInfo();
	}

}
