package abstraction;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Product{
	private String name;
	private int prodId;
	private  String brand;
	public String getName() {
		return name;
	}
	public int getProdId() {
		return prodId;
	}
	public String getBrand() {
		return brand;
	}
	public Product(String name, int prodId,String brand) {
		super();
		this.name = name;
		this.prodId = prodId;
		this.brand=brand;
	}
	abstract void getDescription();
	abstract double getPrice();
	
}
class ElectronicsProduct extends Product{
	private double price;
	private String brand;

	
	

	public ElectronicsProduct(String name, int prodId, double price, String brand) {
		super(name, prodId,brand);
		this.price = price;
		
	}

	@Override
	void getDescription() {
		
		System.out.println("\nProduct Name:"+super.getName()+"   |  "+"ProductId"+super.getProdId()+"   |  "+"Brand"+super.getBrand()
		+"		|	Price : "+price);
		
	}

	@Override
	double getPrice() {
		
		return price;
	}

}
class ClothingProduct extends Product{
private int size;
private double price;
public ClothingProduct(String name, int prodId, String brand,double price,int size) {
		super(name, prodId, brand);
		this.price=price;
		this.size=size;
		
	}


	@Override
	void getDescription() {
		System.out.println("\nProduct Name:"+super.getName()+"   |  "+"ProductId"+super.getProdId()+"   |  "+"Brand"+super.getBrand()
		+"	|	Size : "+size+"		|	Price : "+price);
		
	}

	@Override
	double getPrice() {
		
		return price;
	}
	
}
class BookProduct extends Product{
	
	private String  auther;
	private double price;
	public BookProduct(String name, int prodId, String brand,double price,String auther) {
			super(name, prodId, brand);
			this.price=price;
			this.auther=auther;
			
		}


		@Override
		void getDescription() {
			System.out.println("\nProduct Name:"+super.getName()+"   |  "+"ProductId"+super.getProdId()+"   |  "+"Brand"+super.getBrand()
			+"	|	Auther  : "+auther+"	|Price : "+price);
			
		}

		@Override
		double getPrice() {
			
			return price;
		}
		
}
public class ProductDescribtion {
public static void main(String[] args) {
	ArrayList<Product>shopingList=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	double totalPrice=0;
	while(true) {
		System.out.println("1.Book\n2.T-shirt\n3.Laptop\n4.Closing Purchase..\n0.Exit");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
		{
			Product prodBook=new BookProduct("Ramayana",01,"Ethikasam",200.05,"valmigi");
			shopingList.add(prodBook);
			break;
		}
		case 2:{
			Product prodElectoric=new ClothingProduct("T-Shirt",232,"Allen",2000.05,32);
			shopingList.add(prodElectoric);
			break;
		}
		case 3:{
			Product prodClothes=new ElectronicsProduct("Laptop",1231,200000.05,"Dell");
			shopingList.add(prodClothes);
			break;
		}
		case 4:{
			System.err.println("|--------Purchase List-------|");
			
			for(Product list:shopingList) {
				list.getDescription();
				totalPrice+=list.getPrice();
			}
			System.out.println("Total Price"+totalPrice);
			break;
		}
		}
		
	}
	
	
	
}
}
