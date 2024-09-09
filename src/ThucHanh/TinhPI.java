import java.util.Scanner;
        
public class TinhPI {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            double ep = sc.nextDouble();
            int d = -1 ;
            int n = 1;
            double s = 1, a = 1.0/(2 * n + 1);
            while(a >= ep){
                s = s + d * a;
                d = -d;
                n++;
                a = 1.0/(2 * n + 1);
            }
            System.out.println(s * 4 +"");
        }
    }
}
