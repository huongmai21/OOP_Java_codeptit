package VaoRaFile;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class J07002_TinhTong {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            long sum = 0;
            while(sc.hasNext()){
                String s = sc.next();
                try{
                    sum += Integer.parseInt(s);
                }catch(Exception e){
                    
                }   
            }
            System.out.println(sum);
        }catch(FileNotFoundException ex){
            Logger.getLogger(J07002_TinhTong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
