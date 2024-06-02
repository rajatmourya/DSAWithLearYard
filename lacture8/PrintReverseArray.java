package lacture8;

public class PrintReverseArray {
    public static void main(String[] args) {
        int arr[] = {5,1,5,6,3,2};
        for (int i = arr.length -1; i > 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
