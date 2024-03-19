package March5;


public class Recursion6 {
    public static boolean sixOrNot(int[] nums, int index) {
        if(index==nums.length)
          return false;
        if(nums[index]==6) return true ;
        return sixOrNot(nums,++index);
      }
    public static void main(String[] args) {
    int arr[]={1,2,7};
    System.out.println(sixOrNot(arr,0));
        
    }
}
