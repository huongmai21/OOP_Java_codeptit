
package KiemTra2;

//de va van mau
//giao duc
//67000
//true
//so tay toan
//thien an
//36000
//false


import java.util.Scanner;
import java.lang.StringBuilder;

class Sach {
    protected String ma,ten, nhaXB;
    protected double gia;
    public static int sMa = 1;
    
   
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
    
    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }
    
    public void setMa(String ma) {
        this.ma = ma;
    }
    
    public String getMa() {
        
        return ma;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
   
}

interface ISach {
    public double getGiaBan();
}

class SachThamKhao extends Sach implements ISach{
    private boolean dungChung;

    public SachThamKhao() {
    }

    public boolean isDungChung() {
        return dungChung;
    }

    public void setDungChung(boolean dungChung) {
        this.dungChung = dungChung;
    }
    
    
    public void nhap(Scanner in){
        this.ten = in.nextLine();
        this.nhaXB = in.nextLine();
        this.gia = Double.parseDouble(in.nextLine());
        this.dungChung = Boolean.parseBoolean(in.nextLine());
        
        String nxb = nhaXB;
        String[] arr = nxb.split("\\s+");
        StringBuilder s = new StringBuilder("");
        for(String x : arr){
            s.append(Character.toUpperCase(x.charAt(0)));
        }
        s.append(String.format("%03d", sMa++));
        this.ma = s.toString();
//        this.setTen(name);
//        this.setNhaXB(nxb);
//        this.setMa(nxb);
//        this.setGia(cost);
//        this.setDungChung(dc);
    }
    
    @Override
    public double getGiaBan(){
        if(dungChung == true)
            super.setGia(super.getGia() * 0.9);
        else
            super.setGia(super.getGia());
        if(super.getNhaXB().equalsIgnoreCase( "giao duc"))
            super.setGia( super.getGia() * 0.95);
        
        return Math.round(super.getGia());
        
    }
    public String toString(){
        String res;
        if(dungChung == true)
            res = "Dung chung sgk";
        else res = "khong";
        return super.getMa()+" "+ super.getTen()+" "+ super.getNhaXB()
                +" "+ res+" "+ getGiaBan()+"\n";
    }

    
}

public class BaiToanQuanLySach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sach s = new SachThamKhao();
        ((SachThamKhao) s).nhap(in);
        System.out.println(s);
        ((SachThamKhao) s).nhap(in);
        System.out.println(s);
    }
}
