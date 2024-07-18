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

    public static boolean uniqueOccurrences(int[] arr){
        int n = arr.length;
        int[] temp = new int[2001];
        int[] temp1 = new int[n];
        boolean[] chek = new boolean[2001];
        Arrays.fill(chek,false);
        int k = 0;
        Arrays.fill(temp,0);
        for (int e: arr) {
            temp[1000+e] += 1;
        }
        for (int e: arr) {
            if (!chek[1000+e]){
                temp1[k] = temp[1000+e];
                chek[1000+e] =true;
                k+=1;
            }
        }
        for (int i = 0; i < n; i++) {
            if(temp1[i] != 0){
                for (int j = i+1; j < n; j++) {
                    if(temp1[j] != 0){
                        if (temp1[j] == temp1[i]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
//    public static boolean uniqueOccurrences(int[] arr) {
//        int len = arr.length;
//        boolean ans = true;
//        int temp[] = new int[1001];
//        int temp1[] = new int[len];
//        Arrays.fill(temp,0);
//
//        for (int e: arr) {
//            if(e<0){
//                temp[2000+e] += 1;
//            }else{
//                temp[e] += 1;
//            }
//        }
//
//        int f = 0, r = 1000;
//        while (f != 999){
//            if((temp[f] == 0 && temp[r] ==0) || temp[f] == 0) {
//                f+=1;
//                r=1000;
//                continue;
//            } else if (temp[r] == 0) {
//                r--;
//            } else if(temp[f] == temp[r] && f != r){
//                ans = false;
//                break;
//            } else if (f != r) {
//                r--;
//            }else if (f == r){
//                f++;
//                r = 1000;
//            }
//
//
//        }
//
//        return ans;
//    }
}
