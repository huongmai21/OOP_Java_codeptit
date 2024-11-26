package VaoRaFile;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;


public class J07031_CapSoNguyenToTrongFile2 {
    static int N = 1000000;
    static boolean ngto[] = new boolean[N+1];
    static void sang(){
        for(int i = 2;i<=N;i++){
            ngto[i] = true;
        }
        for(int i = 2;i<=N;++i){
            if(ngto[i] ==true){
                for(int j = 2*i;j<=N;j+=i)
                    ngto [j] = false;
            }
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f1 = new FileInputStream("DATA1.in");
        FileInputStream f2 = new FileInputStream("DATA2.in");
        ObjectInputStream o1 = new ObjectInputStream(f1);
        ObjectInputStream o2 = new ObjectInputStream(f2);
        ArrayList<Integer> a = (ArrayList<Integer>)o1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>)o2.readObject();
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        sang();
        for(int i : a){
            if(ngto[i] && i<500000 && b.indexOf(i) == -1){
                int j = 1000000-i;
                if(ngto[j] && a.indexOf(j) != -1 && b.indexOf(j) == -1){
                    map.put(i, j);
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
