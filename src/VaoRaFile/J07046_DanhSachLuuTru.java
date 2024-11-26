package VaoRaFile;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Collections;


class Khach implements Comparable<Khach>{
    private String ma, ten, phong;
    private String in, out;
    private long lt;
    
    public static int sma = 1;
    
    public Khach(Scanner sc) {
        this.ma = "KH" + String.format("%02d", sma++);
        sc.nextLine();
        this.ten = sc.nextLine();
        //sc.nextLine();
        this.phong = sc.next();
        this.in = sc.next();
        this.out = sc.next();
        this.lt = getLT(in, out);
    }

    static long getLT(String in, String out){
        try {
            DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            Date din = date.parse(in);
            Date dout = date.parse(out);
            return (dout.getTime() - din.getTime())/(24*60*60*1000);
        } catch (ParseException e) {
            Logger.getLogger(Khach.class.getName()).log(Level.SEVERE,null,e);
        }
        return 0;
    }
    
    
    @Override
    public int compareTo(Khach o) {
        if(this.lt < o.lt) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + phong + " " + String.valueOf(lt) ;
    }
    
    
}




public class J07046_DanhSachLuuTru {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = sc.nextInt();
        ArrayList<Khach> ds = new ArrayList<>();
        while(t-- > 0){
            ds.add(new Khach(sc));
        }
        Collections.sort(ds);
        for(Khach x : ds){
            System.out.println(x);
        }
           
    }
}
