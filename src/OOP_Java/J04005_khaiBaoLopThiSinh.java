
package OOP_Java;

import java.util.Scanner;

class ThiSinh{
    private String name, dob;
    private double d1, d2, d3, tong;

    public ThiSinh(String name, String dob, double d1, double d2, double d3) {
        this.name = name;
        this.dob = dob;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong = d1+d2+d3; 
    }

    public String getDob() {
        return dob;
    }
    
    
    public void chD(){
        StringBuilder sb = new StringBuilder(this.dob);
        if(sb.charAt(1) == '/') 
            sb.insert(0, '0');
        if(sb.charAt(4) == '/')
            sb.insert(3, '0');
        this.dob = sb.toString();
    }

    @Override
    public String toString() {
        return name + " " + dob + " " + String.format("%.1f", tong) ;
    }
    
    
}

public class J04005_khaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh s = new ThiSinh(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        s.chD();
        System.out.println(s);
    }
}
