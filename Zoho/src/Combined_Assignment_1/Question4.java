package Combined_Assignment_1;

import java.util.Scanner;

public class Question4 {
	int prodId;
	String ProdName;
	double prodprice;
	boolean available;
	float version;

	public Question4(int id, String name, double price, boolean alb,float ver) {
		this.prodId=id;
		this.ProdName=name;
		this.prodprice=price;
		this.version=ver;
	}
	
	void productDisplay() {
		System.out.println("Product id= "+prodId);
		System.out.println("Product Name= "+ProdName);
		System.out.println("Product Available= "+available);
		System.out.println("Product Version= "+prodprice);
		System.out.println("Product Version= "+version);
		
	}
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Product Id:");
		int id=sc.nextInt();
		System.out.println("Enter the Product Name:");
		String name=sc.next();
		System.out.println("Enter the Product Price:");
		double price=sc.nextDouble();
		System.out.println("Enter the Product Available Or Not (true/false):");
		boolean alb=sc.nextBoolean();
		System.out.println("Enter the Product Version:");
		float ver=sc.nextFloat();
		
		Question4 pro=new Question4(id,name,price,alb,ver);
		pro.productDisplay();
		
		
	}

}
