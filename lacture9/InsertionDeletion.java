package lacture9;

import java.util.*;

public class InsertionDeletion {

    public static void display(int arr[], int n){
        for(int i = 0; i < n; i++){
            if(i == 0)
                System.out.print("[");
            System.out.print(arr[i]);
            if (i < n -1) {
                System.out.print(",");                
            }else{
                System.out.print("]");
            }
        }
        System.out.println();
    }
    
    public static int pushBack(int arr[],int val, int n){
        if(n == arr.length){
            return n;
        }
        arr[n] = val;
        return n+1;
    }
    
    public static int popBack(int arr[], int n){
        if(n == 0){
            return n;
        }
        System.out.println(arr[n-1]);
        arr[n-1] = 0;
        return n-1;
    }
    
    public static int pushFront(int arr[],int val, int n){
        if(n == arr.length){
            return n;

        }
        for (int i = n-1; i >= 0; i--) {
            arr[i+1] = arr[i]; 
        }
        arr[0] = val;
        return n+1;
    }

    public static int popFront(int arr[], int n){
        if(n == 0){
            return 0;

        }
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = 0;
        return n-1;
    }
    
    public static int push(int arr[],int val,int index, int n){
        if(n == arr.length){
            return 0;
        }

        if (index < 0 || index > n) {
            return 0;
        }

        for (int i = n; i >= index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = val;
        return n+1;

    }

    public static int pop(int arr[],int index, int n){
        if(n == 0){
            return 0;
        }

        for (int i = index; i < n-1; i++) {
                arr[i] = arr[i+1];
            }
        arr[n-1] = 0;
        return n-1;

    }

    public static void main(String[] args) {
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        display(arr, n);

        //Push Back
        n = pushBack(arr, 5, n);
        display(arr, n);

        //Push Back
        n = pushBack(arr, 15, n);
        display(arr, n);

        //Pop Back
        n = popBack(arr, n);
        display(arr, n);

        //Pop Back
        n = popBack(arr, n);
        display(arr, n);

        //PushFornt
        n = pushFront(arr, 10, n);
        display(arr, n);

        //popFront
        n = popFront(arr, n);
        display(arr, n);

        //Push
        n = push(arr,21,3, n);
        display(arr, n);
        
        //Push
        n = push(arr,112,3, n);
        display(arr, n);

        //Push
        n = pop(arr,1, n);
        display(arr, n);
        System.out.println(n);

        

    }
    
}
