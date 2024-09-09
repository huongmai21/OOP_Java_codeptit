
import java.util.Scanner;

public class J02005_giaoCuaHaiDaySo {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m= sc.nextInt();
        int[] a = new int[1005];
        int[] b = new int[1005];
        for(int i=0;i<n;++i){
            int x = sc.nextInt();
            a[x] = 1;
        }
        for(int i=0;i<m;++i){
            int x = sc.nextInt();
            if(a[x] == 1){
                b[x] = 1;
            }
        }
        for(int i = 0 ;i<=1001;++i){
            if(b[i] == 1){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
}
