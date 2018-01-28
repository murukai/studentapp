package net.murukai.stdrestapi.dto;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Guardian extends User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	@Column( name = "marital_status")
	private String maritalStatus;
	private boolean employed;
	
	private long studentFormId;
	
	public Guardian(){
		setActive(true);
	}

	public long getStudentFormId() {
		return studentFormId;
	}
	public void setStudentFormId(long studentFormId) {
		this.studentFormId = studentFormId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public boolean isEmployed() {
		return employed;
	}
	public void setEmployed(boolean employed) {
		this.employed = employed;
	}
	
}
