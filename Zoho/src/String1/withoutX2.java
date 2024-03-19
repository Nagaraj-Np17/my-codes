package String1;
/*Given a string, if one or both of the first 2 chars is 'x', 
 * return the string without those 'x' chars, and otherwise return the string unchanged.
 *  This is a little harder than it looks.
withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 * */
public class withoutX2 {
	public static String withoutX2(String str) {
		  if(str.length()<=1)return "";
		  int start=0;
		  if(str.charAt(start)=='x'&&str.charAt(start+1)=='x'){
		    return str.substring(2);
		  }
		  String  res="";
		  if(str.charAt(start)=='x'&&  str.charAt(start+1)!='x')return str.substring(1);
		  else if(str.charAt(start)!='x'){
		    res+=str.charAt(start);
		    if(str.charAt(start+1)=='x') {res+=str.substring(start+2);}
		    else{
		      res+=str.substring(start+1);
		    }
		    return res;
		}
		return "";
		}

	public static void main(String[] args) {
		System.out.println(withoutX2("xHi"));
	 	System.out.println(withoutX2("Hxi"));
		System.out.println(withoutX2("Hi"));

	}

}
