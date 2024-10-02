
package ThucHanh;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

class MonHoc{
    private String code, sub;
    private int tc;

    public MonHoc(String code, String sub, int tc) {
        this.code = code;
        this.sub = sub;
        this.tc = tc;
    }


    public String getSub() {
        return sub;
    }

    @Override
    public String toString() {
        return code + " " + sub + " " + tc  ;
    }
    
    public void input(Scanner sc){
        code = sc.nextLine();
        sub = sc.nextLine();
        tc = sc.nextInt();
        sc.nextLine();
    }
}

public class DanhSachMonHoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> mh = new ArrayList<>();
        
        for(int i=0;i<n;++i){
            String code = sc.nextLine();
            String sub = sc.nextLine();
            int tc = sc.nextInt();
            sc.nextLine();
            mh.add(new MonHoc(code, sub,tc));
        }
        
        Collections.sort(mh,Comparator.comparing(MonHoc::getSub));
        
        for(MonHoc x : mh){
            System.out.println(x);
        }
    }
}
