package net.murukai.studentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.murukai.stdrestapi.dao.DepartmentDao;
import net.murukai.stdrestapi.dao.LevelDao;
import net.murukai.stdrestapi.dao.SportDao;
import net.murukai.stdrestapi.dao.StudentFormDao;
import net.murukai.stdrestapi.dao.UserDao;
import net.murukai.stdrestapi.dto.Department;
import net.murukai.stdrestapi.dto.Guardian;
import net.murukai.stdrestapi.dto.Level;
import net.murukai.stdrestapi.dto.SportCategory;
import net.murukai.stdrestapi.dto.SportEvent;
import net.murukai.stdrestapi.dto.Student;
import net.murukai.stdrestapi.dto.StudentForm;
import net.murukai.stdrestapi.dto.Teacher;

@Controller
@RequestMapping("/json/data")
public class RestController {
	/*
	 * Students
	 */
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private StudentFormDao studentFormDao;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@Autowired
	private LevelDao levelDao;
	
	@Autowired
	private SportDao sportDao;

	
	@RequestMapping("/students")
	@ResponseBody
	public List<Student> getAllStudents(){
		return userDao.listActiveStudents();
	}
	
	@RequestMapping("/students/{studentFormId}")
	@ResponseBody
	public List<Student> getStudentByClass(@PathVariable int studentFormId){
	
		return userDao.listByFormId(studentFormId);
	}
	
	@RequestMapping(value = "/students", method=RequestMethod.POST)
	public void addStudent(@RequestBody Student student){
		userDao.addStudent(student);
	}
	
	@RequestMapping(value = "/students", method=RequestMethod.PUT)
	public void updateStudent(@RequestBody Student student){
		userDao.updateStudent(student);
	}
	
	@RequestMapping(value = "/students", method=RequestMethod.DELETE)
	public void deleteStudent(@RequestBody Student student){
		userDao.updateStudent(student);
	}
	
	/*
	 * Teachers
	 */
	@RequestMapping("/teachers")
	@ResponseBody
	public List<Teacher> getAllTeachers(){
		return userDao.listActiveTeachers();
	}
	
	@RequestMapping("/teachers/{departmentId}")
	@ResponseBody
	public List<Teacher> getTeacherByDepartment(@PathVariable int departmentId){
		
		return userDao.listByDepartment(departmentId);
	}
	
	@RequestMapping(value = "/teachers", method=RequestMethod.POST)
	public void addTeacher(@RequestBody Teacher teacher){
		userDao.addTeacher(teacher);
	}
	
	@RequestMapping(value = "/teachers", method=RequestMethod.PUT)
	public void updateTeacher(@RequestBody Teacher teacher){
		userDao.updateTeacher(teacher);
	}
	
	@RequestMapping(value = "/teachers", method=RequestMethod.DELETE)
	public void deleteTeacher(@RequestBody Teacher teacher){
		userDao.deleteTeacher(teacher);
	}
	
	/*
	 * Guardians
	 */
	@RequestMapping("/guardians")
	@ResponseBody
	public List<Guardian> getAllGuardians(){
		return userDao.listActiveGuardians();
	}
	
	@RequestMapping(value = "/guardians", method=RequestMethod.POST)
	public void addGuardian(@RequestBody Guardian guardian){
		userDao.addGuardian(guardian);
	}
	
	@RequestMapping(value = "/guardians", method=RequestMethod.PUT)
	public void updateGuardian(@RequestBody Guardian guardian){
		userDao.updateGuardian(guardian);
	}
	
	@RequestMapping(value = "/guardians", method=RequestMethod.DELETE)
	public void deleteGuardian(@RequestBody Guardian guardian){
		userDao.deleteGuardian(guardian);
	}
	
	/*
	 * Levels
	 */
	
	@RequestMapping("/levels")
	@ResponseBody
	public List<Level> getAllLevels(){
		return levelDao.list();
	}
	
	@RequestMapping(value = "/levels", method=RequestMethod.POST)
	public void addLevel(@RequestBody Level level){
		levelDao.add(level);
	}
	
	@RequestMapping(value = "/levels", method=RequestMethod.PUT)
	public void updateLevel(@RequestBody Level level){
		levelDao.update(level);
	}
	
	@RequestMapping(value = "/levels", method=RequestMethod.DELETE)
	public void deleteLevel(@RequestBody Level level){
		levelDao.delete(level);
	}
	
	/*
	 * StudentForms
	 */
	
	@RequestMapping("/levels/studentform")
	@ResponseBody
	public List<StudentForm> getStudentForms(){
		return studentFormDao.list();
	}
	
	@RequestMapping("/levels/{levelId}/studentforms")
	@ResponseBody
	public List<StudentForm> getStudentFormsByLevel(@PathVariable int levelId){
		
		return studentFormDao.listByLevel(levelId);
	}
	
	@RequestMapping(value = "/levels/studentform", method=RequestMethod.POST)
	public void addStudentForm(@RequestBody StudentForm studentForm){
		studentFormDao.add(studentForm);
	}
	
	@RequestMapping(value = "/levels/studentform", method=RequestMethod.PUT)
	public void updateStudentForm(@RequestBody StudentForm studentForm){
		studentFormDao.update(studentForm);
	}
	
	@RequestMapping(value = "/levels/studentform", method=RequestMethod.DELETE)
	public void deleteStudentForm(@RequestBody StudentForm studentForm){
		studentFormDao.delete(studentForm);
	}
	
	/*
	 * Sports
	 */
	
	@RequestMapping("/sports")
	@ResponseBody
	public List<SportEvent> getSportEvents(){
		return sportDao.listAll();
	}
	
	
	@RequestMapping("/sports/future")
	@ResponseBody
	public List<SportEvent> getFutureSportEvents(){
		return sportDao.listFuture();
	}
	
	@RequestMapping("/sports/past")
	@ResponseBody
	public List<SportEvent> getPastSportEvents(){
		return sportDao.listPast();
	}
	
	@RequestMapping("/sport/{sportCategoryId}/past")
	@ResponseBody
	public List<SportEvent> getPastEventsByCategory(@PathVariable int sportCategoryId){
	
		return sportDao.listPastByCategory(sportCategoryId);
	}
	@RequestMapping("/sport/{sportCategoryId}/future")
	@ResponseBody
	public List<SportEvent> getFutureByCategory(@PathVariable int sportCategoryId){
		
		return sportDao.listFutureByCategory(sportCategoryId);
	}
	
	
	@RequestMapping("/departments")
	@ResponseBody
	public List<Department> getDepartments(){
		return departmentDao.list();
	}
	/*
	 * Marks
	 */
	
	
}
