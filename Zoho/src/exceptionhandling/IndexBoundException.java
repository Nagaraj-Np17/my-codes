package exceptionhandling;

public class IndexBoundException {
public static void main(String[] args) {
	try {
		System.out.println(args[0]);
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}
	finally {
		System.out.println("ThankYou");
	}
}
}
