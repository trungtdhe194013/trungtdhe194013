// Main - Khởi chạy ứng dụng
package main;
import model.BookModel;
import view.BookView;
import controller.BookController;

public class Main {
    public static void main(String[] args) {
        // Tạo các đối tượng Model, View và Controller
        BookModel model = new BookModel();
        BookView view = new BookView();
        BookController controller = new BookController(model, view);

        // Thêm sách và hiển thị danh sách sách
        controller.addNewBook();
        controller.displayBooks();
    }
}
