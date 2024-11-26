
package OOP_Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LoaiPhong implements Comparable<LoaiPhong>{
    private String type, name;
    private int DonGiaNgay;
    private double PhiDV;

    public LoaiPhong(String type, String name, int DonGiaNgay, double PhiDV) {
        this.type = type;
        this.name = name;
        this.DonGiaNgay = DonGiaNgay;
        this.PhiDV = PhiDV;
    }

    public LoaiPhong(String dl) {
        String[] d = dl.split("\\s+");
        this.type = d[0];
        this.name = d[1];
        this.DonGiaNgay = Integer.parseInt(d[2]);
        this.PhiDV = Double.parseDouble(d[3]);
    }
    
    

    @Override
    public int compareTo(LoaiPhong o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return type + " " + name + " " + DonGiaNgay + " " + PhiDV ;
    }
    
    
}

public class J07045_LoaiPhong {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
