
package KiemTra2;

import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.List;

class Sach {
    private String ma,ten, nhaXB;
    private double gia;
    public static int sMa = 1;

    public Sach(String ma, String ten, String nhaXB, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.nhaXB = nhaXB;
        this.gia = gia;
    }
    
   
    public Sach() {
    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public String getMa() {
        String m = getNhaXB();
        String[] arr = m.split("\\s+");
        StringBuilder s = new StringBuilder("");
        for(String x : arr){
            s.append(Character.toUpperCase(x.charAt(0)));
        }
        s.append(String.format("%03d", sMa++));
        ma = s.toString();
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }
}


class QLSach{
    private List<Sach> a;

    public QLSach(List<Sach> a) {
        this.a = a;
    }
    
    public void nhap(Scanner in){
        String ten = in.nextLine();
        String nxb = in.nextLine();
        double gia = Integer.parseInt(in.nextLine());
        boolean dc = Boolean.parseBoolean(in.nextLine());
        String ma = this.getMa();
        
        this.setMa(ma);
        this.setTen(ten);
        this.setNhaXB(nxb);
        this.setGia(gia);
        this.setDungChung(dc);
    }
    
    public void minGiaTheoNXB(){
        
    }
}

public class BaiToanQuanLySach2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QLSach q=new QLSach();
        for (int i = 0; i < 4; i++) {
            q.nhap(in);
        }
        q.minGiaTheoNXB();
    }
}
