package Warm_Up1;
/*
Return true if the given string contains between 1 and 3 'e' chars.
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
*/
public class stringE {
	public static  boolean stringE(String str) {
		  if(str.length()==0)return false;
		  int count=0;
		  for(int i=0;i<str.length();i++){
		    if(str.charAt(i)=='e'){
		    count++;
		     }
		  }
		  
		return (count==3||count==1)?true:false; 
		  
		}
	public static void main(String[] args) {
		System.out.println( stringE("Hello") );
		System.out.println( stringE("Heelle"));
		System.out.println( stringE("Heelele") );

	}

}
