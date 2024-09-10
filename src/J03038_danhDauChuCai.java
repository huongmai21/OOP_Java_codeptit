
import java.util.Scanner;
import java.util.HashSet;

public class J03038_danhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();++i){
            hs.add(s.charAt(i));
        }
        System.out.println(hs.size());
    }
}
