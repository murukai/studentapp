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

@Entity
public class Account implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="account_name")
	private String accountName;
	@Column(name = "account_number")
	private long accountNumber;
	private double balance;
	private String updateLast;
	private Date lastUpdated;
	private boolean active;
	
	private long studentId;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getLastUpdated() {
		this.updateLast = lastUpdated.toString();
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getUpdateLast() {
		return updateLast;
	}
	public void setUpdateLast(String updateLast) {
		SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		java.util.Date date;
		try {
			date = sdf.parse(updateLast);
			lastUpdated = new Date(date.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.updateLast = updateLast;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}
