package net.murukai.studentapp.model;

import java.io.Serializable;

import net.murukai.stdrestapi.dto.Address;
import net.murukai.stdrestapi.dto.Guardian;
import net.murukai.stdrestapi.dto.Qualification;
import net.murukai.stdrestapi.dto.Student;
import net.murukai.stdrestapi.dto.Teacher;
import net.murukai.stdrestapi.dto.User;

public class RegisterModel implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private User user;
	private Student student;
	private Guardian guardian;
	private Teacher teacher;
	private Address billing;
	private Qualification qualification;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Guardian getGuardian() {
		return guardian;
	}
	public void setGuardian(Guardian guardian) {
		this.guardian = guardian;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Address getBilling() {
		return billing;
	}
	public void setBilling(Address billing) {
		this.billing = billing;
	}
	public Qualification getQualification() {
		return qualification;
	}
	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}
}
