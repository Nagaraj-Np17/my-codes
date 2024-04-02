package exceptionhandling;

public class UserDefinedException extends Exception {
public UserDefinedException() {
	
}
	public static void main(String[] args) {
		try {
			throw new UserDefinedException();
		} catch (UserDefinedException e) {
			System.out.println("UserDefinedException..");
		}
	}

}
