package lacture7;

import java.util.Arrays;
import java.util.Scanner;

public class NonDecreasingArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many time you want to Iterate : ");
        int test_cases = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        while((test_cases--)>0){
            System.out.println("Enter the total number of element in the Array: ");
            int n = scanner.nextInt();
            System.out.println("Enter the element of the Array: ");
            long prev = scanner.nextLong();
            sb.append(prev+" ");
            for(int i=1; i<n; i++){
                long curr = scanner.nextLong();
                curr = curr * ((curr+prev-1)/curr);
                prev = curr;sb.append(curr+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());

    }


}
