
import java.math.BigInteger;
import java.util.Scanner;

public class J03039_chiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger l = a.max(b), m =a.min(b);
            BigInteger res = l.divide(m);
            if(res.multiply(m).equals(l)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
