package top.yigumoyan.service.Impl;

import top.yigumoyan.mapper.BooksMapper;
import top.yigumoyan.pojo.Books;
import top.yigumoyan.service.BooksService;

import java.util.List;

public class BooksServiceImpl implements BooksService {

    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public int insertBook(Books books) {
        return booksMapper.insertBook(books);
    }

    @Override
    public int deleteBook(int id) {
        return booksMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    @Override
    public Books selectBook(int id) {
        return booksMapper.selectBook(id);
    }

    @Override
    public List<Books> selectAllBooks() {
        return booksMapper.selectAllBooks();
    }
}
