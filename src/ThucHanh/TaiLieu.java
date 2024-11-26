
package ThucHanh;

import static java.lang.System.in;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors; //???

public class TaiLieu implements Comparable<TaiLieu>{
    protected String ma, tenNXB;
    protected int soBan;

    public TaiLieu() {
    }

    public TaiLieu(String ma, String tenNXB, int soBan) {
        this.ma = ma;
        this.tenNXB = tenNXB;
        this.soBan = soBan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    
    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    @Override
    public int compareTo(TaiLieu o) {
        // so ban PH tang dan int (double 1.23 1.27)
        //return this.soBan - o.getSoBan();
        
        //Sap xep theo ma: String
        return this.ma.compareToIgnoreCase(o.getMa());
    }
    
//    @Override
//    public int compareTo(TaiLieu o) {
//        // so ban PH tang dan int (double 1.23 1.27)
//        //return this.soBan - o.getSoBan();
//        
//        //Sap xep theo ma: String
//        return this.tenNXB.compareToIgnoreCase(o.getTenNXB());
//    }
    
    
    
}

class Sach extends TaiLieu{
    private String tenTG, tenSach;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tenTG, String tenSach, int soTrang) {
        this.tenTG = tenTG;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    
    public Sach(String tenTG, String tenSach, int soTrang, String ma, String tenNXB, int soBan) {
        super(ma, tenNXB, soBan);
        this.tenTG = tenTG;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

   

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String toString() {
        return getMa() + " " + tenSach + " " + tenTG + " " + soTrang;
    }
    
    @Override
    public int compareTo(TaiLieu o) {
        // so ban PH tang dan int (double 1.23 1.27)
        //return this.soBan - o.getSoBan();
        
        //Sap xep theo ma: String
        return this.ma.compareToIgnoreCase(o.getMa());
    }
    
}

class TapChi extends TaiLieu{
    private int soPH, thangPH;

    public TapChi(String ma, String nxb, int soBan) {
        super(ma, nxb, soBan);
    }

//    public TapChi(int soPH, int thangPH) {
//        this.soPH = soPH;
//        this.thangPH = thangPH;
//    }
    
    public TapChi(String ma, String tenNXB, int soBan, int soPH, int thangPH) {
        super(ma, tenNXB, soBan);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }
    
    public String toString() {
        return getMa() + " " + soPH + " " + thangPH + " "  + getTenNXB() + " " + getSoBan();
    }
    
    
}


interface ChucNang{
    public TaiLieu nhap(Scanner in);
    public void nhapSach(Scanner in);
    public void nhapTapChi(Scanner in);
    
    public void out();
    
    public List<TaiLieu> timTheoTenNXB(String key);
    public List<Sach> timTheoTenSach(String key);
    
    public void xoaTheoMa(String ma);//xoa 1
    public void xoaTheoTen(String ten);//xoa nhieu
    
    public void suaTaiLieu(String ma, Scanner in);
    public void suaSach(String ten,Scanner in);
    
    //Sap xep theo int , double
    public void sapxepTheoSoBanPH();
    //Sap xep theo String
    public void sapxepTheoNXB();
    
    //2 tieu chi ho va ten
    //sap xep sach ho ten tac gia
    public void sapxepSachTheoTenTG();
    //thong ke count, sum, avg, mã, min
    //Tai Lieu
    //count: moi nxb (group) co bao nhieu dau sach
    public void demNhomNXB();
    //sum so ban ph theo nxb
    //public void 
    public <T extends TaiLieu> void hienThi(List<T> a);
    
}

class QLTaiLieu implements ChucNang{
    private List<TaiLieu> a;

    public QLTaiLieu(List<TaiLieu> a) {
        this.a = a;
    }

    public QLTaiLieu(){
        a=new ArrayList<>();
        a.add(new Sach("S001", "Giao duc", 210, "Tran Gia Que", " cnpm", 2000));
        a.add(new Sach("S002", "Buu Chinh", 400, "Trinh Thi Van Anh", " Ky thuat do hoa", 120));
        a.add(new TapChi("TC001", "ptit", 20, 6, 1));
        a.add(new TapChi("TC002", "kim dong", 12, 20, 12));
    }
    
    

    
    @Override
    public TaiLieu nhap(Scanner in) {
        String ma, ten;
        int so;
        while(true){
            ma = in.nextLine();
            if(getTaiLieuByMa(ma) == null){
                break;
            }
            System.err.println("");
        }
        ten = in.nextLine();
        so = Integer.parseInt(in.nextLine());
        return new TaiLieu(ma,ten,so);
    }
    
    public TaiLieu getTaiLieuByMa(String ma){
        for(TaiLieu i : a){
            if(i.getMa().equalsIgnoreCase(ma)){
                return i;
            }
        }
        return null;
    }
    
    public int getViTriTaiLieu(String ma){
        for(int i=0;i<a.size();i++){
            if(a.get(i).getMa().equalsIgnoreCase(ma))
                return 1;
        }
        return -1;
    }

    @Override
    public void nhapSach(Scanner in) {
        TaiLieu tl = nhap(in);
        String tenTacGia, tenSach;
        int soTrang;
        tenSach = in.nextLine();
        tenTacGia = in.nextLine();
        soTrang = Integer.parseInt(in.nextLine());
        a.add(new Sach(tl.getMa(),tl.getTenNXB(),tl.getSoBan(),tenTacGia,tenSach,soTrang));
    }

    @Override
    public void nhapTapChi(Scanner in) {
        TaiLieu tl=nhap(in);
        int soPH, thang;
        soPH=Integer.parseInt(in.nextLine());
        thang=Integer.parseInt(in.nextLine());
        a.add(new TapChi(tl.getMa(), tl.getTenNXB(), tl.getSoBan(), soPH, thang));
         
    }

    @Override
    public List<TaiLieu> timTheoTenNXB(String s) {
        
        return null;
        
    }

    @Override
    public List<Sach> timTheoTenSach(String key) {
        List<Sach> list = new ArrayList<>();
        for(TaiLieu i : a){
            if(i instanceof Sach){
                if(((Sach)i).getTenSach().toLowerCase().contains(key.toLowerCase()))
                    list.add((Sach)i);
            }
        }
        return list;
    }

    @Override
    public void xoaTheoMa(String ma) {
        TaiLieu tl=getTaiLieuByMa(ma);
        if(tl==null){
            System.out.println("khong tim thay");
        }else
            a.remove(tl);
    }

    @Override
    public void xoaTheoTen(String ten) {
        
    }

    @Override
    public void suaTaiLieu(String ma,Scanner in) {
        int p=getViTriTaiLieu(ma);
        if(p==-1){
            System.out.println("khong tim thay");
        }
        else{
            TaiLieu t=a.get(p);
            t.setTenNXB(in.nextLine());
            t.setSoBan(Integer.parseInt(in.nextLine()));
            System.out.println("Sua thanh cong");
        }
    }

    @Override
    public void suaSach(String ten, Scanner in) {
        
    }

    @Override
    public <T extends TaiLieu> void hienThi(List<T> a) {
        
    }

    @Override
    public void sapxepTheoSoBanPH() {
        
    }


    @Override
    public void sapxepTheoNXB() {
        Collections.sort(a, new Comparator<TaiLieu>(){
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
               //tang dan
               return o1.getTenNXB().compareToIgnoreCase(o2.getTenNXB());
               //giam dan
               //return o2.getTenNXB().compareToIgnoreCase(o1.getTEnNXB());
            }
            
        });
    }

    @Override
    public void sapxepSachTheoTenTG() {
         Collections.sort(a, new Comparator<TaiLieu>(){
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
               //tang dan
              //return o1.getTenNXB().compareToIgnoreCase(o2.getTenNXB());
               //giam dan
               
               return ((Sach)o2).getTenTG().compareToIgnoreCase(((Sach)o1).getTenTG());
            }
            
        });
    }
    
    @Override
    public void out() {
        for(TaiLieu i: a){
            System.out.println(i);
        }
    }

    @Override
    public void demNhomNXB() {
        Map<String,Long> m=a.stream().collect(
                Collectors.groupingBy(TaiLieu::getTenNXB, 
                        Collectors.counting()));
        
        for(String k:m.keySet()){
            System.out.println(k+":"+m.get(k));
        }
    }

    
}