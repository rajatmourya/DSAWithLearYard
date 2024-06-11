package lacture8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeetCode_2824_CountPairsWhoseSumIsLessThanTarget {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of element in the Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the element of Array: ");
        for (int i = 0; i < n; i++) {
            nums.add(i,sc.nextInt());
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        System.out.println(countPairs(nums, target));

    }
    public static int countPairs(List<Integer> nums, int target) {
        int ans = 0;
//        List<List<String>> listOfLists = new ArrayList<>();
        for(int i = 0;i < nums.size();i++){
            for(int j = i+1;j < nums.size(); j++){
                if((nums.get(i) + nums.get(j)) < target){
                    ans += 1;
                }
            }
        }
        return ans;
    }
}
