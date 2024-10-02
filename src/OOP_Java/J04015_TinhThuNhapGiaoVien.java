
package OOP_Java;

import java.util.Scanner;

class GiaoVien{
    private String code, ten;
    private int lcb;

    public GiaoVien() {
    }

    public GiaoVien(String code, String ten, int lcb) {
        this.code = code;
        this.ten = ten;
        this.lcb = lcb;
    }

    public String getCode() {
        return code;
    }

    public String getTen() {
        return ten;
    }

    public int getLcb() {
        return lcb;
    }

    public int getHs() {
        return Integer.parseInt(code.substring(2));
    }
    
    public int phuCap(){
        String cv = code.substring(0, 2);
        if(cv.endsWith("HT"))
            return 2000;
        else if(cv.endsWith("HP"))
            return 900;
        else if(cv.endsWith("GV"))
            return 500;
        return 0;
    }
    
    @Override
    public String toString() {
        return code + " " + ten + " " + getHs() +  " " + phuCap() * 1000 + " " + (lcb * getHs() + phuCap()*1000) ;
    }
    
    
}

public class J04015_TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien gv = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextInt());
        System.out.println(gv);
    }
}
