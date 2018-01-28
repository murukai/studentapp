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
public class Teacher extends User {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ecnumber;
	private String email;
	@Column( name = "enrollment_date" )
	private Date enrollmentDate;
	@Transient
	private String dateEnrolled;
	@Column( name = "marital_status" )
	private String maritalStatus;

	private long departmentId;
	
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public Teacher(){
		setActive(true);
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getEcnumber() {
		return ecnumber;
	}
	public void setEcnumber(String ecnumber) {
		this.ecnumber = ecnumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getEnrollmentDate() {
		
		return enrollmentDate;
	}
	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	public String getDateEnrolled() {
		this.dateEnrolled = enrollmentDate.toString();
		return dateEnrolled;
	}
	public void setDateEnrolled(String dateEnrolled) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		java.util.Date date;
		try {
			date = sdf.parse(dateEnrolled);
			System.out.println(date);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			this.enrollmentDate = sqlDate;
			System.out.println(sqlDate);
			System.out.println(enrollmentDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.dateEnrolled = dateEnrolled;
	}
}
