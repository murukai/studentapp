package net.murukai.stdrestapi.dto;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Librarian extends User{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="date_enrolled")
	private Date dateEnrolled;
	@Transient
	private String enrolledDate;
	@Column(name="marital_status")
	private String maritalStatus;
	private String email;
	@Column(name="ec_number")
	private String ecNumber;
	
	public Librarian(){
		setCode("LBR" + UUID.randomUUID().toString().substring(28).toUpperCase());
		setActive(true);
	}
	public Date getDateEnrolled() {
		this.enrolledDate = dateEnrolled.toString();
		return dateEnrolled;
	}
	public void setDateEnrolled(Date dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}
	public String getEnrolledDate() {
		return enrolledDate;
	}
	public void setEnrolledDate(String enrolledDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		java.util.Date date;
		try {
			date = sdf.parse(enrolledDate);
			System.out.println(date);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			this.dateEnrolled = sqlDate;
			System.out.println(sqlDate);
			System.out.println(dateEnrolled);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.enrolledDate = enrolledDate;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEcNumber() {
		return ecNumber;
	}
	public void setEcNumber(String ecNumber) {
		this.ecNumber = ecNumber;
	}
}
