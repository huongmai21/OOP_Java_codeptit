
package OOP_Java;

import java.util.Scanner;
import java.lang.StringBuilder;


class NhanVien{
    private String id, name, sex, dob, dc, tax, sign;

    public NhanVien(String name, String sex, String dob, String dc, String tax, String sign) {
        this.id = "00001";
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.dc = dc;
        this.tax = tax;
        this.sign = sign;
        
        StringBuilder sb = new StringBuilder(this.dob);
        if(sb.charAt(1) == '/') 
            sb.insert(0, '0');
        if(sb.charAt(4) == '/')
            sb.insert(3, '0');
        this.dob = sb.toString();
        
        StringBuilder sb2 = new StringBuilder(this.sign);
        if(sb2.charAt(1) == '/') 
            sb2.insert(0, '0');
        if(sb2.charAt(4) == '/')
            sb2.insert(3, '0');
        this.sign = sb2.toString();
    }
    
    public void ch1(){
        StringBuilder sb = new StringBuilder("");
        String[] arr = this.name.split("\\s+");
        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int i = 1; i<x.length();++i){
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() -1);
        this.name = sb.toString();
    }
    
//    public String ch2(String date){
//        StringBuilder sb = new StringBuilder(date);
//        if(sb.charAt(1) == '/') 
//            sb.insert(0, '0');
//        if(sb.charAt(4) == '/')
//            sb.insert(3, '0');
//        date = sb.toString();
//        return date;
//    }

    @Override
    public String toString() {
        return id + " " + name + " " + sex + " " + dob + " " + dc + " " + tax + " " + sign ;
    }

    
    public String getDob() {
        return dob;
    }

    public String getSign() {
        return sign;
    }
    
    
    
}   


public class J04007_KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        NhanVien s = new NhanVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        s.ch1();
        System.out.println(s);
    }
}
