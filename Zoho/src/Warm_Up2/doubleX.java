package Warm_Up2;
/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
*/
public class doubleX {
	public static boolean doubleX(String str) {
		 for(int  i=0;i<str.length()-1;i++){
		   if(str.length()<2)return false;
		   if(str.charAt(i)=='x'){
		     if(str.charAt(i+1)=='x'){
		       return true;
		     }else{
		        return false;
		     }
		   }
		  
		 }
		   return false;
		}
	public static void main(String[] args) {
		System.out.println( doubleX("axxbb"));
		System.out.println( doubleX("axaxax"));
		System.out.println( doubleX("xxxxx"));

	}

}
