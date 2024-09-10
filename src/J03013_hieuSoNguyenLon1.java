
import java.util.Scanner;
import java.lang.Math;
import static java.lang.Math.max;
import java.math.BigInteger;
import java.lang.String;

public class J03013_hieuSoNguyenLon1 {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            String s = String.valueOf(a.subtract(b).abs());
            int len = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
            while (s.length() < len)
                s = "0" + s;
            System.out.println(s);
        }
        
    }
}
