package String1;
/*Given a string, if the first or last chars are 'x', return the string without those
 *  'x' chars, and otherwise return the string unchanged.
withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 * */
public class withoutX {
	public static String withoutX(String str) {
		if(str.length()<2)return "";		  
		int start=0;int end=str.length()-1;
		String res=""; 
		  if(str.charAt(start)!='x'&& str.charAt(end)!='x'){
		    return str.substring(start,end+1);}
		  else{
		    res+=(str.charAt(0)=='x') ?str.substring(start+1,end):str.substring(start,end);
		    if(str.charAt(end)!='x') {res+=str.charAt(end);}
		  }
		 return  res;
		}

	public static void main(String[] args) {
		System.out.println(withoutX("xHix"));
	 	System.out.println(withoutX("xHi"));
		System.out.println(withoutX("Hxix"));

	}

}
