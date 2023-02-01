import java.util.Arrays;

public class FirstAndLastPositionBinary {
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,9,10,10,10,45,45};
        int target= 11;
        int[] ans= searchRange(nums, target);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        int start= search(nums, target, true);
        int end= search(nums, target,false);
         ans[0]= start;
         ans[1]= end;

         return ans;
    }

    static int search(int[] nums,int target, boolean findstartindex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (target < nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                start=mid+1;
            else {
                ans = mid;
                if(findstartindex)
                    end=mid-1;
                else
                    start=mid+1;
            }

        }
        return ans;

    }
}
