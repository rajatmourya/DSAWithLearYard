package lacture7;

public class ArrayDisplay {

    public static class Display{
        public static void display(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==0 && arr[i+1]==0){
                    break;
                }
                System.out.print(arr[i] + " ");
            }
        }
    }
}
