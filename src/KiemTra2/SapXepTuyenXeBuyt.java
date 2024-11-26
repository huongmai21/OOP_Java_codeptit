
package KiemTra2;

import java.util.Scanner;

class TuyenXe{
    private String ma, taiXe;
    private String ngayDi,sohieu;
    private int soluot;
    private String kieungay;
    private int doanhthu;
    
    public static int sma = 1;
    
    public TuyenXe(String ma, String taiXe, String ngayDi, String sohieu, int soluot, String kieungay, int doanhthu) {
        this.ma = "HN"+ sohieu + String.format("%03d", sma++);
        this.taiXe = taiXe;
        this.ngayDi = ngayDi;
        this.sohieu = sohieu;
        this.soluot = soluot;
        this.kieungay = kieungay;
        this.doanhthu = doanhthu;
    }

    public TuyenXe() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTaiXe() {
        return taiXe;
    }

    public void setTaiXe(String taiXe) {
        this.taiXe = taiXe;
    }

    public String getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(String ngayDi) {
        this.ngayDi = ngayDi;
    }

    public String getSohieu() {
        return sohieu;
    }

    public void setSohieu(String sohieu) {
        this.sohieu = sohieu;
    }

    public int getSoluot() {
        return soluot;
    }

    public void setSoluot(int soluot) {
        this.soluot = soluot;
    }

    public String getKieungay() {
        return kieungay;
    }

    public void setKieungay(String kieungay) {
        this.kieungay = kieungay;
    }

    public int getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(int doanhthu) {
        this.doanhthu = doanhthu;
    }
    
    
    
}
public class SapXepTuyenXeBuyt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-- >0){
            
        }
    }
}
