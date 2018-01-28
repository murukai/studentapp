package net.murukai.stdrestapi.dao;

import java.util.List;

import net.murukai.stdrestapi.dto.Book;
import net.murukai.stdrestapi.dto.BookCategory;


public interface LibraryDao {
	List<Book> list();
	List<Book> listActive();
	List<Book> listByCategory(long categoryId);
	Book get(String isbn);
	boolean addBook(Book book);
	boolean updateBook(Book book);
	boolean deleteBook(Book book);
	
	List<BookCategory> listAllCategories();
	BookCategory getCategory(long id);
	boolean addCategory(BookCategory category);
	boolean updateCategory(BookCategory category);
	boolean deleteCategory(BookCategory category);
	
}
