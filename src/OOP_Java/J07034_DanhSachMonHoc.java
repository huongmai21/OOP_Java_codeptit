
package OOP_Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MonHoc implements Comparable<MonHoc>{
    private String ma, ten;
    private int tc;

    public MonHoc(String ma, String ten, int tc) {
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
    }
    
    

    @Override
    public int compareTo(MonHoc o) {
       return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tc ;
    }
    
    
}
public class J07034_DanhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        ArrayList<MonHoc> ds = new ArrayList<>();
        while(n-- >0){
            sc.nextLine();
            String ma = sc.nextLine(), ten = sc.nextLine();
            int tc = sc.nextInt();
            ds.add(new MonHoc(ma,ten,tc));
        }
        Collections.sort(ds);
        for(MonHoc i : ds){
            System.out.println(i);
        }
        sc.close();
    }
}
