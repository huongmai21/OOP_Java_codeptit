
import java.lang.StringBuilder;
import java.util.Scanner;

public class J03040_bienSoDep {
    public static boolean sd(String s){
        StringBuilder sb = new StringBuilder(s.substring(5));
        sb.deleteCharAt(3);
        int tang = 1,lp=1,bang=0;
        for(int i=0;i<5;i++){
            if(sb.charAt(i)!='6'&&sb.charAt(i)!='8') lp=0;
            if(i>0 && sb.charAt(i)<=sb.charAt(i-1)) tang=0;
        }
        if(sb.charAt(0)==sb.charAt(1)&&sb.charAt(1)==sb.charAt(2)&&sb.charAt(3)==sb.charAt(4)) 
            bang=1;
        return lp+tang+bang>0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(sd(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
