package String3;
/*Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
* 
* */
public class maxBlock {
	public static  int maxBlock(String str) {
		  int res=0;
		  for(int i=0;i<str.length();i++){
		    int count=1;
		    for(int j=i+1;j<str.length()-1;j++){
		      if(str.charAt(i)==str.charAt(j)){
		        count++;
		      }else{
		        break;
		      }
		  }
		  res=Math.max(res,count);
		}
		return res;
		}
	public static void main(String[] args) {
		System.out.println(maxBlock("hoopla"));
		System.out.println(maxBlock("abbCCCddBBBxx"));
		System.out.println(maxBlock("")
				);
	}
}
