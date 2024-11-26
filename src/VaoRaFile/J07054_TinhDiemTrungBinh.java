
package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
    static int sma = 1;
    private String ma, ten;
    private double d1, d2, d3, tb;
    private int thuHang;

    public SinhVien(String ten, double d1, double d2, double d3) {
        this.ma = "SV" + String.format("%02d", sma++);
        this.ten = chuanHoa(ten);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tb = (this.d1*3+this.d2*3+this.d2*2)/8;
        this.tb = (double)Math.round(this.tb*100) /100;
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

    public double getTb() {
        return tb;
    }

    public int getThuHang() {
        return thuHang;
    }

    public void setThuHang(int thuHang) {
        this.thuHang = thuHang;
    }
    
    @Override
        public String toString(){
            return String.format("%s %s %.2f %d",this.ma,this.ten,this.tb,this.thuHang);
    }
    @Override
    public int compareTo(SinhVien o) {
        if(this.tb<o.tb) return 1;
        if(this.tb>o.tb) return -1;
        return this.ma.compareTo(o.ma);
    }
}
public class J07054_TinhDiemTrungBinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc  = new Scanner(new File("BANGDIEM.in"));
        int t = sc.nextInt();
        ArrayList<SinhVien> ds = new ArrayList<>();
        while(t-- >0){
            sc.nextLine();
            ds.add(new SinhVien(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(ds);
        ds.get(0).setThuHang(1);
        System.out.println(ds.get(0));
        for(int i = 1; i<t; i++){
            if(ds.get(i).getTb() == ds.get(i-1).getTb())
                ds.get(i).setThuHang(ds.get(i-1).getThuHang());
            else 
                ds.get(i).setThuHang(i+1);
            System.out.println(ds.get(i));
        }
    }
}
