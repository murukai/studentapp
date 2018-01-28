package net.murukai.stdrestapi.dto;

import java.io.Serializable;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class Assignment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private String question;
	@Column(name="due_date")
	private Date dueDate;
	@Transient
	private String dateDue;
	private Date posted;
	@Transient
	private String datePosted;
	private Subject subject;
	private int totalMarks;
	public Assignment(){
		java.util.Date date = new java.util.Date();
		this.posted = new Date(date.getTime());
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getDateDue() {
		return dateDue;
	}
	public void setDateDue(String dateDue) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		java.util.Date date;
		try {
			date = sdf.parse(dateDue);
			System.out.println(date);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			this.dueDate = sqlDate;
			System.out.println(sqlDate);
			System.out.println(dueDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.dateDue = dateDue;
	}
	public Date getPosted() {
		return posted;
	}
	public void setPosted(Date posted) {
		this.posted = posted;
	}
	public String getDatePosted() {
		return datePosted;
	}
	public void setDatePosted(String datePosted) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		java.util.Date date;
		try {
			date = sdf.parse(datePosted);
			System.out.println(date);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			this.posted = sqlDate;
			System.out.println(sqlDate);
			System.out.println(posted);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.datePosted = datePosted;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
}
