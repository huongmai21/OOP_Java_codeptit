package VaoRaFile;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Collections;

public class J07029_SoNguyenToLonNhatTrongFile implements Serializable{
    static boolean prime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);++i){
            if(n%i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(f);
        ArrayList<Integer> a = (ArrayList<Integer>)ois.readObject();
        TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int x : a){
            if(prime(x)){
                if(map.containsKey(x)) map.put(x, map.get(x)+1);
                else map.put(x, 1);
            }
        }
        int dem = 0;
        for(Integer i: map.keySet()){
            dem++;
            System.out.println(i+" "+map.get(i));
            if(dem == 10) break;
        }
        ois.close();
    }
}
