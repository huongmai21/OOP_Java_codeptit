
package OOP_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    private int gio, phut, giay;

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    @Override
    public int compareTo(Time o) {
        if(this.gio > o.gio) return 1;
        if(this.gio < o.gio) return -1;
        if(this.phut > o.phut) return 1;
        if(this.phut < o.phut) return -1;
        if(this.giay > o.giay) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay ;
    }
    
    
    
}

public class J05033_SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> a = new ArrayList<>();
        while(n-- > 0){
            int h = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt();
            a.add(new Time(h,m,s));
        }
        Collections.sort(a);
        for(Time i : a){
            System.out.println(i);
        }
    }
}
