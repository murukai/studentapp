package net.murukai.studentapp.util;

import java.io.Serializable;

import net.murukai.stdrestapi.dto.Guardian;
import net.murukai.stdrestapi.dto.Student;
import net.murukai.stdrestapi.dto.Teacher;
import net.murukai.stdrestapi.dto.User;

public class UserUtil implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static Teacher convertTeacher(User user){
		Teacher teacher = new Teacher();
		teacher.setFirstname(user.getFirstname());
		teacher.setLastname(user.getLastname());
		teacher.setGender(user.getGender());
		teacher.setDateOfBirth(user.getDateOfBirth());
		teacher.setPassword(user.getPassword());
		teacher.setCode(user.getCode());
		teacher.setActive(true);
		teacher.setRole(user.getRole());
		teacher.setUsername(user.getUsername());
		return teacher;
	}
	
	public static Student convertStudent(User user){
		Student student = new Student();
		student.setFirstname(user.getFirstname());
		student.setLastname(user.getLastname());
		student.setGender(user.getGender());
		student.setDateOfBirth(user.getDateOfBirth());
		student.setPassword(user.getPassword());
		student.setCode(user.getCode());
		student.setActive(true);
		student.setRole(user.getRole());
		student.setUsername(user.getUsername());
		return student;
	}
	
	public static Guardian convertGuardian(User user){
		Guardian guardian = new Guardian();
		guardian.setFirstname(user.getFirstname());
		guardian.setLastname(user.getLastname());
		guardian.setGender(user.getGender());
		guardian.setDateOfBirth(user.getDateOfBirth());
		guardian.setPassword(user.getPassword());
		guardian.setCode(user.getCode());
		guardian.setActive(true);
		guardian.setRole(user.getRole());
		guardian.setUsername(user.getUsername());
		return guardian;
	}
}
