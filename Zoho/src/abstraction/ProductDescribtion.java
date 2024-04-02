package abstraction;
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
	private int size;
	
	

	public ElectronicsProduct(String name, int prodId, double price, String brand) {
		super(name, prodId,brand);
		this.price = price;
		this.size = size;
	}

	@Override
	void getDescription() {
		System.out.println("\n|------ ElectronicsProduct ------|");
		System.out.println("\nProduct Name:"+super.getName()+"   |  "+"ProductId"+super.getProdId()+"   |  "+"Brand"+super.getBrand()
		+"Price"+price);
		
	}

	@Override
	double getPrice() {
		
		return price;
	}

}
class ClothingProduct extends Product{

public ClothingProduct(String name, int prodId, String brand) {
		super(name, prodId, brand);
		
	}


	@Override
	void getDescription() {
		
		
	}

	@Override
	double getPrice() {
		
		return 0;
	}
	
}
class BookProduct{
	
}
public class ProductDescribtion {
public static void main(String[] args) {
	
}
}
