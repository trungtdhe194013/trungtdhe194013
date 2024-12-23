package controller;
import model.BookModel;
import view.BookView;
import java.util.List; // Đảm bảo import List

// Controller - Điều khiển luồng dữ liệu giữa Model và View
public class BookController {
    public BookModel model;
    private BookView view;

    public BookController(BookModel model, BookView view) {
        this.model = model;
        this.view = view;
    }

    // Phương thức thêm sách mới
    public void addNewBook() {
        String newBook = view.getBookInput();
        model.addBook(newBook);
    }

    // Phương thức hiển thị danh sách sách
    public void displayBooks() {
        List<String> books = model.getBooks();
        view.printBookDetails(books);
    }
}
