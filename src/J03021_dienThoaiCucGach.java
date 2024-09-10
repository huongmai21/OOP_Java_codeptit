
import java.util.Scanner;

public class J03021_dienThoaiCucGach {
    public static String val(Character s){
        if(s <= 'C') return "2";
        else if(s <= 'F') return "3";
        else if(s <= 'I') return "4";
        else if(s <= 'L') return "5";
        else if(s <= 'O') return "6";
        else if(s <= 'S') return "7";
        else if(s <= 'V') return "8";
        else return "9";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            String s = sc.next().toUpperCase();
            String res = "";
            for(int i=0;i<s.length();++i){
                res += val(s.charAt(i));
            }
            StringBuilder sb = new StringBuilder(res);
            sb.reverse();
            if(res.equals(sb.toString())) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
