package net.murukai.stdrestapi.dto;

import java.io.Serializable;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Transcript implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long studentId;
	@OneToMany
	private List<Mark> marks;
	
	private boolean active;
	
	@Column(name="last_updated")
	private Date lastUpdated;
	
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public List<Mark> getMarks() {
		return marks;
	}
	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}
	@Transient
	private String lastUpdate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public List<Mark> getMark() {
		return marks;
	}
	public void setMark(List<Mark> marks) {
		this.marks = marks;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY");
		java.util.Date date;
		try {
			date = sdf.parse(lastUpdate);
			lastUpdated = new Date(date.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.lastUpdate = lastUpdate;
	}
}
