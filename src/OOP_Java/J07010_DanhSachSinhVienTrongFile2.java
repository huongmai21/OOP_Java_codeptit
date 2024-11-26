//WA

package OOP_Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class SinhVien{
    public static int dem = 1;
    
    private  String ma, ten, lop, ns;
    private float gpa;

    public SinhVien(String ten,  String lop, String ns, float gpa) {
        this.ma = getMa(dem++);
        this.ten = ten;
        this.ns = ns;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String getMa(int n) {
        String s = String.valueOf(n);
        while(s.length() < 3) s = '0' + s;
        return "B20DCCN" + s;
    }
    
    public void chuanHoa1(){
        StringBuilder sb = new StringBuilder(ten);
        String[] s = ten.trim().split("\\s+");
        for(String x : s){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int i = 1;i<x.length();++i){
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        ten = sb.toString();
    }
    
    public void chuanHoa2(){
        StringBuilder sb = new StringBuilder(ns);
        if(sb.charAt(1) == '/')
            sb.insert(0, '0');
        if(sb.charAt(4) == '/')
            sb.insert(3, '0');
        ns = sb.toString();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + "" + ns + " " + String.format("%.2f", gpa);
    }
    
    
    
}

public class J07010_DanhSachSinhVienTrongFile2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = sc.nextInt();
        //ArrayList<SinhVien> ds = new ArrayList<>();
        sc.nextLine();
        while(t-- > 0){
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            Float gpa = Float.parseFloat(sc.nextLine());
            SinhVien s = new SinhVien(name, lop, ns, gpa);
            s.chuanHoa2();
            System.out.println(s);
        }
//        for(SinhVien x : ds){
//            System.out.println(x);
//        }
    }
}
