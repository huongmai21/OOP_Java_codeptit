
import java.util.Scanner;

public class J03027_rutGonXauKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        while(sb.length()>1 && i<sb.length()-1){
            if(sb.charAt(i) == sb.charAt(i+1)){
                sb.delete(i, i+2);
                i = 0;
            }
            else ++i;
        }
        if(sb.length() > 0) System.out.println(sb);
        else System.out.println("Empty String");
    }
}
