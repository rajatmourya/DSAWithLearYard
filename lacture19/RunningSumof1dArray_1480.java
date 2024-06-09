package lacture19;

import lacture7.ArrayDisplay;

public class RunningSumof1dArray_1480 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = runningSum(nums);
        ArrayDisplay.Display.display(ans);
    }

    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            ans[i] = ans[i-1]+nums[i];
        }
        return ans;
    }
}
