package lacture8;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeForce_A_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();
        ArrayList<Integer> set3 = new ArrayList<>();
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(a[i] > 0){
                set1.add(a[i]);
            } else if (a[i] < 0) {
                set2.add(a[i]);
            }else if (a[i] == 0){
                set3.add(a[i]);
            }
        }

        if(set1.size() == 0){
            set1.add(set2.get(set2.size() - 1));
            set2.remove(set2.size()-1);
            set1.add(set2.get(set2.size() - 1));
            set2.remove(set2.size()-1);
        }

        System.out.println(1 + " " + set2.get(0));
        System.out.print(set1.size() + " ");
        for (int e:set1){
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.print(set3.size() + (set2.size() - 1) + " ");
        for (int e:set3){
            System.out.print(e + " ");
        }
        for (int i = 1; i < set2.size(); i++){
            System.out.print(set2.get(i) + " ");
        }
    }
}
