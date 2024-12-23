package model;
import java.util.ArrayList;
import java.util.List;

// Model - Quản lý dữ liệu sách
public class BookModel {
    private List<String> books;

    public BookModel() {
        this.books = new ArrayList<>();
    }

    // Phương thức thêm sách mới
    public void addBook(String book) {
        books.add(book);
    }

    // Phương thức lấy danh sách sách
    public List<String> getBooks() {
        return books;
    }
}
