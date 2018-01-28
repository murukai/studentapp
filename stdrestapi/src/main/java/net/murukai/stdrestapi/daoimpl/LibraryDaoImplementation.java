package net.murukai.stdrestapi.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.murukai.stdrestapi.dao.LibraryDao;
import net.murukai.stdrestapi.dto.Book;
import net.murukai.stdrestapi.dto.BookCategory;

@Repository("libraryDao")
@Transactional
public class LibraryDaoImplementation implements LibraryDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Book> list() {
		String sql = "FROM Book";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> listActive() {
		String sql = "FROM Book WHERE active = : active";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("active", true)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> listByCategory(long categoryId) {
		String sql = "FROM Book WHERE active =:active AND bookCategoryId = : categoryId";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("active", true)
				.setParameter("categoryId", categoryId)
				.getResultList();
	}

	@Override
	public boolean addBook(Book book) {
		try{
			sessionFactory.getCurrentSession().persist(book);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean updateBook(Book book) {
		try{
			sessionFactory.getCurrentSession().update(book);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean deleteBook(Book book) {
		book.setActive(false);
		try{
			sessionFactory.getCurrentSession().update(book);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public Book get(String isbn) {
		String sql = "FROM Book WHERE active =:active AND isbn = : isbn";
		return (Book)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("active", true)
				.setParameter("isbn", isbn)
				.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BookCategory> listAllCategories() {
		String sql = "FROM Category";
		return sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.getResultList();
	}

	@Override
	public boolean addCategory(BookCategory category) {
		try{
			sessionFactory.getCurrentSession().persist(category);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean updateCategory(BookCategory category) {
		try{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean deleteCategory(BookCategory category) {
		try{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public BookCategory getCategory(long id) {
		String sql = "FROM Category WHERE id =:id";
		return (BookCategory)sessionFactory
				.getCurrentSession()
				.createQuery(sql)
				.setParameter("id", id)
				.getSingleResult();
	}

}
