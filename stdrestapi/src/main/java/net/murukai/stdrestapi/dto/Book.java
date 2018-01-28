package net.murukai.stdrestapi.dto;

import java.io.Serializable;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String isbn;
	private String name;
	private String description;
	private String author;
	private String publisher;
	private String year;
	private Date dateBorrowed;
	private Date dateReturned;
	private String borrowedDate;
	private String returnedDate;
	private int numberOfBooks;
	private boolean active;
	

	private long bookCategoryId;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public long getBookCategoryId() {
		return bookCategoryId;
	}
	public void setBookCategoryId(long bookCategoryId) {
		this.bookCategoryId = bookCategoryId;
	}
	public Date getDateBorrowed() {
		this.borrowedDate = dateBorrowed.toString();
		return dateBorrowed;
	}
	public void setDateBorrowed(Date dateBorrowed) {
		this.dateBorrowed = dateBorrowed;
	}
	public Date getDateReturned() {
		this.returnedDate = dateReturned.toString();
		return dateReturned;
	}
	public void setDateReturned(Date dateReturned) {
		this.dateReturned = dateReturned;
	}
	public String getBorrowedDate() {
		return borrowedDate;
	}
	public void setBorrowedDate(String borrowedDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		java.util.Date date;
		try {
			date = sdf.parse(borrowedDate);
			System.out.println(date);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			this.dateBorrowed = sqlDate;
			System.out.println(sqlDate);
			System.out.println(dateBorrowed);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.borrowedDate = borrowedDate;
	}
	public String getReturnedDate() {
		return returnedDate;
	}
	public void setReturnedDate(String returnedDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		java.util.Date date;
		try {
			date = sdf.parse(returnedDate);
			System.out.println(date);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			this.dateReturned = sqlDate;
			System.out.println(sqlDate);
			System.out.println(dateReturned);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.returnedDate = returnedDate;
	}
	
}
