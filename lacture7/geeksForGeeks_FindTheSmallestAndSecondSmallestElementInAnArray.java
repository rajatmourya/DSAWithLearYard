package lacture7;

import java.util.Scanner;

public class geeksForGeeks_FindTheSmallestAndSecondSmallestElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of element in the Array: ");
        long n = sc.nextInt();
        long arr[] = Arrays.getArray(n);
        long ans[] = minAnd2ndMin(arr,n);
        Arrays.display(ans);
    }
    public static long[] minAnd2ndMin(long a[], long n){
        long smallest = Integer.MAX_VALUE;
        long secondSmallest = Integer.MAX_VALUE;
        for (long e : a) {
            if(e < smallest){
                secondSmallest = smallest;
                smallest = e;
            } else if(smallest != e && secondSmallest > e){
                secondSmallest = e;
            }
        }
        if (secondSmallest == Integer.MAX_VALUE){
            smallest = - 1;
            secondSmallest = -1;
        }
//        long ans[] = {smallest, secondSmallest};
//        return ans;
        return new long[] { smallest,secondSmallest};
    }
}
