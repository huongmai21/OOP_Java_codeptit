
package ThucHanh;

import java.util.Scanner;


class NhanCong{
    private String code, hoten;
    private long luongNgay;
    private int soNgay;
    
    public static int sma = 0;
    
    public NhanCong() {
    }

    public String getCode() {
        return code;
    }
    
    public long luongThang(){
        return luongNgay * soNgay;
    }
    
    public long thuong(){
        if(soNgay >= 25){
            return (long) (luongThang() * 0.02);
        }
        else if(soNgay >=22){
            return (long) (luongThang() * 0.01);
        }
        return 0;
    }
    
    public long getLuongThang(){
        return luongThang() + thuong();
    }
    
    public void input(Scanner in){
        ++sma;
        this.code = "NV" + String. + (sma+"");
        
    }

    @Override
    public String toString() {
        return code + " " + hoten + " " + getLuongThang();
    }
    
    
}

class QLNhanCong{

    public QLNhanCong(NhanCong[] nc) {
    }
    
    public void out(){
        
    }
}

public class QuanLyNhanCong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        NhanCong[] nn=new NhanCong[n];
        for (int i = 0; i < n; i++) {
            nn[i] = new NhanCong();
            nn[i].input(in);
        }
        QLNhanCong q=new QLNhanCong(nn);
        q.out();
    }

}
