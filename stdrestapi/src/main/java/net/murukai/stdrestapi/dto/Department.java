package net.murukai.stdrestapi.dto;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;
	private String code;
	@Column( name = "number_of_teacher")
	private int numberOfTeacher;
	
	public Department(){
		this.code = "STD" + UUID.randomUUID().toString().substring(26).toUpperCase();
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getNumberOfTeacher() {
		return numberOfTeacher;
	}
	public void setNumberOfTeacher(int numberOfTeacher) {
		this.numberOfTeacher = numberOfTeacher;
	}
}
