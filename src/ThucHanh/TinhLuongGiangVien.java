
package ThucHanh;

import java.util.Scanner;

class Giangvien{
    private String code,ten,hs;
    private int lcb;

    public Giangvien() {
    }

    public int getLcb() {
        return lcb;
    }

    public String getHs() {
        return hs;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setHs(String hs) {
        this.hs = hs;
    }

    public void setLcb(int lcb) {
        this.lcb = lcb;
    }

   

    public void input(){
        Scanner sc = new Scanner(System.in);
        this.code = sc.nextLine();
        this.ten = sc.nextLine();
        this.lcb = sc.nextInt();
        sc.nextLine();
        this.hs = sc.nextLine();
    }
   
    public long luong(String hs){
        if(hs.equals("A")){
            return 15 ;
        }
        else if(hs.equals("B")){
           return 12;
        }
        else if(hs.equals("C")){
            return 10;
        }
        return 0;
    }
    
    public void out(){
        
        System.out.println(code + " " + ten + " " + hs + " " + (lcb* luong(hs)*25000));
    }
    
}
public class TinhLuongGiangVien {
    public static void main(String[] args) {
        Giangvien gv=new Giangvien();
        //input
        gv.input();
        //output
        gv.out();
    }
}
