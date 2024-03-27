package assignmentPolymorphism;



abstract class Shapes {
	double base;
	double height;
	double a;double p;

	public Shapes(double base, double height) {
		this.base = base;
		this.height = height;

	}
	abstract public void perimeter();
	abstract public void area();

	public void areaShow() {
		System.out.println(a);
	}
	public void perimeterShow() {
		System.out.println(p);
	}
}

class Rectangle extends Shapes {

	public Rectangle(double base, double height) {

		super(base, height);

	}public void perimeter() {
		p=2*(base+height);
	}

	public void area() {
		a = base * height;
	}
}

class Triangle extends Shapes {

	public Triangle(double base, double height) {
		super(base, height);
	}
	public void perimeter() {
		double hypotenuse=(base*base) +(height*height);
		double side=Math.sqrt(hypotenuse);
		p=base+height+side;
	}

	public void area() {
		a = 0.5 * base * height;
	}
}
public class Shape{

	public static void main(String[] args) {
		Shapes r = new Rectangle(30, 40);
		r.area();r.perimeter();
		r.areaShow();r.perimeterShow();
		Shapes t = new Triangle(30, 40);
		t.areaShow();t.perimeterShow();
	}
}
