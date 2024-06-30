package lacture24_Recursion;

import java.util.Scanner;

public class SearchingANumber {
    public static void main(String[] args) {
        Solution q = new Solution();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Element in the Array");
        int n = sc.nextInt();
        System.out.print("Enter the element of the array");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K:");
        int k = sc.nextInt();
//        int n = 5;
//        int k = 9;
//        int[] arr = {9, 7, 2, 16, 4};
        System.out.println(q.search(n, k, arr));
    }
}

class Solution {
    public int search(int n, int k, int[] arr) {
        return searchHelpper(0,n,k,arr);
    }

    public int searchHelpper(int l, int n, int k, int[] arr){
        if(arr[l] == k){
            return l+1;
        }
        else if (l < n-1) {
            return searchHelpper(l+1,n,k,arr);
        }else return -1;
    }


}
