package Lacture3;

import java.util.*;

public class WaterCoinForChifMinister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            System.out.println(WaterCoinForChifMinisterHelpper(x));

    		// if(x >= 2000){
    		//     System.out.println("YES");
    		// }else{
    		//     System.out.println("NO");
    		// }

            
        }
    }

    
    public static String WaterCoinForChifMinisterHelpper(int n){
        String x = n >= 2000 ? "YES": "NO";
        return x;
    }
    
}
