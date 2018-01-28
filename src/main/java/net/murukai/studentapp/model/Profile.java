package net.murukai.studentapp.model;

import java.io.Serializable;
import java.util.List;

import net.murukai.stdrestapi.dto.Qualification;
import net.murukai.stdrestapi.dto.StudentForm;
import net.murukai.stdrestapi.dto.Subject;

public class Profile implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Qualification qualification;
	private StudentForm studentForm;
	private String name;
	private List<Subject> subjects;
	public Qualification getQualification() {
		return qualification;
	}
	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}
	public StudentForm getStudentForm() {
		return studentForm;
	}
	public void setStudentForm(StudentForm studentForm) {
		this.studentForm = studentForm;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

}
