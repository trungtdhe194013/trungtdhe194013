package view;
import java.util.List;
import java.util.Scanner;

public class BookView {

    // Phương thức hiển thị danh sách sách
    public void printBookDetails(List<String> books) {
        System.out.println("Danh sách sách trong thư viện:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }

    // Phương thức lấy đầu vào tên sách từ người dùng
    public String getBookInput() {
        Scanner scanner = new Scanner(System.in);  // Sử dụng Scanner thay thế
        System.out.print("Nhập tên sách: ");
        return scanner.nextLine();
    }
}
