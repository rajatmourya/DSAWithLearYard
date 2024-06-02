package lacture8;

public class DiffMaxMin {
    public static void main(String[] args) {
        int arr[] = {5,1,5,6,3,2};
        int max = arr[1];
        int min = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println("Difference of Maximum Number and Minimum Number is:"+ (max-min));
    }
    
}
