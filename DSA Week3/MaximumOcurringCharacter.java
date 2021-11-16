package Week3;
import java.util.*;

public class MaximumOcurringCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char max = getMaxOccuringChar(str);
        System.out.println(max);
    }
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int[] arr = new int[26];
        line.toLowerCase();
        for(int i=0; i<line.length();i++ ){
            int idx = line.charAt(i) - 'a';
            arr[idx]++;
        }
        int max=0;
        char ans = 'a';
        for(int i=0; i<arr.length ;i++ ){
            int val = arr[i];
            
            if(val>max){
                max = val;
                ans = (char)(i+'a');
            }
        }
        return ans;
    }
}
