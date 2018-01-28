package net.murukai.stdrestapi.dto;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;


@Entity
public class Student extends User {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column( name = "enrollment_date")
	private Date enrollmentDate;
	@Transient
	private String dateEnrolled;
	@Column( name = "registration_number" )
	private String registrationNumber;
	
	private long studentFormId;
	
	private long guardianId;
	
	public long getStudentFormId() {
		return studentFormId;
	}
	public void setStudentFormId(long studentFormId) {
		this.studentFormId = studentFormId;
	}
	public long getGuardianId() {
		return guardianId;
	}
	public void setGuardianId(long guardianId) {
		this.guardianId = guardianId;
	}
	public Student(){
		setActive(true);
		java.util.Date date = new java.util.Date();
		this.enrollmentDate = new Date(date.getTime());
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public Date getEnrollmentDate() {
		this.dateEnrolled = enrollmentDate.toString();
		return enrollmentDate;
	}
	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	public String getDateEnrolled() {
		return dateEnrolled;
	}
	public void setDateEnrolled(String dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}
}
