
package ThucHanh;

import java.util.Scanner;
import java.lang.StringBuilder;

class TienDien{
    private String hoten, loaiHo;
    private long csdau, cscuoi;

    public TienDien() {
    }
    
    public void input(Scanner in){
        this.hoten = in.nextLine();
        this.loaiHo = in.nextLine();
        this.csdau = in.nextLong();
        this.cscuoi = in.nextLong();
        
        
    }
    
    public String chuanHoa(String hoten){
        StringBuilder sb = new StringBuilder("");
        String[] arr = hoten.split("\\s+");
        for(String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int i = 1 ;i<x.length();++i){
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    
    public long getDinhMuc(){
        if(this.loaiHo.equals("A")){
            return 100;
        }
        else if(this.loaiHo.equals("B")){
            return 500;
        }
        else if(this.loaiHo.equals("C")){
            return 200;
        }
        return 0;
    }
    
    public long getTien(){
        long sd = this.cscuoi - this.csdau;
        if(sd < this.getDinhMuc()){
            return sd * 450;
        }
        else{
            return this.getDinhMuc() * 450 + (sd - this.getDinhMuc()) * 1000;
        }
    }
    
    public long getThue(){
        return (long) (this.getTien() * 0.05) ;
    }
    
    
    @Override
    public String toString() {
        long tong = this.getTien() + this.getThue();
        return chuanHoa(hoten) + " " + this.getTien() + " " + this.getThue() + " " + tong;
    }
    
    
}

public class TinhTienDien {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        TienDien td=new TienDien();
        td.input(in);
        System.out.println(td.toString());
    }
}
