
import java.util.Scanner;

public class J03024_soUuThe {
    public static String ut(String s){
        if(s.charAt(0) == '0') return "INVALID";
        int len = s.length();
        int cntc = 0;
        for(int i=0;i<s.length();++i){
            if(Character.isAlphabetic(s.charAt(i)))
                return "INVALID";
            else{
                if((int)s.charAt(i)%2 == 0) ++cntc;
            }
        }
        if(len%2 == 0 && 2*cntc >len ) return "YES";
        if(len%2 == 1 && 2*cntc < len) return "YES";
        return "NO"; 
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            String s = sc.next();
            System.out.println(ut(s));
        }
    }
}
