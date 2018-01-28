package net.murukai.studentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
import net.murukai.studentapp.convetor.SportCategoryConvetor;


@Controller
@RequestMapping("/manage")
public class AdminPageController {
	
	@Autowired
	private SportDao sportDao;
	
	@Autowired
	private LevelDao levelDao;
	
	@Autowired
	private StudentFormDao studentFormDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    binder.registerCustomEditor(SportCategory.class, new SportCategoryConvetor());
	}
	
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
	public ModelAndView department(@RequestParam(value="success", required=false) String success) {		
		ModelAndView mv = new ModelAndView("page");	
		if(success != null){
			if(success.equals("department")){
				mv.addObject("message", "successfully added department");
			}else{
				mv.addObject("message", "successfully added sport category");
			}
		}
		mv.addObject("title","Department");
		Department department = new Department();
		mv.addObject("department", department);
		mv.addObject("userClickAdminDepartment",true);
		return mv;				
	}	
	@RequestMapping(value = "/sport")
	public ModelAndView sport() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Sport");
		mv.addObject("userClickSport",true);
		
		return mv;				
	}	
	
	@RequestMapping(value = "/sport/category", method=RequestMethod.POST)
	public String sportCategory(@ModelAttribute("sportEvent") SportCategory sportCategory) {		
		sportDao.addSportCategory(sportCategory);
		return "redirect:/manage/add/sports?success=sportCategory";				
	}	
	
	@RequestMapping(value = "/accounts")
	public ModelAndView accounts() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Accounts");
		mv.addObject("userClickAccounts",true);
		
		return mv;				
	}	
	
	@RequestMapping(value = "/books")
	public ModelAndView books() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Books");
		mv.addObject("userClickBooks",true);
		
		return mv;				
	}	
	
	@RequestMapping(value = "/teachers")
	public ModelAndView teachers() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Teachers");
		mv.addObject("userClickTeachers",true);
		
		return mv;				
	}	
	
	@RequestMapping(value = "/levels")
	public ModelAndView editLevels(@RequestParam(value="success", required=false) String success) {		
		ModelAndView mv = new ModelAndView("page");		
		if(success != null){
			if(success.equals("studentForm")){
				mv.addObject("message", "successfully added class");
			}else{
				mv.addObject("message", "successfully added form");
			}
		}
		mv.addObject("title","Sport");
		StudentForm studentForm = new StudentForm();
		mv.addObject("studentForm", studentForm);
		Level level = new Level();
		mv.addObject("level", level);
		List<Level> levels = levelDao.list();
		List<Teacher> teachers = userDao.listActiveTeachers();
		if(levels.isEmpty()){
			Level dLevel = new Level();
			dLevel.setId(-1);
			dLevel.setName("No Levels Available");
		}
		mv.addObject("levels", levels);
		mv.addObject("teachers", teachers);
		mv.addObject("userClickedManageLevels", true);
		
		return mv;				
	}	
	
	@RequestMapping(value="/edit/{id}/studentForm")
	public ModelAndView editStudentForm(@PathVariable int id){
		ModelAndView mv = new ModelAndView("page");
		Level level = new Level();
		StudentForm studentForm = studentFormDao.get(id);
		mv.addObject("studentForm", studentForm);
		
		mv.addObject("userClickedManageLevels", true);
		List<Level> levels = levelDao.list();
		if(levels.isEmpty()){
			Level dLevel = new Level();
			dLevel.setId(-1);
			dLevel.setName("No Levels Available");
		}
		mv.addObject("level", level);
		mv.addObject("levels", levels);
		return mv;				
	}
	
	@RequestMapping(value = "/add/levels", method=RequestMethod.POST)
	public String submitLevel(@ModelAttribute("studentForm") StudentForm studentForm){
		
		Level level = levelDao.get(studentForm.getLevelId());
		studentForm.setLevelId(level.getId());
		System.out.println("Inside the submit sport");
		studentFormDao.add(studentForm);
		
		return "redirect:/manage/add/levels?success=studentForm";
	}
	
	@RequestMapping(value = "/studentForm/level", method=RequestMethod.POST)
	public String level(@ModelAttribute("level") Level level) {		
		levelDao.add(level);
		return "redirect:/manage/add/levels?success=level";				
	}
	
	@RequestMapping(value = "/add/sports")
	public ModelAndView addSport(@RequestParam(value="success", required=false) String success) {		
		ModelAndView mv = new ModelAndView("page");		
		if(success != null){
			if(success.equals("studentForm")){
				mv.addObject("message", "successfully added sport");
			}else{
				mv.addObject("message", "successfully added sport category");
			}
		}
		mv.addObject("title","Sport");
		SportEvent nSportEvent = new SportEvent();
		mv.addObject("sportEvent", nSportEvent);
		SportCategory sportCategory = new SportCategory();
		mv.addObject("sportCategory", sportCategory);
		List<SportCategory> categories = sportDao.listCategory();
		if(categories.isEmpty()){
			SportCategory dSportCategory = new SportCategory();
			dSportCategory.setId(-1);
			dSportCategory.setName("No Categories Available");
		}
		mv.addObject("categories", categories);
		mv.addObject("userClickedManageSports", true);
		return mv;				
	}	
	
	@RequestMapping(value="/edit/{id}/sport")
	public ModelAndView editSport(@PathVariable int id){
		ModelAndView mv = new ModelAndView("page");
		SportCategory sportCategory = new SportCategory();
		SportEvent sportEvent = sportDao.get(id);
		mv.addObject("sportEvent", sportEvent);
		System.out.println(sportEvent.getTime());
		mv.addObject("userClickedManageSports", true);
		List<SportCategory> categories = sportDao.listCategory();
		if(categories.isEmpty()){
			SportCategory dSportCategory = new SportCategory();
			dSportCategory.setId(-1);
			dSportCategory.setName("No Categories Available");
		}
		mv.addObject("sportCategory", sportCategory);
		mv.addObject("categories", categories);
		return mv;				
	}
	
	@RequestMapping(value = "/add/sports", method=RequestMethod.POST)
	public String submitSport(@ModelAttribute("sportEvent") SportEvent sportEvent){
		
		SportCategory sportCategory = sportDao.getCategory(sportEvent.getSportCategoryId());
		sportEvent.setSportCategoryId(sportCategory.getId());
		System.out.println("Inside the submit sport");
		sportDao.addSportEvent(sportEvent);
		
		return "redirect:/manage/add/sports?success=sport";
	}
	
	@RequestMapping(value = "/show/levels")
	public ModelAndView levels() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Forms");
		mv.addObject("levels", levelDao.list());
		mv.addObject("userClickLevels",true);
		return mv;				
	}
	
	@RequestMapping(value = "/show/{levelId}/studentforms")
	public ModelAndView studentForms(@PathVariable int levelId) {		
		ModelAndView mv = new ModelAndView("page");		
		
		mv.addObject("levels", levelDao.list());
		Level level = levelDao.get(levelId);
		mv.addObject("level", level);
		mv.addObject("title",level.getName());
		mv.addObject("userClickLevelForms",true);
		return mv;				
	}
	
	@RequestMapping(value = "/show/{studentFormId}/students")
	public ModelAndView classStudents(@PathVariable int studentFormId){
		ModelAndView mv = new ModelAndView("page");
		StudentForm studentForm = studentFormDao.get(studentFormId);
		mv.addObject("title", studentForm.getName());
		mv.addObject("studentForm", studentForm);
		mv.addObject("studentForms", studentFormDao.listByLevel(studentForm.getLevelId()));
		mv.addObject("userClickManageClassStudents", true);
		return mv;
	}
	
	@RequestMapping(value = "/show/{studentId}/student")
	public ModelAndView viewStudent(@PathVariable int studentId){
		ModelAndView mv = new ModelAndView("page");
		Student student = userDao.getStudent(studentId);
		if(student.getGender().equalsIgnoreCase("male")){
			mv.addObject("title", "Mr. " + student.getFirstname() + " - " + student.getLastname());
		}else{
			mv.addObject("title", "Ms. " + student.getFirstname() + " - " + student.getLastname());
		}
		Guardian guardian = userDao.getGuardian(student.getGuardianId());
		StudentForm studentForm = studentFormDao.get(student.getStudentFormId());
		mv.addObject("student", student);
		mv.addObject("guardian", guardian);
		mv.addObject("studentForm", studentForm);
		mv.addObject("userClickSingleStudent", true);
		return mv;
	}
	
	@RequestMapping(value="edit/teacher/personal", method=RequestMethod.POST)
	public String addTeacherProfile(@ModelAttribute("teacher") Teacher teacher){
		Teacher dTeacher = userDao.getTeacher(teacher.getId());
		dTeacher.setEcnumber(teacher.getEcnumber());
		dTeacher.setEmail(teacher.getEmail());
		dTeacher.setDateEnrolled(teacher.getDateEnrolled());
		dTeacher.setDepartmentId(teacher.getDepartmentId());
		dTeacher.setMaritalStatus(teacher.getMaritalStatus());
	
		userDao.update(dTeacher);
		return "redirect:/view/" + teacher.getId() + "/profile";
	}
	
	@RequestMapping(value="/department", method=RequestMethod.POST)
	public String addDepartment(@ModelAttribute("department") Department department){
		departmentDao.add(department);
		return "redirect:/manage/department?success=department";
	}
}
