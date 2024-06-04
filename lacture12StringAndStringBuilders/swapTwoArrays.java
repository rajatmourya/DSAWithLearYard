package lacture12StringAndStringBuilders;

public class swapTwoArrays {
    public static void main(String[] args) {
        int a[] = {11, 12,13,14};
        int b[] = {15, 16, 17, 18};
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i]= temp;
        }
        display(a);
        display(b);
    }

    public static void display(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +",");
        }
        System.out.println();
    }
}
