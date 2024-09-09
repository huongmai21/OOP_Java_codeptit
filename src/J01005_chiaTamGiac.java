
import static java.lang.Math.sqrt;
import java.util.*;

public class J01005_chiaTamGiac {
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
           int n = sc.nextInt(), h = sc.nextInt();
           for(int i=1;i<n;++i){
               double x = h * sqrt((double)i/n);
               System.out.printf("%.6f ",x);
           }
            System.out.println();
        }
    }
}
