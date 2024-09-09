
import static java.lang.Math.max;
import static java.lang.Math.sqrt;
import java.util.*;

public class J01014_uocSoNguyenToLonNhat {
    public static long nt(long n){
        double sqr = sqrt(n);
        long res = -1;
        for(int i=2;i<=sqr;++i){
            if(n%i==0){
                res = max(res,i);
                while(n%i == 0){
                    n/=i;
                }
            }
        }
        if(n > 1) res = max(res, n);     
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            System.out.println(nt(n));
        }
    }
}
