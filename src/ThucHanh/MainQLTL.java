
package ThucHanh;

import java.util.List;
import java.util.Scanner;


public class MainQLTL {
    public static void main(String[] args) {
        QLTaiLieu q = new QLTaiLieu();
        Scanner in = new Scanner(System.in);
        
        
        //nhap
//        q.nhapSach(in);
//        q.nhapTapChi(in);
        q.out();
        //tim tren con
//        List<Sach> a=q.timTheoTenSach("cong nghe");
//        System.out.println("--------------------------");
//        for(Sach i:a){
//            System.out.println(i);
//        }
//xoa 1
//       q.xoaTheoMa("NNN8");
//        q.xoaTheoMa("s001");
//        q.out();
        //xoa nhieu - xoa theo ten
//        q.xoaTheoTen("lan lan");
//        q.xoaTheoTen("Tran dinh que");
//        q.out();
//          q.suaTaiLieu("bbbbbb", in);
//          q.suaTaiLieu("S001", in);
//          q.out();
            //sap xep theo so ban
            //q.sapxepTheoSoBanPH();
            //sap xep theo nha xb
//            q.sapxepTheoNXB();
//            q.out();
            //sap xep theo ten TG
            q.sapxepSachTheoTenTG();
            q.out();

    }
}
