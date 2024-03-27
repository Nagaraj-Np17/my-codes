package assignmentPolymorphism;

public class Calculator {
	public void add(int a,int b) {
		System.out.println("add"+(a+b));
	}
	public void add(int a,double b) {
		System.out.println("add2"+(a+b));
	}
	//---------------------------------------
	public void subract(int a,int b) {
		System.out.println("subract1"+(a-b));
	}
	public void subract(int a,double b) {
		System.out.println("subract2"+(a-b));
	}
	
	
	//-----------------------------------------------------
	public void multiple(int a,int b) {
		System.out.println("multiple1"+(a*b));
	}
	public void multiple(double a , float b) {
		System.out.println("multiple2"+(a*b));
	}
	public void divide(int a,int b) {
		System.out.println("multiple"+(a/b));
	}
	public void divide(int a,double b) {
		System.out.println("multiple"+(a/b));
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(6,10);
		cal.multiple(5.5,10);
		cal.divide(10,5);
		cal.subract(3,5);
	}

}
