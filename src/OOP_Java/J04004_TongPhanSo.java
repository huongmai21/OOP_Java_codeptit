
package OOP_Java;

import java.util.Scanner;

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
    
    public static long lcm(long a, long b){
        return a/gcd(a,b) * b;
    }
    
    public void rutgon(){
        long uc = gcd(tu, mau);
        tu /= uc;
        mau /= uc;
        System.out.println(tu + "/" + mau);
    }
    
    public void tong(PS p){
        long mc = lcm(this.mau, p.mau);
        this.tu *= mc/this.mau;
        p.tu *= mc/p.mau;
        long tc = this.tu + p.tu;
        new PS(tc,mc).rutgon();
    }
}

public class J04004_TongPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PS p1 = new PS(sc.nextLong(), sc.nextLong());
        PS p2 = new PS(sc.nextLong(), sc.nextLong());
        p1.tong(p2);
    }
}
