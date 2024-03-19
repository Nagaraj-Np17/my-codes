package Assignment4;
//2. Write a program to print prime numbers between 1 to 30
public class Program2 {

	public static void main(String[] args) {
		for(int i=2;i<30;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count=1;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}

	}

}
