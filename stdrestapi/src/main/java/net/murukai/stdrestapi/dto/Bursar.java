package net.murukai.stdrestapi.dto;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import net.murukai.stdrestapi.dto.User;

public class Bursar extends User{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date dateEnrolled;
	private String enrolledDate;
	private String maritalStatus;
	private String email;
	private String ecNumber;
	
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
