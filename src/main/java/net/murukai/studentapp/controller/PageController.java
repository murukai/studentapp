package net.murukai.studentapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.murukai.stdrestapi.dao.DepartmentDao;
import net.murukai.stdrestapi.dao.SportDao;
import net.murukai.stdrestapi.dao.StudentFormDao;
import net.murukai.stdrestapi.dao.UserDao;
import net.murukai.stdrestapi.dto.Department;
import net.murukai.stdrestapi.dto.Guardian;
import net.murukai.stdrestapi.dto.SportEvent;
import net.murukai.stdrestapi.dto.Student;
import net.murukai.stdrestapi.dto.StudentForm;
import net.murukai.stdrestapi.dto.Teacher;
import net.murukai.stdrestapi.dto.User;
import net.murukai.studentapp.model.UserModel;

@Controller
public class PageController {
	
	@Autowired 
	private SportDao sportDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private StudentFormDao studentFormDao;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@RequestMapping( value = {"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "Home");
		model.addObject("userClickHome",true);
		return model;
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;				
	}	
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;				
	}	
	
	@RequestMapping(value = "/department")
	public ModelAndView department() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Department");
		mv.addObject("userClickDepartment",true);
		return mv;				
	}	
	@RequestMapping(value = "/sport")
	public ModelAndView sport() {		
		ModelAndView mv = new ModelAndView("page");	
		List<SportEvent> futureSports = new ArrayList<SportEvent>();
		try{
			futureSports = sportDao.listFuture();
		}catch(Exception e){
			
		}
		if(futureSports.isEmpty()){
			mv.addObject("sportTitle", "No Sporting events available!");
			mv.addObject("futureSportAvailable", false);
		}else{
			mv.addObject("futureSportAvailable", true);
			mv.addObject("futureSportEvent", futureSports);
		}
		
		
		//collecting past events
		List<SportEvent> pastSportEvent = new ArrayList<>();
		try{
			pastSportEvent = sportDao.listPast();
		}catch(Exception e){
			
		}
		
		if(pastSportEvent.isEmpty()){
			mv.addObject("sportTitle", "No Sporting events in the past available!");
			mv.addObject("pastSportAvailable", false);
		}else{
			mv.addObject("pastSportAvailable", true);
			mv.addObject("pastSportEvent", pastSportEvent);
		}
		
		mv.addObject("title","Sport");
		mv.addObject("userClickSport",true);
		return mv;				
	}	
	
	@RequestMapping(value = "/student")
	public ModelAndView students() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Students");
		mv.addObject("userClickStudent",true);
		return mv;				
	}	
	
	@RequestMapping(value = "/view/{userId}/profile")
	public ModelAndView profile(@PathVariable long userId) {		
		ModelAndView mv = new ModelAndView("page");		
		User user = userDao.get(userId);
		mv.addObject("user", user);
		mv.addObject("address", userDao.getAddress(user));
		if(user.getRole().equalsIgnoreCase("teacher")){
			Teacher teacher = userDao.getTeacher(userId);
			mv.addObject("teacher", teacher);
			mv.addObject("userClickTeacherProfile", true);
		}else if(user.getRole().equalsIgnoreCase("student")){
			Student student = userDao.getStudent(userId);
			mv.addObject("student", student);
			mv.addObject("userClickStudentProfile", true);
			List<StudentForm> studentForms = null;
			try{
				studentForms = studentFormDao.list();
			}catch(Exception e){
				
			}
			if(studentForms != null){
				mv.addObject("studentForms", studentForms);
			}
		}else{
			Guardian guardian = userDao.getGuardian(userId);
			mv.addObject("guardian", guardian);
			mv.addObject("userClickGuardianProfile", true);
			List<Student> students = null;
			try{
				students = userDao.listActiveStudents();
			}catch(Exception e){
				
			}
			if(students != null){
				mv.addObject("studentForms", students);
			}
		}
		mv.addObject("title","Profile");
		mv.addObject("userClickProfile",true);
		return mv;				
	}	
	
	@RequestMapping(value = "/login")
	public ModelAndView login(@RequestParam(value="error", required=false) String error,
			@RequestParam(value="logout", required=false) String logout) {		
		ModelAndView mv = new ModelAndView("login");		
		mv.addObject("title","Login");
		if(error!=null){
			mv.addObject("message", "Incorrect username and/ or password. If your are new please register otherwise contact the Administration");
		}
		if(logout!=null) {
			mv.addObject("logout", "You have logged out successfully!");
		}
		return mv;				
	}	
	
	@RequestMapping(value="/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		// Invalidates HTTP Session, then unbinds any objects bound to it.
	    // Removes the authentication from securitycontext 		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
		
		return "redirect:/login?logout";
	}	
	
	@RequestMapping(value = "/access-denied")
	public ModelAndView accessDenied() {		
		ModelAndView mv = new ModelAndView("error");		
		mv.addObject("title","403- Access denied");
		mv.addObject("errorTitle","Authority");
		mv.addObject("errorDescription","you are not authorised to access this page!");
		return mv;				
	}	
	
	@RequestMapping(value = "{id}/personal-details")
	public ModelAndView personal(@PathVariable long id) {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("userClickPersonalDetails",true);
		Teacher teacher = userDao.getTeacher(id);
		mv.addObject("teacher", teacher);
		List<Department> departments = new ArrayList<>();
		try{
			departments = departmentDao.list();
		}catch(Exception e){
			
		}
		
		Department department = new Department();
		
		mv.addObject("departments", departments);
		mv.addObject("department", department);
		
		return mv;				
	}	
	
	
}
