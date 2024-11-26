
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class PY03004_ThongKeTuKhacNhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String text = "";
        while(t-- >0){
            text += sc.nextLine();
        }
        
        // Gọi hàm thống kê từ
        Map<String, Integer> wordCount = countWords(text);

        // Sắp xếp và in kết quả
        List<Map.Entry<String, Integer>> sortedWords = sortByFrequency(wordCount);

        // In kết quả
        for (Map.Entry<String, Integer> entry : sortedWords) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Hàm đếm số lần xuất hiện của các từ
    public static Map<String, Integer> countWords(String text) {
        // Chuyển văn bản về chữ thường và bỏ dấu câu
        text = text.toLowerCase();
        text = text.replaceAll("[,.;!?()\\-:/]", " ");  // Thay thế dấu câu bằng khoảng trắng

        // Tách từ
        String[] words = text.split("\\s+");

        // Tạo Map để lưu số lần xuất hiện của mỗi từ
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) continue;  // Bỏ qua từ rỗng
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }

    // Hàm sắp xếp các từ theo số lần xuất hiện giảm dần
    public static List<Map.Entry<String, Integer>> sortByFrequency(Map<String, Integer> wordCount) {
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());
        
        // Sắp xếp danh sách theo giá trị (số lần xuất hiện)
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        return sortedList;
    }
}
