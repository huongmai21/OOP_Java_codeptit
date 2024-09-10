
package ThucHanh;

import java.util.Scanner;


class Sinhvien {

    // Thuoc tinh
    private String code, name;
    private boolean sex;
    private double diem;

    // Nap chong | Methods
    public Sinhvien() { // Ham tao thuong trung voi ten lop

    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        code = sc.nextLine().toUpperCase();
        name = sc.nextLine();
        sex = sc.nextBoolean();
        diem = sc.nextDouble();
    }

    public void out() {
       // System.out.println(this.toString());
        System.out.print(code + " " + name + " ");
        if(sex == true){
            System.out.print("nam ");
        }
        else System.out.print("nu ");
        
        if(diem >= 5){
            System.out.println("dat");
        }
        else System.out.println("hoc lai");
    }
}

public class OOP_InThongTinSinhvien {
    public static void main(String[] args) {
        Sinhvien sv=new Sinhvien();
        //input
        sv.input();
        //output
        sv.out();
    }
}

