package VaoRaFile;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;


public class J07007_LietKeTuKhacNhau {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> set = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next().trim();
            set.add(s.toLowerCase());
        }
        for(String x : set){
            System.out.println(x);
        }
    }
}
