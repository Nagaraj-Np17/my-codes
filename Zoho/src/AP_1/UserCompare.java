package AP_1;

public class UserCompare {
	public int userCompare(String aName, int aId, String bName, int bId) {
		  int compare=aName.compareTo(bName);
		  if(compare==0){
		    if(aId==bId) return 0;
		    else if(aId>bId)return 1;
		    else  return -1;
		  }
		  else if(compare<0){
		     if(aId>bId) return 1;
		     else return -1;
		  }
		   else if(compare>0){
		     if(aId<bId) return 1;
		     else return -1;
		  }
		  return 0;
		}

}
