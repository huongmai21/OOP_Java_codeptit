package VaoRaFile;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;


public class J07032_SoThuanNghichTrongFile {
    static boolean tn(int n){
        String s = String.valueOf(n);
        if(s.length()%2 == 0 || s.length()==1) return false;
        for(int i=0;i<=s.length()/2;++i){
            if(s.charAt(i) != s.charAt(s.length()-i-1) || s.charAt(i)%2 == 0)
                return false;
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
        
        for(int i : b){
            if(map.containsKey(i)) map.put(i, map.get(i)+1);
            else if(tn(i) && a.indexOf(i) != -1) map.put(i, 1);
        }
        for(int i : a){
            if(map.containsKey(i)) map.put(i, map.get(i)+1);
        }
        int dem=0;
        for(Integer i : map.keySet()){
            dem++;
            System.out.println(i+" "+map.get(i));
            if(dem ==10) break;
        }
        o1.close();
        o2.close();
    }
}
