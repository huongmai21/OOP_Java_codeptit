package VaoRaFile;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;



class MatHang implements Comparable<MatHang>{
    private String ma, ten, nhom;
    private float giamua, giaban;
    private float ln;
    public static int sma = 1;

    public MatHang(Scanner sc) {
        sc.nextLine();
        this.ma = "MH" + String.format("%02d", sma++);
        this.ten = sc.nextLine();
        this.nhom = sc.nextLine();
        this.giamua = sc.nextFloat();
        this.giaban = sc.nextFloat();
        this.ln = this.giaban - this.giamua;
    }
    
    
    @Override
    public int compareTo(MatHang o) {
        if(this.ln < o.ln) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + nhom + " " + String.format("%.2f", ln);
    }
    
    
}
public class J07050_SapXepMatHang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = sc.nextInt();
        ArrayList<MatHang> ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new MatHang(sc));
        }
        Collections.sort(ds);
        for(MatHang x : ds){
            System.out.println(x);
        }
    }
}
