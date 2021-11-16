package Week3;
import java.util.*;
public class ToggleString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++ ){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append((char) (ch-32));
            }else if(ch>='A' && ch<='Z'){
                sb.append( (char) (ch+32));
            }
        }
        System.out.println(sb);
    }
}
