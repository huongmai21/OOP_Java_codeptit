package VaoRaFile;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class J07040_LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("NHIPHAN.in");
        ObjectInputStream ois = new ObjectInputStream(f);
        ArrayList<String> a = (ArrayList<String>)ois.readObject();
        
        HashSet<String> set = new HashSet<>();
        for(String s: a){
            String[] arr = s.split("\\s+");
            for(String i : arr){
                set.add(i.toLowerCase());
            }
        }
        
        Scanner sc = new Scanner(new File("VANBAN.in"));
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if(set.contains(s) && !set2.contains(s)){
                set2.add(s);
                System.out.println(s);
            }
        }
    }
}
