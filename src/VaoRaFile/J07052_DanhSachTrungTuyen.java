
package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class ThiSinh implements Comparable<ThiSinh>{
    static double diemChuan;
    
    private String ma, ten;
    private double toan, ly, hoa;
    private double diemUT, diemXT;
    private String trangThai;
    
    public ThiSinh(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = chuanHoa(ten);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.diemUT = this.getDiemUT();
        this.diemXT = toan*2+hoa+ly+this.diemUT;
}

    public double getDiemUT() {
        if(this.ma.startsWith("KV1")) return 0.5;
        if(this.ma.startsWith("KV2")) return 1.0;
        if(this.ma.startsWith("KV3")) return 2.5;
        return 0;
    }

    public double getDiemXT() {
        return diemXT;
    }
    
    
    static String chuanHoa(String s){
        s = s.trim().toLowerCase();
            String res = "" + Character.toUpperCase(s.charAt(0));
            for(int i=1; i< s.length();i++){
                if(Character.isLetter(s.charAt(i))){
                    if(s.charAt(i-1) == ' ') res+= " "+ Character.toUpperCase(s.charAt(i));
                    else res += s.charAt(i);
                }
            }
            return res;
    }
     
    @Override
    public int compareTo(ThiSinh o) {
        if(this.diemXT > o.diemXT) return -1;
        if(this.diemXT < o.diemXT) return 1;
        return this.ma.compareTo(o.ma);
    }
    
    void inThongTin(){
            System.out.print(this.ma+' '+this.ten+' ');
            if((int)this.diemUT == this.diemUT ) System.out.printf("%.0f ",this.diemUT);
            else  System.out.printf("%.1f ",this.diemUT);
            if((int)this.diemXT == this.diemXT ) System.out.printf("%.0f ",this.diemXT);
            else  System.out.printf("%.1f ",this.diemXT);
            if(this.diemXT>=diemChuan) this.trangThai = "TRUNG TUYEN";
            else this.trangThai = "TRUOT";
            System.out.println(this.trangThai);
        }
    
    
}

public class J07052_DanhSachTrungTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = sc.nextInt();
        ArrayList<ThiSinh> ds = new ArrayList<>();
        while(t-- > 0){
            sc.nextLine();
            ds.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        int k = sc.nextInt();
        Collections.sort(ds);
        ThiSinh.diemChuan = ds.get(k-1).getDiemXT();
        System.out.printf("%.1f\n",ThiSinh.diemChuan);
        for(ThiSinh x : ds){
            x.inThongTin();
        }
    }
}
