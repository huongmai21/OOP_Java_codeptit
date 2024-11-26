package VaoRaFile;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;



class DN implements Comparable<DN>{
    private String ma, ten;
    private int soSV;

    public DN(Scanner sc) {
        this.ma = sc.next();
        sc.nextLine();
        this.ten = sc.nextLine();
        this.soSV = sc.nextInt();
    }

    
    @Override
    public int compareTo(DN o) {
        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.valueOf(soSV);
    }
    
    
}

public class J07037_DanhSachDoanhNghiep {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DN.in"));
        int t = sc.nextInt();
        ArrayList<DN> ds = new ArrayList<>();
        while(t-- >0){
            ds.add(new DN(sc));
        }
        Collections.sort(ds);
        for(DN x : ds){
            System.out.println(x);
        }
    }
}
