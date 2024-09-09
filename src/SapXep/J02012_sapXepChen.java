
package SapXep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02012_sapXepChen {
         public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; ++i)
        {
            a.add(sc.nextInt());
            Collections.sort(a);
            System.out.print("Buoc " + i + ": ");
            for (int j : a)
                System.out.print(j + " ");
            System.out.println();
        }
    }

}

/*
- Nhập số bằng dấu cách (ví dụ: 1 2 3 4):
Khi bạn nhập nhiều số trên một dòng và tách chúng bằng dấu cách, sc.nextInt() sẽ đọc từng số một từ dòng đó.
Sau khi bạn nhấn enter, toàn bộ chuỗi số được nhập và chương trình bắt đầu xử lý từng số một, do đó tất cả các lần in chỉ xảy ra sau khi bạn nhấn enter và toàn bộ dãy số đã được xử lý.

-Nhập số bằng dấu enter (nhập từng số rồi nhấn enter):
Khi bạn nhập từng số một và nhấn enter, sc.nextInt() sẽ ngay lập tức đọc số đó và tiếp tục thực hiện các lệnh trong vòng lặp, bao gồm cả việc in ra kết quả.
Do đó, sau mỗi lần nhập và nhấn enter, kết quả ngay lập tức được in ra, cho thấy mảng đã được sắp xếp đến thời điểm hiện tại.
*/