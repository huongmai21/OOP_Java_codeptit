/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
/*
Input

Dòng đầu ghi số nguyên dương N (không quá 5000) là số lượng giá trị thời gian cần sắp xếp.

Mỗi giá trị thời gian biểu diễn trên một dòng bằng ba số nguyên dương, lần lượt là số giờ, số phút, số giây. Trong đó số giờ đảm bảo nhỏ hơn 100, số phút và số giây đảm bảo đúng quy tắc (tức là không quá 59).

Output

In ra danh sách đã sắp xếp theo thứ tự tăng dần.

Ví dụ

Input

3

11 20 20

14 20 14

11 15 12

Output

11 15 12

11 20 20

14 20 14
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time> {

    private int h, m, s;

    public Time() {

    }

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    @Override
    public String toString() {
        return h + " " + m + " " + s;
    }

    @Override
    public int compareTo(Time o) {
        int s1 = h * 3600 + m * 60 + s;
        int s2 = o.getH() * 3600 + o.getM() * 60 + o.getS();
        return s1 - s2;
    }
}

public class J05033_SapXepThoiGian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            Time time = new Time(h, m, s);
            list.add(time);
        }
        Collections.sort(list);
        for (Time i : list) {
            System.out.println(i);
        }
    }
}
