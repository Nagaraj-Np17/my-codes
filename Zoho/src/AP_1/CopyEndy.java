package AP_1;

public class CopyEndy {
	public int matchUp(String[] a, String[] b) {
		  int  start=0;int count=0;
		  while(start<a.length){
		    String astr=a[start];String bstr=b[start];
		    if(astr.length()>0&&bstr.length()>0&&(astr.charAt(0)==bstr.charAt(0))){
		      count++;
		    }
		    start++;
		    
		  }return count;
		  
		  
		}

}
