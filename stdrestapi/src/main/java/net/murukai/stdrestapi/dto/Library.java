package net.murukai.stdrestapi.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Library implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany
	private List<Book> books;
	
	private long librarianId;
	private int totalBooks;
	private int totalCategories;
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public long getLibrarianId() {
		return librarianId;
	}
	public void setLibrarianId(long librarianId) {
		this.librarianId = librarianId;
	}
	public int getTotalBooks() {
		return totalBooks;
	}
	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}
	public int getTotalCategories() {
		return totalCategories;
	}
	public void setTotalCategories(int totalCategories) {
		this.totalCategories = totalCategories;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
