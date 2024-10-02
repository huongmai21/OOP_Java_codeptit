
package ThucHanh;

import java.util.Scanner;

public class XuLyXau {
    public static boolean isCodeValid(String code) {
        return code.matches("^[Bb]\\d{2}(dc|DC|cn|CN|at|AT)\\d{3}$");
    }

    public static boolean isBillCode(String code) {
        return code.matches("^[NnXx]\\d{2}(ptit|PTIT)\\d{2,4}$");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 2;
        String Code = sc.nextLine();
        String Bill = sc.nextLine();
        System.out.println(isCodeValid(Code));
        System.out.println(isBillCode(Bill));
    }
}
