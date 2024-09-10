
import java.util.Scanner;
import java.math.BigInteger;

public class J03033_boiSoChungNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(a.divide(a.gcd(b)).multiply(b));
        }
    }
}
