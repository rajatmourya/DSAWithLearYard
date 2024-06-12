package lacture8;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode_1207_UniqueNumberOofOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of element in the Array: ");
        int n = sc.nextInt();
        int arr[] = lacture7.Arrays.getArray(n);
        System.out.println("the number of occurrences of each value in the array is unique :" + uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        boolean ans = true;
        int temp[] = new int[1001];
        Arrays.fill(temp,0);

        for (int e: arr) {
            if(e<0){
                temp[2000+e] += 1;
            }else{
                temp[e] += 1;
            }
        }
        int f = 0;
        int r = 1000;
        while (f != 999){
            if((temp[f] == 0 && temp[r] ==0) || temp[f] == 0) {
                f+=1;
                r=1000;
                continue;
            } else if (temp[r] == 0) {
                r--;
            } else if(temp[f] == temp[r] && f != r){
                ans = false;
                break;
            } else if (f != r) {
                r--;
            }else if (f == r){
                f++;
                r = 1000;
            }


        }

        return ans;
    }
}
