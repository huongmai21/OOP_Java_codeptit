package VaoRaFile;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeMap;


public class J07015_SoNguyenToTrongFileNhiPhan implements Serializable{
    static boolean prime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);++i){
            if(n%i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream sc = new FileInputStream("SONGUYEN.in");
        ObjectInputStream ois = new ObjectInputStream(sc);
        ArrayList<Integer> a = (ArrayList<Integer>)ois.readObject();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int x : a){
            if(prime(x)){
                if(map.containsKey(x)) map.put(x, map.get(x)+1);
                else map.put(x, 1);
            }
        }
        for(Integer i: map.keySet()){
            System.out.println(i+" "+map.get(i));
        }
    }
}
