package net.murukai.studentapp.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import net.murukai.studentappbackend.dao.StudentFormDao;
import net.murukai.studentappbackend.dao.UserDao;
import net.murukai.studentappbackend.dto.Student;

@Path("/students")
@Produces(MediaType.APPLICATION_JSON)
public class StudentService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private StudentFormDao studentFormDao;
	
	@GET
	@Path("/all")
	public List<Student> getAllStudents(){
		return userDao.listStudents();
	}
	
	@GET
	@Path("/all-active")
	public List<Student> getAllActiveStudents(){
		return userDao.listActiveStudents();
	}
	
	@GET
	@Path("/all-active/{studentFormId}")
	public List<Student> getStudentByForm(@PathParam("studentFormId")String id){
		return userDao.listStudentsByForm(studentFormDao.get(Long.valueOf(id)));
	}
	
	@POST
	@Path("/all")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addStudent(Student student){
		userDao.addStudent(student);
	}
	
	@PUT
	@Path("/all")
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateStudent(Student student){
		userDao.updateStudent(student);
	}
	
	@DELETE
	@Path("/all-active")
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteStudent(Student student){
		userDao.updateStudent(student);
	}
}
