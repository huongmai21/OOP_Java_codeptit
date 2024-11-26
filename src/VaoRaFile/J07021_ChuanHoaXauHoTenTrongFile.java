package VaoRaFile;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.StringBuilder;


public class J07021_ChuanHoaXauHoTenTrongFile {
    static String chuanhoa(String s){
        StringBuilder sb = new StringBuilder("");
        String[] a = s.trim().split("\\s+");
        for(String x : a){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int i=1;i<x.length();++i){
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        s = sb.toString();
        return s;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            String s = sc.nextLine();
            if(s.endsWith("END")) return;
            System.out.println(chuanhoa(s));
        }
    }
 
}
