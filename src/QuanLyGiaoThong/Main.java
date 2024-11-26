
package QuanLyGiaoThong;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        while(true){
            System.out.println("-----MENU-----");
            System.out.println("1.Nhap Oto");
            System.out.println("2.Nhap Xe may");
            System.out.println("3.Viet ra danh sach");
            
            System.out.println("4.Xoá");
            System.out.println("5.Tim kiem theo mau");
            System.out.println("6. Tim theo hang");
            
            System.out.println("7.Tim theo pt dat do");
            System.out.println("8.Tim theo nam");
            
            System.out.println("9.sua");
            
            System.out.println("10.Sap xep theo ma");
            System.out.println("11.Sap xep theo nam giam dan");
            System.out.println("12.Sap xep theo gia tang dan");
            System.out.println("13.Sap xep oto theo socho va mau");
            System.out.println("14.Tim theo ma");
            
            System.out.println("0.Thoat");
            System.out.println("-------------");
            System.out.println("Ban con (0->10):");
            int chon;
            Scanner in = new Scanner(System.in);
            chon = Integer.parseInt(in.nextLine());
            switch(chon){
                case 0: 
                    System.out.println("BYE!");
                    System.exit(0);
                case 1: 
                    Oto o = new Oto();
                    
                        
            }
            
            
            
            
        }
    }
}
