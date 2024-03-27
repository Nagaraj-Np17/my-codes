package assignmentConstructorAndInheritance;

class Shapes {
	double base;
	double height;
	double a;

	public Shapes(double base, double height) {
		this.base = base;
		this.height = height;

	}

	public void area() {

	}

	public void show() {
		System.out.println(a);
	}
}

class Rectangle extends Shapes {

	public Rectangle(double base, double height) {

		super(base, height);

	}

	public void area() {
		a = base * height;
	}
}

class Triangle extends Shapes {

	public Triangle(double base, double height) {
		super(base, height);
	}

	public void area() {
		a = 0.5 * base * height;
	}
}
public class Shape{

	public static void main(String[] args) {
		Shapes r = new Rectangle(30, 40);
		r.area();
		r.show();
		Shapes t = new Triangle(30, 40);
		t.area();
		t.show();
	}

}



