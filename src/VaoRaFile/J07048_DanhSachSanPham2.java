package VaoRaFile;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;


class SanPham implements Comparable<SanPham>{
    private String ma, ten;
    private int gia, baohanh;

    public SanPham(Scanner sc) {
        this.ma = sc.next();
        sc.nextLine();
        this.ten = sc.nextLine();
        this.gia = sc.nextInt();
        this.baohanh = sc.nextInt();
    }

  
    @Override
    public int compareTo(SanPham o) {
        if(this.gia < o.gia) return 1;
        else if(this.gia > o.gia) return -1;
        else return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + baohanh ;
    }
    
    
}
public class J07048_DanhSachSanPham2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = sc.nextInt();
        ArrayList<SanPham> ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new SanPham(sc));
        }
        Collections.sort(ds);
        for(SanPham x : ds){
            System.out.println(x);
        }
    }
}
