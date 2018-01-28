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
public class Mark implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private double value;
	private Date dateRecorded;
	private String recordedDate;
	private String description;
	
	private long studentId;

	private long subjectId;
	
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
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public Date getDateRecorded() {
		this.recordedDate = dateRecorded.toString();
		return dateRecorded;
	}
	public void setDateRecorded(Date dateRecorded) {
		this.dateRecorded = dateRecorded;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public String getRecordedDate() {
		return recordedDate;
	}
	public void setRecordedDate(String recordedDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		java.util.Date date;
		try {
			date = sdf.parse(recordedDate);
			System.out.println(date);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			this.dateRecorded = sqlDate;
			System.out.println(sqlDate);
			System.out.println(dateRecorded);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
