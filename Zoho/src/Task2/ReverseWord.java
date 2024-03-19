package Task2;

public class ReverseWord {

	public static void main(String[] args) {
		String  str="he is Boy";
		String rev=reverse(str);
		System.out.print(rev);
	}

	private static String reverse(String str) {
		int len=str.length();
		 if (!str.contains(" "))
			 return str;
		 int index=str.indexOf(' ');
		 return reverse(str.substring(index+1))+" "+str.substring(0,index);
			 
	}

	
}
