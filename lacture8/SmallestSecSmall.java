package lacture8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallestSecSmall {
    public static void main(String[] args) {
        // long arr[] = {5,1,5,6,3,2};
        long arr[] = {5,1,2,4,1,5,6,3,2};

        // long arr[] = {1,1,1,1,1};
        // Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(minAnd2ndMin(arr, arr.length)));
        System.out.println(Arrays.toString(minAnd2ndMinNo(arr, arr.length)));
    }
    public static long[] minAnd2ndMin(long a[], long n){
        long small = Integer.MAX_VALUE;
        long secsmall = Integer.MAX_VALUE;
        for (long i : a) {
            if(small > i){
                small = i;
            }
        }

        for (long i : a) {
            if(i == small){
                continue;
            }
            if(secsmall > i){
                secsmall = i;
            }
        }

        if(secsmall == Integer.MAX_VALUE ){
            small = -1;
            secsmall = -1;
        }

        return new long[] { small,secsmall};
    }  
    
    public static long[] minAnd2ndMinNo(long a[], long n){
        long small = Integer.MAX_VALUE;
        long secsmall = Integer.MAX_VALUE;
        for (long i : a) {
            if(i < small){
                secsmall = small;
                small = i;
            }else if(i != small && secsmall > i){
                secsmall = i;
            }
            
        }
        if(secsmall == Integer.MAX_VALUE ){
            small = -1;
            secsmall = -1;
        } 
        return new long[] { small,secsmall};
    }
}
