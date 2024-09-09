
import static java.lang.Math.*;
import java.util.*;

public class J01008_phanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;++i){
            int n = sc.nextInt();
            System.out.print("Test "+i+": ");
            for(int j=2;j<=sqrt(n);++j){
                if(n%j==0){
                    int dem = 0;
                    while(n%j==0){
                        dem++;
                        n/=j;
                    }
                    System.out.print(j+"("+dem+") ");
                }
            }
            if(n>1) 
                System.out.print(n+"(1)");
            System.out.println();
        }
    }
}
