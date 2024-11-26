
package OOP_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MatHang implements Comparable<MatHang>{
    private String ma, tenMH, dv;
    private int giaMua, giaBan, loiNhuan;
    
    public static int dem=1;

    public MatHang(String tenMH, String dv, int giaMua, int giaBan) {
        this.ma = getId(dem++) ;// this.ma = "MH" + String.format("%03d", cnt++)
        this.tenMH = tenMH;
        this.dv = dv;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        
    }

    public int getLoiNhuan() {
        return this.giaBan - this.giaMua;
    }
    
    
    static String getId(int n){
        String s = String.valueOf(n);
        while(s.length() < 3) s = '0' + s;
        return "MH" + s;
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.getLoiNhuan() < o.getLoiNhuan()) return 1;
        if(this.getLoiNhuan() > o.getLoiNhuan()) return -1;
        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + tenMH + " " + dv + " " + giaMua + " " + giaBan + " " + getLoiNhuan();
    }
    
    
}

public class J05081_DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MatHang> a = new ArrayList<>();
        while(t-- >0){
            sc.nextLine();
            String ten = sc.nextLine(), dv = sc.nextLine();
            int giaMua = sc.nextInt(), giaBan = sc.nextInt();
            a.add(new MatHang(ten,dv,giaMua,giaBan));
        }
        Collections.sort(a);
        for(MatHang i : a){
            System.out.println(i);
        }
    }
}
