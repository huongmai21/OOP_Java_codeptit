package VaoRaFile;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class J07001_DocFileVanBan {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }catch(FileNotFoundException ex){
            
        }
    }
}
