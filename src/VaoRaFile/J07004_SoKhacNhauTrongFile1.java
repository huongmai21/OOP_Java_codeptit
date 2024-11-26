package VaoRaFile;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] cnt = new int[1000];
        while(sc.hasNext()){
            int a = Integer.parseInt(sc.next());
            cnt[a] ++;
        }
        for(int i = 0 ;i<1000;++i){
            if(cnt[i] != 0){
                System.out.println(i+" "+cnt[i]);
            }
        }
    }
}
