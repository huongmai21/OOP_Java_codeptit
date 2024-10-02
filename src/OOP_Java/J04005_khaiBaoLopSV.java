
package OOP_Java;

import java.util.Scanner;

class SinhVien{
    private String code, name, lop, dob;
    private Float gpa;

    public SinhVien() {
    }

    public void nhap(Scanner sc){
        this.code = "B20DCCN001";
        this.name = sc.nextLine();
        this.lop = sc.nextLine();
        this.dob = sc.nextLine();
        this.chD();
        this.gpa = sc.nextFloat();
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
        return code + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
    
    
}

public class J04005_khaiBaoLopSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien s = new SinhVien();
        s.nhap(sc);
        System.out.println(s);
    }
}
