package top.yigumoyan.mapper;

import org.springframework.stereotype.Component;
import top.yigumoyan.pojo.Books;

import java.util.List;

public interface BooksMapper {
    int insertBook(Books books);
    int deleteBook(int id);
    int updateBook(Books books);
    Books selectBook(int id);
    List<Books> selectAllBooks();
}
