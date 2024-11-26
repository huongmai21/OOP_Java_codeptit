package VaoRaFile;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Vector;


public class J07022_LoaiBoSoNguyen {
   
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Vector<String> set = new Vector<>();
        while(sc.hasNext()){
           String s = sc.next();
           try{
                Integer.parseInt(s);
            }catch(NumberFormatException e){
                set.add(s);
            }
        }
        Collections.sort(set);
        for(String x : set){
            System.out.print(x + " ");
        }
    }
}
