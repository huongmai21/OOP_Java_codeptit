
package OOP_Java;

import java.util.Scanner;
import java.lang.Math;

class PS{
    private long tu, mau;

    public PS(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    
    public void rutgon(){
        long uc = gcd(tu, mau);
        tu /= uc;
        mau /= uc;
        System.out.println(tu + "/" + mau);
    }
}

public class J04003_PhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PS p = new PS(sc.nextLong(), sc.nextLong());
        p.rutgon();
    }
}
