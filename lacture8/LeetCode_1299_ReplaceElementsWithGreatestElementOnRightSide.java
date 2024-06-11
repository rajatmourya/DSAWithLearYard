package lacture8;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode_1299_ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of element in the Array: ");
        int n = sc.nextInt();
        int arr[] = lacture7.Arrays.getArray(n);
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        ans[n-1] = -1;
        ans[n-2] = arr[n-1];
        for (int i = n-3; i >= 0; i--) {
            if (arr[i+1] > ans[i+1]){
                ans[i] = arr[i+1];
            }else{
                ans[i] = ans[i+1];
            }
        }
        return ans;
    }
}
