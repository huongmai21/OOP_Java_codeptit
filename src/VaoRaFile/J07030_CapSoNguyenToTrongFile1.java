package VaoRaFile;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;


public class J07030_CapSoNguyenToTrongFile1 {
    static boolean prime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;++i){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f1 = new FileInputStream("DATA1.in");
        FileInputStream f2 = new FileInputStream("DATA2.in");
        ObjectInputStream o1 = new ObjectInputStream(f1);
        ObjectInputStream o2 = new ObjectInputStream(f2);
        ArrayList<Integer> a = (ArrayList<Integer>)o1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>)o2.readObject();
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : a){
            if(prime(i) && i<500000){
                int j = 1000000-i;
                if(prime(j)){
                    int k = b.indexOf(j);
                    if(k != -1) map.put(i, j);
                }
            }
        }
        for(Integer i : map.keySet()){
            System.out.println(i+" "+map.get(i));
        }
        o1.close();
        o2.close();
    }
}
