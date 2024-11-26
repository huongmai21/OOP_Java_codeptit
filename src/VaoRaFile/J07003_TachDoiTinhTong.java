package VaoRaFile;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.math.BigInteger;

public class J07003_TachDoiTinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        if(s.length() == 1){
            System.out.println(s);
            return;
        }
        while(s.length() >1){
            BigInteger num1 = new BigInteger(s.substring(0, s.length()/2));
            BigInteger num2 = new BigInteger(s.substring(s.length()/2));
            s = num1.add(num2).toString();
            System.out.println(s);
        }
    }
}
