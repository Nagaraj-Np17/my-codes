package Warm_Up2;
/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
*/
public class countXX {
	public static int countXX(String str) {
		  int count=0;int i=0;
		  while(i<str.length()-1){
		    if(str.charAt(i)=='x'&&str.charAt(i+1)=='x'){
		      count++;
		    };
		    i++;
		  }
		  return count;
		}

	public static void main(String[] args) {
		System.out.println( countXX("abcxx"));
		System.out.println( countXX("xxx") );
		System.out.println( countXX("xxxx"));

	}

}
