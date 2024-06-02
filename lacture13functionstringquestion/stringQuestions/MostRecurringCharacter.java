package lacture13functionstringquestion.stringQuestions;

import java.util.Scanner;

public class MostRecurringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[(int)s.charAt(i)] += 1;
        }
        int maxFreq = 0;
        char ans = '\0';

        for (int i = 0; i < 256; i++) {
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                ans = (char)i;
            }
        }

        System.out.println(ans);

    }    
}
