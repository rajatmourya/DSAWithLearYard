package lacture8;

import java.util.Arrays;

public class ActualReverseArray {
    public static void main(String[] args) {
        int arr[] = {5,1,6,3,2,34,2};
        
        System.out.println(Arrays.toString(arr));
        
        System.out.println(Arrays.toString(Reverse(arr)));
    }

    static int[] Reverse(int[] arr){
        int n = arr.length-1;
        for (int i = 0; i < arr.length/2; i++, n-=1) {
            int temp = arr[n];
            arr[n] = arr[i];
            arr[i] = temp;
            if(n == 1){
                break;
            }
        }
        return arr;

    }
    
}
