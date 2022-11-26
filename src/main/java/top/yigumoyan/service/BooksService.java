package top.yigumoyan.service;

import top.yigumoyan.pojo.Books;

import java.util.List;

public interface BooksService {
    int insertBook(Books books);
    int deleteBook(int id);
    int updateBook(Books books);
    Books selectBook(int id);
    List<Books> selectAllBooks();
}
