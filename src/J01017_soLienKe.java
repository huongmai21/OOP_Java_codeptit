import static java.lang.Math.abs;
import java.util.*;

public class J01017_soLienKe {
    public static String slk(String s){
        char[] a = s.toCharArray();
        for(int i=1;i<s.length();++i){
            if(abs(a[i] - a[i-1]) != 1)
                return "NO";
        }
        return "YES";
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            String n = sc.next();
            System.out.println(slk(n));
        }
    }

}
