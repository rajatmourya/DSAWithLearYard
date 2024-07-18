package lacture9;

import java.util.Scanner;

public class GeeksforGeeks_Row_with_max_1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Row:");
        int row = sc.nextInt();
        System.out.println("Enter the number of Column:");
        int col = sc.nextInt();
        System.out.println("Enter the Element of the Matrix:");
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(rowWithMax1s(mat));
    }
    public static int rowWithMax1s(int arr[][]) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 1){
                    temp += 1;
                }
            }
            System.out.println(temp);
            if(temp > count){
                count = temp;
                max = i;
            }
        }
        if(count == 0){
            return -1;
        }
        return max;
    }
}
